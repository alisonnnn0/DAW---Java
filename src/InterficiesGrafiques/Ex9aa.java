
package InterficiesGrafiques;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Ex9aa extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ex9aa.class.getName());

    DefaultListModel<String> modelLista = new DefaultListModel<>();
    
    public Ex9aa() {
        initComponents();
        jListDades.setModel(modelLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldClient = new javax.swing.JTextField();
        jLabelEstat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuantitat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProducte = new javax.swing.JComboBox<>();
        jCheckBoxUrgent = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNou = new javax.swing.JTextField();
        jButtonAfegir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDades = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAfegirLlista = new javax.swing.JButton();
        jButtonEliminarLlista = new javax.swing.JButton();
        jButtonPassarTaula = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonResum = new javax.swing.JButton();
        jButtonNetejar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResum = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Client: ");

        jLabelEstat.setText("Estat: Cap producte a la taula - Total unitats: 0");

        jLabel3.setText("Producte: ");

        jTextFieldQuantitat.addActionListener(this::jTextFieldQuantitatActionPerformed);

        jLabel4.setText("Quantitat: ");

        jComboBoxProducte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portàtil", "Ratolí", "Teclat", "Monitor", "Impressora" }));

        jCheckBoxUrgent.setText("Urgent");

        jLabel5.setText("Nou producte:");

        jButtonAfegir.setText("Afegir producte");
        jButtonAfegir.addActionListener(this::jButtonAfegirActionPerformed);

        jScrollPane1.setViewportView(jListDades);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client", "Producte", "Quantitat", "Urgent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonAfegirLlista.setText("Afefgir a la llista");
        jButtonAfegirLlista.addActionListener(this::jButtonAfegirLlistaActionPerformed);

        jButtonEliminarLlista.setText("Eliminar llista");

        jButtonPassarTaula.setText("Passar a taula");

        jButtonEliminar.setText("Eliminar fila");

        jButtonResum.setText("Resum");

        jButtonNetejar.setText("Netejar");

        jTextAreaResum.setColumns(20);
        jTextAreaResum.setRows(5);
        jScrollPane3.setViewportView(jTextAreaResum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNou))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldClient, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProducte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelEstat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(2, 2, 2)
                                        .addComponent(jTextFieldQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxUrgent))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jButtonAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAfegirLlista, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarLlista, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPassarTaula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNetejar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxProducte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxUrgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAfegir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAfegirLlista)
                    .addComponent(jButtonEliminarLlista)
                    .addComponent(jButtonPassarTaula)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonResum)
                    .addComponent(jButtonNetejar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantitatActionPerformed

    private void jButtonAfegirLlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfegirLlistaActionPerformed
        llista();
    }//GEN-LAST:event_jButtonAfegirLlistaActionPerformed

    private void jButtonAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfegirActionPerformed
        afegirProducte();
    }//GEN-LAST:event_jButtonAfegirActionPerformed

    private void afegirProducte(){
        
        String producte = jTextFieldNou.getText().trim();
        
        if (!producte.isEmpty()) {
            
            jComboBoxProducte.addItem(producte);
            jTextFieldNou.setText("");
            
            jComboBoxProducte.setSelectedItem(producte);
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Has d`escriure un producte nou", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void llista() {
        
        String client = jTextFieldClient.getText().trim();
        String quantitat = jTextFieldQuantitat.getText().trim();
        boolean urgent = jCheckBoxUrgent.isSelected();
        int index = jComboBoxProducte.getSelectedIndex();
        String producte = jComboBoxProducte.getItemAt(index);
        
        boolean valid = true;
        String errores = "";
        
        if (client.isEmpty()) {
            
            errores += "Client no pot estar buit. \n";
            valid = false;
        }
        if (quantitat.isEmpty()) {
            
            errores += "Quantitat no pot estar buit. \n";
            valid = false;
        }
        
        if (valid) {
            
            String esUrgent = urgent ? "Urgent" : "Normal";
            String fin = client + " - " + producte + " - Quantitat: " + quantitat + " - " + esUrgent;
            
            modelLista.addElement(fin);
            
            jTextFieldClient.setText("");
            jTextFieldQuantitat.setText("");
            jComboBoxProducte.setSelectedIndex(0);
            jCheckBoxUrgent.setSelected(false);
            
        } else {
            
            JOptionPane.showMessageDialog(this, errores, "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Ex9aa().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAfegir;
    private javax.swing.JButton jButtonAfegirLlista;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminarLlista;
    private javax.swing.JButton jButtonNetejar;
    private javax.swing.JButton jButtonPassarTaula;
    private javax.swing.JButton jButtonResum;
    private javax.swing.JCheckBox jCheckBoxUrgent;
    private javax.swing.JComboBox<String> jComboBoxProducte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelEstat;
    private javax.swing.JList<String> jListDades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaResum;
    private javax.swing.JTextField jTextFieldClient;
    private javax.swing.JTextField jTextFieldNou;
    private javax.swing.JTextField jTextFieldQuantitat;
    // End of variables declaration//GEN-END:variables
}
