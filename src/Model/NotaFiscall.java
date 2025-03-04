
package Model;

import static Model.CadastroCliente.cpf;
import static Model.CadastroCliente.password;
import static Model.CadastroCliente.url;
import static Model.CadastroCliente.username;
import View.NotaFiscal_GUI;
import static View.NotaFiscal_GUI.cliente3;
import static View.NotaFiscal_GUI.cpf3;
import static View.NotaFiscal_GUI.metodo3;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NotaFiscall {
    public static String metodo;
    public static String vendedor;
    public static String cliente;
    public static double valorDinheiro;
    public static double valorTroco;
    public static String data;
    public static String hora_atual;
    
    
    public static  void NotaFiscal() throws DocumentException, ParseException{
       
        Date buscar = new Date(); 
        String[] produtos = new String[100];
        int[] quantidades = new int[100];
        double[] valoresIndividuais = new double[100];
        double[] valoresTotais = new double[100];
        String produto;
        int contador = 0;
        valorDinheiro = 0.0;
        valorTroco = 0.0;
        cliente = cliente3.getText();
        metodo = metodo3.getSelectedItem().toString();
        cpf = Long.valueOf(cpf3.getText());

        
        
           Date d = new Date();
         DateFormat data2 = new SimpleDateFormat("yyyy-MM-dd");
         java.sql.Date dataSql = new java.sql.Date(d.getTime());

   
        hora_atual = new SimpleDateFormat("HH:mm:ss").format(buscar);
        
        vendedor = JOptionPane.showInputDialog(null, "Digite o nome do vendedor:");
        
         while (true) {
            produto = JOptionPane.showInputDialog("Digite o nome do produto (ou '0' para encerrar):");

            if ("0".equals(produto)) {
                break;
            }

            produtos[contador] = produto;

            String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade:");
            int quantidade = Integer.parseInt(quantidadeStr);
            quantidades[contador] = quantidade;

            String valorIndividualStr = JOptionPane.showInputDialog("Digite o valor individual:");
            double valorIndividual = Double.parseDouble(valorIndividualStr);
            valoresIndividuais[contador] = valorIndividual;

            valoresTotais[contador] = quantidade * valorIndividual;

            contador++;
        }
         
        String valor = JOptionPane.showInputDialog(null, "Digite o valor pago:");
        valorDinheiro = Double.parseDouble(valor);
        

        Document doc = null;
        OutputStream os = null;

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            try {
                //cria a stream de saÃ­da
                os = new FileOutputStream("C://Users//jocem//Downloads//NOTA_FISCAL.pdf");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                //associa a stream de saÃ­da ao
                PdfWriter.getInstance(doc, os);
            } catch (DocumentException ex) {
                Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("SUPERMARKET");
            Paragraph par2 = new Paragraph("NOTA FISCAL");
            Paragraph par3 = new Paragraph("---------------------------------------- ");
            Paragraph par4 = new Paragraph("CAIXA: " + vendedor);
            Paragraph par5 = new Paragraph("DATA DA COMPRA: " + data);
            Paragraph par6 = new Paragraph("HORA DA COMPRA: " + hora_atual);
            Paragraph par7 = new Paragraph("VENDEDOR: " + vendedor);
            Paragraph par8 = new Paragraph("");
            Paragraph par9 = new Paragraph("COMPRADOR: " + cliente);
            Paragraph par10 = new Paragraph(" -------------------------------------------------------------------------------- ");
             
            try {
                doc.add(par);
                doc.add(par2);
                doc.add(par3);
                doc.add(par4);
                doc.add(par5);
                doc.add(par6);
                doc.add(par7);
                doc.add(par8);
                doc.add(par9);
                doc.add(par10);

            } catch (DocumentException ex) {
                Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             double totalGeral = 0.0;
            
            for (int i = 0; i < contador; i++) {
                String linha =  produtos[i] + " | Quant: " + quantidades[i] + " | Valor Unit: " + valoresIndividuais[i] + " | Valor Total: " + valoresTotais[i];
                Paragraph paragrafo = new Paragraph(linha);
                
                
                doc.add(paragrafo);
                
                totalGeral += valoresTotais[i];
            }
            
            Paragraph paragrafo2 = new Paragraph(" -------------------------------------------------------------------------------- ");
            doc.add(paragrafo2);
            // Total geral
            Paragraph total = new Paragraph("Total Geral: " + totalGeral);

            doc.add(total);
            
            if (metodo.equals("Dinheiro")){
            valorTroco = valorDinheiro - totalGeral;
            Paragraph pagamento = new Paragraph("Valor Entregue: " + valorDinheiro);
            Paragraph troco = new Paragraph("Valor do Troco: " + valorTroco);
              doc.add(pagamento);
              doc.add(troco);
            }
            
             //inicio
                Model.ConectaDriver_DB.carregaDriver();

        
        try {
            Connection con = null;

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERRO S002 - Usuário, Senha ou Endereço incorreto." );

            }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO venda (ven_nome_cli, ven_nome_vend, ven_data, ven_hora, ven_cpf_cli, ven_forma_pag, ven_total) values('"+cliente+"','"+vendedor+"','"+dataSql+"','"+hora_atual+"','"+cpf+"','"+metodo+"','"+totalGeral+"')";

            try { // Tratamento de Erros para inserÃ§Ã£o

                // Criando varialvel que executara a inserÃ§Ã£o
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserÃ§Ã£o

                JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                cliente3.setText("");
                cpf3.setText("");
                metodo3.setSelectedItem("");
                
  
         
                Model.Refresh.refresh();
                //fim do cadastro
                
            } catch (SQLException ex) {
             ex.printStackTrace(); // Isso imprimirá a pilha de exceção no console
           JOptionPane.showMessageDialog(null, "Erro na inserção: " + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
          }


        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario nÃ£o digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente", "erro",0);
            cpf3.setText("");

        }
 

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
               
                Model.Refresh.refresh();
            }

            if (os != null) {
                try {
                    //fechamento da stream de saÃ­da
                    os.close();
                } catch (IOException ex) {
                    Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //"C://users//Alunos//Downloads//NOTA_FISCAL.pdf"
        try {
            Desktop.getDesktop().open(new File("C://Users//jocem//Downloads//NOTA_FISCAL.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
