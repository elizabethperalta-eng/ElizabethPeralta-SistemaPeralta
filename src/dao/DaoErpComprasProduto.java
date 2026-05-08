/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.ErpComprasProduto;
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
public class DaoErpComprasProduto {
    public void insert(Object object) {
        ErpComprasProduto erpComprasProduto = (ErpComprasProduto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_elizabeth_peralta";
            user = "elizabeth_peralta";
            password = "elizabeth_peralta";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Erp_usuarios values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, erpComprasProduto.getErpIdCompraProduto());
            pst.setInt(2,erpComprasProduto.getErpQuantidade());
            pst.setDouble(3, erpComprasProduto.getErpValorUnitario());
            pst.setDouble(4, erpComprasProduto.getErpDesconto());
            pst.setDouble(5, erpComprasProduto.getErpSubtotal());
            pst.setInt(6, erpComprasProduto.getErpCompras());
            pst.setInt(7, erpComprasProduto.getErpPProdutos());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}}
