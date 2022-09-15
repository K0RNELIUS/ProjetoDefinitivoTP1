/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import game.Jogo;
import game.Palavra;
import game.Users;
import javax.swing.JOptionPane;
import static telas.PrincipalTela.palavras;
import static telas.PrincipalTela.users;

/**
 *
 * @author leobe
 */
public class JogoConfirmationTela extends javax.swing.JFrame {
    /**
     * Creates new form GameConfirmation
     */
    
    public JogoConfirmationTela() {
        initComponents();
        
        // Posicionando cursor no primeiro txt
        txtUsername.requestFocus();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConfirmation = new javax.swing.JPanel();
        bttOK = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtDificuldade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/userImage32.png")).getImage());

        pnlConfirmation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login using Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        bttOK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/playImage32.png"))); // NOI18N
        bttOK.setText("OK");
        bttOK.setToolTipText("Criar Jogo");
        bttOK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttOKActionPerformed(evt);
            }
        });

        txtUsername.setToolTipText("Preencha aqui o seu username para jogar");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtDificuldade.setToolTipText("Preencha aqui a dificuldade que quer jogar.");
        txtDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDificuldadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Dificuldade do Jogo:");

        javax.swing.GroupLayout pnlConfirmationLayout = new javax.swing.GroupLayout(pnlConfirmation);
        pnlConfirmation.setLayout(pnlConfirmationLayout);
        pnlConfirmationLayout.setHorizontalGroup(
            pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmationLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmationLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername))
                    .addGroup(pnlConfirmationLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
                .addGap(88, 88, 88)
                .addComponent(bttOK)
                .addGap(87, 87, 87))
        );
        pnlConfirmationLayout.setVerticalGroup(
            pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmationLayout.createSequentialGroup()
                .addGroup(pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmationLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConfirmationLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(bttOK)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        bttSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairImage64.png"))); // NOI18N
        bttSair.setText("Sair");
        bttSair.setToolTipText("Sair do Login");
        bttSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(bttSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttSair)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDificuldadeActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void bttOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttOKActionPerformed
        // TODO add your handling code here:
        String tempUsername = txtUsername.getText();
        String tempDificuldade = txtDificuldade.getText();
        if (tempUsername.equals("") || tempDificuldade.equals("")) {
            // Verifica se algum dos campos esta em branco
            JOptionPane.showMessageDialog(null, "Por favor não deixe nenhum campo em branco.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (users.existeUsername(tempUsername)){
                int indUser = users.getListaDeUsernames().indexOf(tempUsername);
                // Dificuldade 
                if (tempDificuldade.equals("Facil") || tempDificuldade.equals("Medio") || tempDificuldade.equals("Dificil")) {
                    Jogo jogo = new Jogo(tempDificuldade, users.getListaDeUsers().get(indUser), palavras);
                    new JogoTela(jogo).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "As dificuldades possíveis são Facil, Medio ou Dificil. Tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        // Limpar Campos txt
       txtUsername.setText("");
       txtDificuldade.setText("");
       
       // Focus no txt
        txtUsername.requestFocus();

    }//GEN-LAST:event_bttOKActionPerformed

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_bttSairActionPerformed

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
            java.util.logging.Logger.getLogger(JogoConfirmationTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoConfirmationTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoConfirmationTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoConfirmationTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoConfirmationTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttOK;
    private javax.swing.JButton bttSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlConfirmation;
    private javax.swing.JTextField txtDificuldade;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
