/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.CadastroCliente.cell;
import static Model.CadastroCliente.cell2;
import static Model.CadastroCliente.cpf;
import static Model.CadastroCliente.email;
import static Model.CadastroCliente.end;
import static Model.CadastroCliente.nome;
import static Model.CadastroCliente.password;
import static Model.CadastroCliente.url;
import static Model.CadastroCliente.username;
import static View.Cliente_GUI.cell2_1;
import static View.ConsultarClientes_GUI.cell1_2;
import static View.ConsultarClientes_GUI.cell2_2;
import static View.ConsultarClientes_GUI.cod2;
import static View.ConsultarClientes_GUI.cpf2;
import static View.ConsultarClientes_GUI.email2;
import static View.ConsultarClientes_GUI.end2;
import static View.ConsultarClientes_GUI.nome2;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Luís Felipe
 */
public class AlterarClientes {
    
     public static void Alterar(){
      nome = nome2.getText(); // recebendo o nome
      end = end2.getText(); // recebendo o email         
      cell = Long.valueOf(cell1_2.getText());// recebendo o telefone
      email = email2.getText();
      cell2 = Long.valueOf(cell2_2.getText());
      cpf = Integer.valueOf(cpf2.getText());
      

        
      try {     
            Connection con = null;
      try {
            con = (Connection) DriverManager.getConnection(url, username, password);
      }catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"ERROS005 - ERRO DE CONEXÃO");
      }
            String sql = "UPDATE cliente SET cli_nome='"+nome+"', cli_end='"+end+"', cli_cell='"+cell+"', cli_cell2='"+cell2+"', cli_cpf='"+cpf+"', cli_email='"+email+"' WHERE cli_cod="+cod2.getText();
            try { 
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserÃ§Ã£o

                JOptionPane.showMessageDialog(null,"\n alteração realizada com sucesso!!!\n","",-1);
                cod2.setText("");
                nome2.setText("");
                end2.setText("");
                cell1_2.setText("");
                cpf2.setText("");
                cell2_2.setText("");
                email2.setText("");

                 Model.Refresh.refresh();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario nÃ£o digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            cell1_2.setText("");
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            cell2_1.setText("");
        } 
      
      //refresh();
     }
}
