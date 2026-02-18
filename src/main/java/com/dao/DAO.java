package com.dao;

// Classe abstrata utilizada para criar conexões com o banco de dados e encerrá-las automaticamente quando o bloco try é ncerrado (AutoCloseable)

import com.database.Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO implements AutoCloseable {

    protected static final Conexao conexao = new Conexao();
    protected Connection conn;

    protected DAO() throws SQLException{
        conn = conexao.conectar();
        conn.setAutoCommit(false);
    }

    @Override
    public void close(){
        conexao.desconectar(conn);
    }
}
