
package Model;

import View.NotaFiscal_GUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NotaFisall {
    public static  void NotaFiscal(){
       
        Date buscar = new Date(); 
        String nome3 = "", medico = "", remedio ="", quant = "",quant_compr = "", horas = "", compri = "", dias = "";
        String data = new SimpleDateFormat("dd/MM/yyyy").format(buscar);
        String hora_atual = new SimpleDateFormat("HH:mm:ss").format(buscar);
        
        nome3 = JOptionPane.showInputDialog(null, "Digite o nome do vendedor:");
   

        Document doc = null;
        OutputStream os = null;

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            try {
                //cria a stream de saÃ­da
                os = new FileOutputStream("C://users//Alunos//Downloads//RECEITUÁRIO_MÉDICO.pdf");
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
            Paragraph par2 = new Paragraph("---------------------------------------- ");
            Paragraph par3 = new Paragraph("CAIXA: " + nome3);
            Paragraph par4 = new Paragraph("DATA DO CAIXA: " + data);
            Paragraph par5 = new Paragraph("DATA DO CAIXA: " + hora_atual);
            Paragraph par6 = new Paragraph("VENDEDOR: " + nome3);
            Paragraph par7 = new Paragraph("---------------------------------------- ");
            Paragraph par8 = new Paragraph( remedio +" "+ quant + "mg "+ " _________________________ " + compri+ " comprimidos");
            Paragraph par9 = new Paragraph("Tomar " + quant_compr + "comprido(s), por via oral, a cada " + horas + " horas, por " + dias + " dias.");
            Paragraph par10 = new Paragraph(" ");
            Paragraph par11 = new Paragraph("São Paulo, " + data);
            Paragraph par12 = new Paragraph("_____________________________________________ ");
            Paragraph par13 = new Paragraph("            Assinatura do Profissional  ");
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
                doc.add(par11);
                doc.add(par12);
                doc.add(par13);
            } catch (DocumentException ex) {
                Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
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
        
        try {
            Desktop.getDesktop().open(new File("C://users//Alunos//Downloads//RECEITUÁRIO_MÉDICO.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(NotaFiscal_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
