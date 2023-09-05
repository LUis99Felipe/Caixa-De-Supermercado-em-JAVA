
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Splash_GUI extends javax.swing.JFrame {


    public Splash_GUI() {
        initComponents();
        
        //------> inicio
                new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        barra.setValue(i);
                        
                        if(barra.getValue() == 10){
                        
                            texto.setText("Fazendo a conexao com o banco de dados");
                            sleep(2000);
                                                       
                        
                        }else if (barra.getValue() <=30){
                            texto.setText("Carregando o sistema");
                            sleep(100);  
                        }else if (barra.getValue() <=99){
                            texto.setText("Carregamento quase completo");  
                        }else{
                            texto.setText("Carregamento completo. Seu programa sera iniciado.");
                        
                        sleep(3000);
                        
                        int cont = 2;
                           

                        new Tela_GUI().setVisible(true);
                        dispose();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
           
         }        
         }
        
        }.start();
        
    }
        //------> final

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JProgressBar();
        texto = new org.edisoncor.gui.label.LabelMetric();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        barra.setForeground(new java.awt.Color(51, 51, 51));
        barra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(barra);
        barra.setBounds(0, 260, 480, 30);

        texto.setBackground(new java.awt.Color(255, 255, 255));
        texto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(texto);
        texto.setBounds(40, 300, 400, 30);

        panelImage2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SPLASHH.jpg"))); // NOI18N
        panelImage2.setLayout(null);

        labelCustom1.setBackground(new java.awt.Color(0, 153, 153));
        labelCustom1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelCustom1.setText("SUPERMARKET");
        labelCustom1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        panelImage2.add(labelCustom1);
        labelCustom1.setBounds(0, 0, 480, 40);

        jPanel1.add(panelImage2);
        panelImage2.setBounds(0, 0, 480, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(480, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar barra;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.label.LabelMetric texto;
    // End of variables declaration//GEN-END:variables
}
