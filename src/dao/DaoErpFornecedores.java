/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.ErpFornecedores;
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
public class DaoErpFornecedores {
    public void insert(Object object) {
        ErpFornecedores erpFornecedores = (ErpFornecedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_elizabeth_peralta";
            user = "elizabeth_peralta";
            password = "elizabeth_peralta";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Erp_usuarios values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setString(1, erpFornecedores.getErpCnpj());
            pst.setString(2, erpFornecedores.getErpRazaoSocial());
            pst.setString(3, erpFornecedores.getErpFantasia());
            pst.setString(4, erpFornecedores.getErpEmail());
            pst.setString(5, erpFornecedores.getErpTelefone());
            pst.setString(6, erpFornecedores.getErpEndereco());
            pst.setString(7, erpFornecedores.getErpIncricaoEstadual());
            pst.setString(8, erpFornecedores.getErpCep());
            pst.setString(9, erpFornecedores.getErpFormaPagamento());
            pst.setString(10, erpFornecedores.getErpNumero());
            pst.setString(11, erpFornecedores.getErpBairro());
            pst.setString(12, erpFornecedores.getErpCidade());
            pst.setString(13, erpFornecedores.getErpEstado());
            pst.setString(14, erpFornecedores.getErpContatoResponsavel());
            pst.setString(15, erpFornecedores.getErpAtivo());
            pst.setString(16, erpFornecedores.getErpIdFornecedores());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
