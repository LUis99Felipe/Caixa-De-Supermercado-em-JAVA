/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Luís Felipe
 */
public class ConsultarClientes_GUI extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarClientes_GUI
     */
    public ConsultarClientes_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cpf2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nome2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        end2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cod2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cell1_2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cell2_2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_Cliente = new javax.swing.JTable();
        buttonSeven10 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven11 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven12 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 480));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR e ALTERAR (Clientes)");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 20, 400, 30);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CPF:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 50, 60, 20);

        cpf2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cpf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf2ActionPerformed(evt);
            }
        });
        jPanel2.add(cpf2);
        cpf2.setBounds(100, 50, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nome do Cliente:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 20, 110, 20);

        nome2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome2ActionPerformed(evt);
            }
        });
        jPanel2.add(nome2);
        nome2.setBounds(380, 20, 80, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Endereço:");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(230, 50, 70, 20);

        end2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        end2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end2ActionPerformed(evt);
            }
        });
        jPanel2.add(end2);
        end2.setBounds(310, 50, 120, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CÓDIGO do Cliente:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 20, 130, 20);

        cod2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod2ActionPerformed(evt);
            }
        });
        jPanel2.add(cod2);
        cod2.setBounds(170, 20, 50, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 100, 470, 90);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contatos do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        cell1_2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cell1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell1_2ActionPerformed(evt);
            }
        });
        jPanel3.add(cell1_2);
        cell1_2.setBounds(80, 20, 110, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cell 1:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 20, 50, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("E-mail:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 50, 50, 20);

        email2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2ActionPerformed(evt);
            }
        });
        jPanel3.add(email2);
        email2.setBounds(80, 50, 110, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cell 2:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel11);
        jLabel11.setBounds(210, 20, 50, 20);

        cell2_2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cell2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell2_2ActionPerformed(evt);
            }
        });
        jPanel3.add(cell2_2);
        cell2_2.setBounds(280, 20, 110, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 200, 400, 80);

        Tabela_Cliente.setForeground(new java.awt.Color(0, 153, 153));
        Tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabela_Cliente);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 300, 470, 140);

        buttonSeven10.setBackground(new java.awt.Color(0, 102, 102));
        buttonSeven10.setText("ALTERAR");
        buttonSeven10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonSeven10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven10ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSeven10);
        buttonSeven10.setBounds(510, 220, 100, 30);

        buttonSeven11.setBackground(new java.awt.Color(255, 204, 102));
        buttonSeven11.setText("Voltar");
        buttonSeven11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven11ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSeven11);
        buttonSeven11.setBounds(550, 400, 80, 30);

        buttonSeven12.setBackground(new java.awt.Color(0, 51, 51));
        buttonSeven12.setText("CONSULTAR");
        buttonSeven12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonSeven12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven12ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSeven12);
        buttonSeven12.setBounds(510, 170, 100, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Digite o código do cliente para consultar e alterar os dados:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 50, 450, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(648, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf2ActionPerformed

    private void nome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome2ActionPerformed

    private void end2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end2ActionPerformed

    private void cell1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell1_2ActionPerformed

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void cell2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell2_2ActionPerformed

    private void buttonSeven10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven10ActionPerformed
        Model.AlterarClientes.Alterar();
    }//GEN-LAST:event_buttonSeven10ActionPerformed

    private void buttonSeven11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven11ActionPerformed
                this.dispose();
        new Tela_GUI().setVisible(true);
    }//GEN-LAST:event_buttonSeven11ActionPerformed

    private void buttonSeven12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven12ActionPerformed
        Model.ConsultarClientes.Consultar();
    }//GEN-LAST:event_buttonSeven12ActionPerformed

    private void cod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarClientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarClientes_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tabela_Cliente;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven10;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven11;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven12;
    public static javax.swing.JTextField cell1_2;
    public static javax.swing.JTextField cell2_2;
    public static javax.swing.JTextField cod2;
    public static javax.swing.JTextField cpf2;
    public static javax.swing.JTextField email2;
    public static javax.swing.JTextField end2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField nome2;
    // End of variables declaration//GEN-END:variables
}
