/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author u10716099128
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //102
           // Statement stm = cnt.createStatement();
            //stm.executeUpdate("insert into mpv_usuarios(mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf) values(102,'Elizabeth','erp','10899823409')");
           //   String sql = "update mpv_usuarios set mpv_nome=?," 
           //        + "mpv_apelido=?,mpv_cpf= ? "
           //              + "where mpv_idusuarios=?";
            String sql = "delete from mpv_usuarios where mpv_idusuarios=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, 102);
//            pst.setString(1, "Elizabeth beth");
//            pst.setString(2, "beth");
//            pst.setString(3, "090197");
              pst.executeUpdate();
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("rodou");
        
    }
}

