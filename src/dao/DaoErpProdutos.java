/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.ErpProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author u10716099128
 */
public class DaoErpProdutos {
    public void insert(Object object) {
        ErpProdutos erpProdutos = (ErpProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_elizabeth_peralta";
            user = "elizabeth_peralta";
            password = "elizabeth_peralta";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Erp_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, erpProdutos.getErpIdProduto());
            pst.setString (2,erpProdutos.getErpTitulo());
            pst.setString(3, erpProdutos.getErpAutor());
            pst.setString(4, erpProdutos.getErpEditora());
            pst.setInt(5, erpProdutos.getErpTradutor());
            pst.setString(6, erpProdutos.getErpCategoria());
            pst.setString(7, erpProdutos.getErpIsbn());
            pst.setDouble(8, erpProdutos.getErpPreco());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}}
