/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.CadastroCliente.password;
import static Model.CadastroCliente.username;
import static View.ConsultarClientes_GUI.cell1_2;
import static View.ConsultarClientes_GUI.cell2_2;
import static View.ConsultarClientes_GUI.cod2;
import static View.ConsultarClientes_GUI.cpf2;
import static View.ConsultarClientes_GUI.email2;
import static View.ConsultarClientes_GUI.end2;
import static View.ConsultarClientes_GUI.nome2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luís Felipe
 */
public class ConsultarClientes {
     public static String url3 = "jdbc:mysql://localhost:3306/supermercado";
     
    public static  void Consultar(){
         try{     
//Iniciando o possivel tratamento de erros
            //Declarando a variavel codigo
            int codigo = Integer.valueOf(cod2.getText());

            try {
// Tratamento de erro para a conexÃ£o
                // Declarando  a variavel de conexÃ£o con
                // e estabelendo a conexÃ£o
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url3, username, password);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"ERRO S003 - FALHA NA CONEXÃO");
    }

                // Declarando uma string com o comando mySQL para consulta
                String sql = "SELECT cli_nome,cli_end,cli_cell,cli_cell2,cli_cpf,cli_email FROM cliente where cli_cod = "+cod2.getText();

                // Criando variavel que executara o comando da string sql
                Statement stm = (Statement) con.createStatement();
                try{
	//Tratamento de erro da consulta
                	 //Criando variavel que exibira os resultados
                    	//Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberÃ£o os valores do banco de dados
                        String nome = rs.getString("cli_nome");
                        String endereco  = rs.getString("cli_end");
                        String celular = rs.getString("cli_cell");
                        String celular2 = rs.getString("cli_cell2");
                        String cpf = rs.getString("cli_cpf");  
                        String email = rs.getString("cli_email");                      

                        i++;

                        nome2.setText(String.valueOf(nome));
                        end2.setText(String.valueOf(endereco));
                        cell1_2.setText(String.valueOf(celular));
                        cell2_2.setText(String.valueOf(celular2));
                        cpf2.setText(String.valueOf(cpf));
                        email2.setText(String.valueOf(email));
                       
                        Model.Refresh.refresh();

                    }

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Dado não cadastrado","Resultado",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                }

            } catch (SQLException ex) {
                // ConexÃ£o com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // CÃ³digo fora do formato
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            cod2.setText("");
        }
    
    }
    
    public static DefaultTableModel  cliente(ResultSet rs) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
       // AS LINHAS ABAIXO SÃO REFERENTES AOS CAMPOS DA TABELA CLIENTE
            
            columnNames.addElement("Nome");
            columnNames.addElement("Endereço");
            columnNames.addElement("Celular");
            columnNames.addElement("Celular 2");
            columnNames.addElement("CPF");
            columnNames.addElement("Email");
            
            Vector rows = new Vector();
            while (rs.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
           return new DefaultTableModel(rows, columnNames);
       } catch (Exception e) {

           return null;
        }
        }
}
