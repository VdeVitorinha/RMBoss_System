package Conexao;

import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pompe
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        //armazena informações
        String url = "jdbc:mysql://localhost:3306/banquinho";
        String usuario = "root";
        String senha = "S3nh@";
        //estabelecer conexao
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
