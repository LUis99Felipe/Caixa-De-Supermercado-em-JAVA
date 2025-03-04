/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static View.Cliente_GUI.cell1_1;
import static View.Cliente_GUI.cell2_1;
import static View.Cliente_GUI.cpf1;
import static View.Cliente_GUI.email1;
import static View.Cliente_GUI.end1;
import static View.Cliente_GUI.nome1;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.time.zone.ZoneRulesProvider.refresh;
import javax.swing.JOptionPane;



public class CadastroCliente {

    public static String url = "jdbc:mysql://localhost:3306/supermercado"; // endereço do BD
    public static String username = "root";        //nome de um usuário de seu BD
    public static String password = "luis5624";  // senha do BD
     
     public static String nome;
     public static String end;
     public static String email;
     public static long cell;
     public static long cell2;
     public static long cpf;
     
    public static  void Cadastro(){
        nome = nome1.getText(); // recebendo o nome
        end = end1.getText(); // recebendo o email
        cell = Long.valueOf(cell1_1.getText());// recebendo o telefone
        email = email1.getText();
        cpf = Long.valueOf(cpf1.getText());
        cell2 = Long.valueOf(cell2_1.getText());
    
        

        Model.ConectaDriver_DB.carregaDriver();
        
        try {
            Connection con = null;

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERRO S002 - Usuário, Senha ou Endereço incorreto." );

            }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO cliente(cli_nome,cli_end,cli_cell,cli_cell2,cli_cpf,cli_email) values('"+nome+"','"+end+"','"+cell+"','"+cell2+"','"+cpf+"','"+email+"')";

            try { // Tratamento de Erros para inserÃ§Ã£o

                // Criando varialvel que executara a inserÃ§Ã£o
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserÃ§Ã£o

                JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome1.setText("");
                end1.setText("");
                cell1_1.setText("");
                cpf1.setText("");
                cell2_1.setText("");
                email1.setText("");
                
  
         
                Model.Refresh.refresh();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
                Model.Refresh.refresh();
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario nÃ£o digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente", "erro",0);
            cell1_1.setText("");
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente", "erro",0);
            cell2_1.setText("");
        }
    }
}
