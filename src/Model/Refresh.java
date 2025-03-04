/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.CadastroCliente.password;
import static Model.CadastroCliente.username;
import static Model.ConsultarClientes.cliente;
import static Model.VendaConsultar.venda;
import static View.ConsultarClientes_GUI.Tabela_Cliente;
import static View.VendasConsultar_GUI.Tabela_Vendas;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Luís Felipe
 */
public class Refresh {
       
       public static String url2 = "jdbc:mysql://localhost:3306/supermercado";
    
       public static void refresh(){
     
      try{
          com.mysql.jdbc.Connection conn;
          conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url2, username, password);
          System.out.println("realizado");
          String sql = "SELECT * FROM cliente;";
          PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
          ResultSet rs = pst.executeQuery();
          Tabela_Cliente.setModel(cliente(rs));
       }
      catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }    
    
      try{
          com.mysql.jdbc.Connection conn;
          conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url2, username, password);
          System.out.println("realizado");
          String sql = "SELECT * FROM venda;";
          PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
          ResultSet rs = pst.executeQuery();
          Tabela_Vendas.setModel(venda(rs));
       }
      catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }    
      }
       
      
}
