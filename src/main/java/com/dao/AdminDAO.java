package com.dao;

import com.dto.AdminDTO;
import com.utils.SenhaUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO extends DAO {

    public AdminDAO() throws Exception {
        super();
    }

    //Cadastrar Admins
    public boolean cadastrarAdmin() {
        AdminDTO admin = new AdminDTO();

        String email = admin.getEmail();
        String senha = admin.getSenha();

        String sql = "INSERT INTO admin (email, senha) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, senha);

            int verificacao = pstmt.executeUpdate();

            if (verificacao > 0) {
                conn.commit();

                // Se a inserção foi bem-sucedida, commit e retorna true
                return true;

            } else {
                conn.rollback();

                // Se a inserção falhou, rollback e retorna false
                return false;
            }

        } catch (Exception e) {
            //Erro: faz rollback e retorna false
            return false;
        }

    }

    public boolean logarAdmin(AdminDTO adminDTO) throws Exception {

        String sql = """
        SELECT
            senha
        FROM
            admin
        WHERE
            email = ?
        """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, adminDTO.getEmail());

            try (ResultSet rs = pstmt.executeQuery()) {

                if (!rs.next()) {
                    conn.rollback();
                    return false;
                }

                String senhaHash = rs.getString("senha");

                boolean ok = SenhaUtils.comparar(adminDTO.getSenha(), senhaHash);

                if (ok) {
                    conn.commit();
                    return true;
                }

                conn.rollback();
                return false;
            }
        }
    }



}
