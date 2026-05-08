/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.ErpClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author u11051489121
 */
public class DaoErpClientes extends DaoAbstract{
    @Override
    public void insert(Object object) {
        ErpClientes erpClientes = (ErpClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_elizabeth_peralta";
            user = "elizabeth_peralta";
            password = "elizabeth_peralta";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Erp_usuarios values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, erpClientes.getErpIdCliente());
            pst.setString(2, erpClientes.getErpNome());
            pst.setString(3, erpClientes.getErpApelido());
            pst.setString(4, erpClientes.getErpCpf());
            pst.setDate(6, null);
            pst.setString(5, erpClientes.getErpNumero());
            pst.setString(7, erpClientes.getErpEndereco());
            pst.setString(8, erpClientes.getErpEmaill());
            pst.setString(9, erpClientes.getErpTelefone());
            pst.setString(10, erpClientes.getErpRg());
            pst.setString(11, erpClientes.getErpCep());
            pst.setString(12, erpClientes.getErpCidade());
            pst.setString(13, erpClientes.getErpEstado());
            pst.setString(14, erpClientes.getErpBairro());
            pst.setString(15, erpClientes.getErpAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

@Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
    }

    @Override
    public Object list(int id) {

        return null;

    }

    @Override
    public Object listAll() {

        return null;

    }
}

