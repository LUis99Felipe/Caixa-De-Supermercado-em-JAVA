/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.CadastroCliente.password;
import static Model.CadastroCliente.username;
import static Model.ConsultarClientes.url3;
import static View.VendasConsultar_GUI.cliente4;
import static View.VendasConsultar_GUI.cod4;
import static View.VendasConsultar_GUI.cpf4;
import static View.VendasConsultar_GUI.data4;
import static View.VendasConsultar_GUI.hora4;
import static View.VendasConsultar_GUI.metodo4;
import static View.VendasConsultar_GUI.total4;
import static View.VendasConsultar_GUI.vendedor4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luís Felipe
 */
public class VendaConsultar {
    public static  void Consultar(){
         try{     
//Iniciando o possivel tratamento de erros
            //Declarando a variavel codigo
            int codigo = Integer.valueOf(cod4.getText());

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
                String sql = "SELECT ven_nome_cli,ven_nome_vend,ven_data,ven_hora,ven_cpf_cli,ven_forma_pag,ven_total FROM venda where ven_cod = "+cod4.getText();

                // Criando variavel que executara o comando da string sql
                Statement stm = (Statement) con.createStatement();
                try{
	//Tratamento de erro da consulta
                	 //Criando variavel que exibira os resultados
                    	//Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberÃ£o os valores do banco de dados
                       
                       String nomeCli = rs.getString("ven_nome_cli");
                       String nomeVend = rs.getString("ven_nome_vend");
                       String data = rs.getString("ven_data");
                       String hora = rs.getString("ven_hora");
                       String cpfCli = rs.getString("ven_cpf_cli");
                       String formaPag = rs.getString("ven_forma_pag");
                       String total = rs.getString("ven_total");

                     // Configurando os campos de texto correspondentes
                         cliente4.setText(String.valueOf(nomeCli));
                         vendedor4.setText(String.valueOf(nomeVend));
                         data4.setText(String.valueOf(data));
                         hora4.setText(String.valueOf(hora));
                         cpf4.setText(String.valueOf(cpfCli));
                         metodo4.setText(String.valueOf(formaPag));
                         total4.setText(String.valueOf(total));

                         i++;
                       
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
            cod4.setText("");
        }
    
    }
    
    public static DefaultTableModel  venda(ResultSet rs) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
       // AS LINHAS ABAIXO SÃO REFERENTES AOS CAMPOS DA TABELA CLIENTE
            columnNames.addElement("Código");
            columnNames.addElement("Nome do Cliente");
            columnNames.addElement("Nome do Vendedor");
            columnNames.addElement("Data da Venda");
            columnNames.addElement("Hora da Venda");
            columnNames.addElement("CPF do Cliente");
            columnNames.addElement("Forma de Pagamento");
            columnNames.addElement("Total da Venda");

            
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
