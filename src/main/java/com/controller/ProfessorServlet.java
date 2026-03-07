package com.controller;

import com.dao.ProfessorDAO;
import com.dto.ProfessorDTO;
import com.exception.ExcecaoDeJSP;
import com.model.Professor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@WebServlet("/professores")
public class ProfessorServlet extends HttpServlet {

    private static final String PAGINA_PRINCIPAL = "/jsp/admin/professores.jsp";
    private static final String PAGINA_CADASTRO = "/jsp/admin/professores-adicionar.jsp";
    private static final String PAGINA_EDICAO = "/jsp/admin/professores-editar.jsp";
    private static final String CONTA_PROFESSOR = "/jsp/portal-professor/conta.jsp";
    private static final String PAGINA_ERRO = "/html/erro.html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action").trim();
        boolean erro = true;
        String destino = null;
        try {
            switch(action) {
                case "read" -> {
                    List<ProfessorDTO> professores = listar(req);
                    req.setAttribute("professores", professores);
                    destino = PAGINA_PRINCIPAL;
                }

                case "update" -> {
                    ProfessorDTO professor = pesquisarPorId(req);
                    req.setAttribute("professor", professor);
                    destino = PAGINA_EDICAO;
                }

                case "create" -> destino = PAGINA_CADASTRO;

            }

            erro = false;
        } catch (SQLException e) {
            System.err.println("Erro ao executar operação no banco:");
            e.printStackTrace(System.err);

        } catch (ClassNotFoundException e) {
            System.err.println("Falha ao carregar o driver postgresql:");
            e.printStackTrace(System.err);

        } catch (Throwable e) {
            System.err.println("Erro inesperado:");
            e.printStackTrace(System.err);
        }

        if (erro) {
            resp.sendRedirect(req.getContextPath() + PAGINA_ERRO);

        } else {
            req.getRequestDispatcher(PAGINA_PRINCIPAL).forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action").trim();
        String usuario = req.getParameter("usuario").trim();

        String destino = PAGINA_ERRO;

        try {
            switch (action) {
                case "create" -> cadastrar(req);
                case "update" -> {
                    if (usuario.equals("professor")) {
                        atualizarSenha(req);
                        destino = CONTA_PROFESSOR;
                    }
                }
                case "delete" -> deletar(req);
                default -> throw new RuntimeException("valor inválido para o parâmetro 'action': " + action);
            }



        }
        // Se houver alguma exceção de JSP, aciona o método doGet
        catch (ExcecaoDeJSP e) {
            req.setAttribute("erro", e.getMessage());
            doGet(req, resp);
            return;

        } catch (SQLException e) {
            System.err.println("Erro ao executar operação no banco:");
            e.printStackTrace(System.err);

        } catch (ClassNotFoundException e) {
            System.err.println("Falha ao carregar o driver postgresql:");
            e.printStackTrace(System.err);

        } catch (Throwable e) {
            System.err.println("Erro inesperado:");
            e.printStackTrace(System.err);
        }

        resp.sendRedirect(req.getContextPath() + destino);
    }

    public void cadastrar(HttpServletRequest req) throws SQLException, ClassNotFoundException, ExcecaoDeJSP{
        String nome = req.getParameter("nome").trim();
        String username = req.getParameter("username").trim();
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        Professor professor = new Professor(nome, username, email, senha);

        try (ProfessorDAO dao = new ProfessorDAO()) {
            dao.cadastrar(professor);
        }
    }

    public void atualizarSenha(HttpServletRequest req) throws SQLException, ClassNotFoundException, ExcecaoDeJSP{
        HttpSession session = req.getSession();

        String email = req.getParameter("email").trim();

        String senhaAtual = req.getParameter("senha_atual");
        senhaAtual = (senhaAtual.isBlank() ? null : senhaAtual.trim());

        String novaSenha = req.getParameter("nova_senha");
        novaSenha = (novaSenha.isBlank() ? null : novaSenha.trim());

        try (ProfessorDAO dao = new ProfessorDAO()) {
            dao.atualizarSenhaProfessor(email, senhaAtual, novaSenha);
        }
    }

    public List<ProfessorDTO> listar(HttpServletRequest req) throws SQLException, ClassNotFoundException{
        try (ProfessorDAO dao = new ProfessorDAO()) {
            return dao.listar();
        }
    }

    public void deletar(HttpServletRequest req) throws SQLException, ClassNotFoundException{
        String temp = req.getParameter("id");
        UUID id = UUID.fromString(temp.trim());

        try (ProfessorDAO dao = new ProfessorDAO()) {
            dao.deletar(id);
        }
    }

    public ProfessorDTO pesquisarPorId(HttpServletRequest req) throws SQLException, ClassNotFoundException{
        String temp = req.getParameter("id");
        UUID id = UUID.fromString(temp.trim());

        try (ProfessorDAO dao = new ProfessorDAO()) {
            return dao.pesquisarPorId(id);
        }
    }
}
