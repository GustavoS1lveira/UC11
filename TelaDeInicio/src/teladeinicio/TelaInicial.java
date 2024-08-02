/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teladeinicio;

/**
 *
 * @author Gustavo
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelCentral = new javax.swing.JPanel();
        jPainelSOSRS = new javax.swing.JPanel();
        jlSOSRS = new javax.swing.JLabel();
        jPainelDoenças = new javax.swing.JPanel();
        jLDoenças = new javax.swing.JLabel();
        jbCadastrarDoenças = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        IrparaEdutarBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        IrparaIdentificarBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPainelSOSRS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlSOSRS.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jlSOSRS.setText("SOS RS");

        javax.swing.GroupLayout jPainelSOSRSLayout = new javax.swing.GroupLayout(jPainelSOSRS);
        jPainelSOSRS.setLayout(jPainelSOSRSLayout);
        jPainelSOSRSLayout.setHorizontalGroup(
            jPainelSOSRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelSOSRSLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jlSOSRS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelSOSRSLayout.setVerticalGroup(
            jPainelSOSRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelSOSRSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSOSRS)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPainelDoenças.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLDoenças.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDoenças.setText("Cadastrar Doenças");

        jbCadastrarDoenças.setText("CADASTRAR");
        jbCadastrarDoenças.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarDoençasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelDoençasLayout = new javax.swing.GroupLayout(jPainelDoenças);
        jPainelDoenças.setLayout(jPainelDoençasLayout);
        jPainelDoençasLayout.setHorizontalGroup(
            jPainelDoençasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelDoençasLayout.createSequentialGroup()
                .addGroup(jPainelDoençasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelDoençasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jbCadastrarDoenças, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPainelDoençasLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLDoenças)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPainelDoençasLayout.setVerticalGroup(
            jPainelDoençasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelDoençasLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLDoenças, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCadastrarDoenças, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IrparaEdutarBTN.setText("Editar Doença");
        IrparaEdutarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrparaEdutarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(IrparaEdutarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(IrparaEdutarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IrparaIdentificarBTN.setText("Identificar ");
        IrparaIdentificarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrparaIdentificarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(IrparaIdentificarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(IrparaIdentificarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPainelCentralLayout = new javax.swing.GroupLayout(jPainelCentral);
        jPainelCentral.setLayout(jPainelCentralLayout);
        jPainelCentralLayout.setHorizontalGroup(
            jPainelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelSOSRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPainelCentralLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPainelDoenças, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPainelCentralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPainelCentralLayout.setVerticalGroup(
            jPainelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelSOSRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPainelDoenças, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPainelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarDoençasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarDoençasActionPerformed
CadastrarDoencas cadastrarDoencas = new CadastrarDoencas();
        cadastrarDoencas.setVisible(true);
      
    }//GEN-LAST:event_jbCadastrarDoençasActionPerformed

    private void IrparaEdutarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrparaEdutarBTNActionPerformed
        Editar editarDoenca = new Editar();
        editarDoenca.setVisible(true);
 
    }//GEN-LAST:event_IrparaEdutarBTNActionPerformed

    private void IrparaIdentificarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrparaIdentificarBTNActionPerformed
         Inden identificarDoenca = new Inden();
    identificarDoenca.setVisible(true);
    
    }//GEN-LAST:event_IrparaIdentificarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IrparaEdutarBTN;
    private javax.swing.JButton IrparaIdentificarBTN;
    private javax.swing.JLabel jLDoenças;
    private javax.swing.JPanel jPainelCentral;
    private javax.swing.JPanel jPainelDoenças;
    private javax.swing.JPanel jPainelSOSRS;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCadastrarDoenças;
    private javax.swing.JLabel jlSOSRS;
    // End of variables declaration//GEN-END:variables
}
