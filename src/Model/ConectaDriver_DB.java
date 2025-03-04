
package Model;

import javax.swing.JOptionPane;

public class ConectaDriver_DB {
    public static  void carregaDriver(){
       try { // Conecttando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Banco de dados carregado com sucesso!");




       } catch (Exception ex) { // Erro driver não encontrado
           JOptionPane.showMessageDialog(null,"ERRO S001\nNão possui Banco de Dados\nContate o Suporte");
        }

    }

    
}
