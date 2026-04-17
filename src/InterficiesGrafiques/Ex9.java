
package InterficiesGrafiques;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ex9 extends javax.swing.JFrame {
    
    DefaultListModel<String> modelLlista = new DefaultListModel<>();
    DefaultTableModel modelTaula;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ex9.class.getName());

    public Ex9() {
        initComponents();
        jListProductes.setModel(modelLlista);
        modelTaula = (DefaultTableModel) jTableProductos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldClient = new javax.swing.JTextField();
        jLabelEstat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProductes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantitat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProductes = new javax.swing.JList<>();
        jCheckBoxUrgent = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProducte = new javax.swing.JTextField();
        jButtonAfegir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButtonALlista = new javax.swing.JButton();
        jButtonELlista = new javax.swing.JButton();
        jButtonPassarT = new javax.swing.JButton();
        jButtonEFila = new javax.swing.JButton();
        jButtonResum = new javax.swing.JButton();
        jButtonNetejar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResum = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Client: ");

        jLabelEstat.setText("Estat: Cap producte a la taula - Total unitats: 0");

        jLabel3.setText("Producte: ");

        jComboBoxProductes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portàtil", "Ratolí", "Teclat", "Monitor", "Impresora" }));

        jLabel2.setText("Quantitat:");

        jScrollPane1.setViewportView(jListProductes);

        jCheckBoxUrgent.setText("Urgent");

        jLabel4.setText("Nou producte:");

        jButtonAfegir.setText("Afegir Producte");
        jButtonAfegir.addActionListener(this::jButtonAfegirActionPerformed);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableProductos);

        jButtonALlista.setText("Afegir a la llista");
        jButtonALlista.addActionListener(this::jButtonALlistaActionPerformed);

        jButtonELlista.setText("Eliminar llista");
        jButtonELlista.addActionListener(this::jButtonELlistaActionPerformed);

        jButtonPassarT.setText("Passar a taula");
        jButtonPassarT.addActionListener(this::jButtonPassarTActionPerformed);

        jButtonEFila.setText("Eliminar fila");
        jButtonEFila.addActionListener(this::jButtonEFilaActionPerformed);

        jButtonResum.setText("Resum");
        jButtonResum.addActionListener(this::jButtonResumActionPerformed);

        jButtonNetejar.setText("Netejar");
        jButtonNetejar.addActionListener(this::jButtonNetejarActionPerformed);

        jTextAreaResum.setColumns(20);
        jTextAreaResum.setRows(5);
        jScrollPane3.setViewportView(jTextAreaResum);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonALlista)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonELlista)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPassarT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEFila, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNetejar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldClient, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProductes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldProducte, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstat, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUrgent))
                            .addComponent(jButtonAfegir)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProductes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxUrgent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldProducte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAfegir))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonALlista)
                    .addComponent(jButtonELlista)
                    .addComponent(jButtonPassarT)
                    .addComponent(jButtonEFila)
                    .addComponent(jButtonResum)
                    .addComponent(jButtonNetejar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEFilaActionPerformed
        
        int sel = jTableProductos.getSelectedRow();
        
        if (sel != -1) {
            
            modelTaula.removeRow(sel);
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }
    }//GEN-LAST:event_jButtonEFilaActionPerformed

    private void jButtonALlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALlistaActionPerformed
        
        String client = jTextFieldClient.getText().trim();
        String producte = jComboBoxProductes.getSelectedItem().toString();
        String quantitat = jTextFieldQuantitat.getText().trim();
        boolean urgent = jCheckBoxUrgent.isSelected();
        
        boolean valid = true;
        String errores = "";
        
        if (client.isEmpty()) {
            
            valid = false;
            errores += "El client no puede estar vacio.\n";
        }
        if (quantitat.isEmpty()) {
            
            valid = false;
            errores += "La quantitat no puede estar vacio.\n";
        }
        
        if (valid) {
            
            String esUrgent = urgent ? "Urgent" : "Normal";
            String linia = client + " - " + producte + " - " + quantitat + " - " + esUrgent;
            modelLlista.addElement(linia);
            
            jTextFieldClient.setText("");
            jTextFieldQuantitat.setText("");
            jCheckBoxUrgent.setSelected(false);
            
        } else {
            
            JOptionPane.showMessageDialog(this, errores, "Errores:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonALlistaActionPerformed

    private void jButtonAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfegirActionPerformed
        
        String s = jTextFieldProducte.getText().trim();
        
        if (!s.isEmpty()) {
            
            jComboBoxProductes.addItem(s);
            jTextFieldProducte.setText("");
            
            jComboBoxProductes.setSelectedItem(s);
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Mal", "Mal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAfegirActionPerformed

    private void jButtonPassarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassarTActionPerformed
        
        int posicioLlista = jListProductes.getSelectedIndex();
        
        if (posicioLlista != -1) {
            
            String dadesLlista = modelLlista.getElementAt(posicioLlista);
            
            String[] parts = dadesLlista.split(" - ");
            
            Object[] filaTaula = new Object[]{parts[0], parts[1], parts[2], parts[3]};
            
            modelTaula.addRow(filaTaula);
            modelLlista.remove(posicioLlista);
            
            int num = modelTaula.getRowCount();
            int total = 0;
            int i = 0;
            
            while (i < num){
                
                String quant = modelTaula.getValueAt(i, 2).toString();
                
                int quantNum = Integer.parseInt(quant);
                total += quantNum;
                i++;
            }
            
            String estat = "Estat: " + num + " comanda/es a la taula - Total unitats: " + total;
            jLabelEstat.setText(estat);
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Selecciona un element a la llista");
        }
    }//GEN-LAST:event_jButtonPassarTActionPerformed

    private void jButtonResumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResumActionPerformed
        jTextAreaResum.setText("---- COMANDES ----");
        
        int i = 0;
        int files = modelTaula.getRowCount();
        
        while (i < files) {
            
            String cl = modelTaula.getValueAt(i, 0).toString();
            String pr = modelTaula.getValueAt(i, 1).toString();
            String qt = modelTaula.getValueAt(i, 2).toString();
            String ur = modelTaula.getValueAt(i, 3).toString();
            
            jTextAreaResum.append("Client: " + cl + " - Producte: " + qt + "x" + pr + " (" + ur + "). \n");
            i++;
        }
    }//GEN-LAST:event_jButtonResumActionPerformed

    private void jButtonELlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELlistaActionPerformed
        
        modelLlista.clear();
    }//GEN-LAST:event_jButtonELlistaActionPerformed

    private void jButtonNetejarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNetejarActionPerformed
        
        jTextFieldClient.setText("");
        jTextFieldQuantitat.setText("");
        jCheckBoxUrgent.setSelected(false);
        jTextFieldProducte.setText("");
        
        
    }//GEN-LAST:event_jButtonNetejarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Ex9().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALlista;
    private javax.swing.JButton jButtonAfegir;
    private javax.swing.JButton jButtonEFila;
    private javax.swing.JButton jButtonELlista;
    private javax.swing.JButton jButtonNetejar;
    private javax.swing.JButton jButtonPassarT;
    private javax.swing.JButton jButtonResum;
    private javax.swing.JCheckBox jCheckBoxUrgent;
    private javax.swing.JComboBox<String> jComboBoxProductes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEstat;
    private javax.swing.JList<String> jListProductes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextArea jTextAreaResum;
    private javax.swing.JTextField jTextFieldClient;
    private javax.swing.JTextField jTextFieldProducte;
    private javax.swing.JTextField jTextFieldQuantitat;
    // End of variables declaration//GEN-END:variables
}
