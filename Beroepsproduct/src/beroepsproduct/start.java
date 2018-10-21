/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct;
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public start() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitel = new javax.swing.JLabel();
        lblSpelersnaam = new javax.swing.JLabel();
        lblNaam1 = new javax.swing.JLabel();
        lblNaam2 = new javax.swing.JLabel();
        txtNaam1 = new javax.swing.JTextField();
        txtNaam2 = new javax.swing.JTextField();
        btnAfsluiten = new javax.swing.JButton();
        btnStart1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitel.setText("Memory");
        lblTitel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTitel.setPreferredSize(new java.awt.Dimension(90, 30));

        lblSpelersnaam.setText("Vul uw spelersnaam in:");

        lblNaam1.setText("Spelersnaam 1:");

        lblNaam2.setText("Spelersnaam 2:");

        txtNaam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaam1ActionPerformed(evt);
            }
        });

        btnAfsluiten.setBackground(new java.awt.Color(192, 0, 0));
        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        btnStart1.setBackground(new java.awt.Color(84, 130, 53));
        btnStart1.setText("Start");
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpelersnaam)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNaam1)
                                    .addComponent(lblNaam2))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNaam2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(txtNaam1))))))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAfsluiten, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblSpelersnaam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaam1)
                    .addComponent(txtNaam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaam2)
                    .addComponent(txtNaam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnAfsluiten, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(318, Short.MAX_VALUE)
                    .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed

        this.dispose();
        Spel scherm = new Spel(this, true);
        scherm.setVisible(true);
        
        Spel.lblSpeler1.setText("0");
        Spel.lblSpeler1.setText(this.txtNaam1.getText()); 
    }//GEN-LAST:event_btnStart1ActionPerformed

    private void txtNaam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaam1ActionPerformed

    public static void main(String args[]) {
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfsluiten;
    private javax.swing.JButton btnStart1;
    private javax.swing.JLabel lblNaam1;
    private javax.swing.JLabel lblNaam2;
    private javax.swing.JLabel lblSpelersnaam;
    private javax.swing.JLabel lblTitel;
    public static javax.swing.JTextField txtNaam1;
    public static javax.swing.JTextField txtNaam2;
    // End of variables declaration//GEN-END:variables
}
