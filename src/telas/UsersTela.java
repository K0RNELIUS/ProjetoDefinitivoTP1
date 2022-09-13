/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import telas.PrincipalTela;
import game.User;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author leobe
 */
public class UsersTela extends javax.swing.JFrame {
    /**
     * Creates new form Users
     */
    public UsersTela() {
        initComponents();
        
        // Habilitar ou desabilitar botoes
        bttCadastrar.setEnabled(true);
        bttPesquisar.setEnabled(true);
        bttSair.setEnabled(true);
        bttRemover.setEnabled(true);
        
        // Habilitar ou desabilitar txts
        txtUsername.setEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        pnlCadastroUser = new javax.swing.JPanel();
        lblSearchIdentifier = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        bttCadastrar = new javax.swing.JButton();
        bttRemover = new javax.swing.JButton();
        bttPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserPesquisado = new javax.swing.JTable();
        bttSair = new javax.swing.JButton();
        bttAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Users");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/userImage32.png")).getImage());

        pnlCadastroUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblSearchIdentifier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSearchIdentifier.setText("Username:");

        txtUsername.setToolTipText("Insira o username do user para pesquisa");

        javax.swing.GroupLayout pnlCadastroUserLayout = new javax.swing.GroupLayout(pnlCadastroUser);
        pnlCadastroUser.setLayout(pnlCadastroUserLayout);
        pnlCadastroUserLayout.setHorizontalGroup(
            pnlCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroUserLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblSearchIdentifier)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroUserLayout.setVerticalGroup(
            pnlCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroUserLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bttCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addUserImage32.png"))); // NOI18N
        bttCadastrar.setText("Cadastrar");
        bttCadastrar.setToolTipText("Adicionar Cadastro");
        bttCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarActionPerformed(evt);
            }
        });

        bttRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/removerUser32.png"))); // NOI18N
        bttRemover.setText("Remover");
        bttRemover.setToolTipText("Remover Cadastro");
        bttRemover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverActionPerformed(evt);
            }
        });

        bttPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisarUserImage32.png"))); // NOI18N
        bttPesquisar.setText("Pesquisar");
        bttPesquisar.setToolTipText("Acessar Jogo");
        bttPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPesquisarActionPerformed(evt);
            }
        });

        tblUserPesquisado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Easy Pontuation", "Medium Pontuation", "Hard Pontuation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserPesquisado);

        bttSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairImage64.png"))); // NOI18N
        bttSair.setText("Sair");
        bttSair.setToolTipText("Sair dos Users");
        bttSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        bttAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmarImage32.png"))); // NOI18N
        bttAlterar.setText("Alterar");
        bttAlterar.setToolTipText("Após pesquisar Username, clique aqui para alterar.");
        bttAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttCadastrar)
                        .addGap(27, 27, 27)
                        .addComponent(bttRemover)
                        .addGap(26, 26, 26)
                        .addComponent(bttAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttPesquisar))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(bttSair)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrar)
                    .addComponent(bttRemover)
                    .addComponent(bttPesquisar)
                    .addComponent(bttAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttSair)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarActionPerformed
       String tempUsername = txtUsername.getText();
       if (tempUsername.equals("")) {
           JOptionPane.showMessageDialog(null, "Campo vazio, tente novamente.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
       } else {
           
       }
       
       
       
    }//GEN-LAST:event_bttCadastrarActionPerformed

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverActionPerformed
        // TODO add your handling code here:
             
    }//GEN-LAST:event_bttRemoverActionPerformed

    private void bttPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPesquisarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_bttPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(UsersTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAlterar;
    private javax.swing.JButton bttCadastrar;
    private javax.swing.JButton bttPesquisar;
    private javax.swing.JButton bttRemover;
    private javax.swing.JButton bttSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSearchIdentifier;
    private javax.swing.JPanel pnlCadastroUser;
    private javax.swing.JTable tblUserPesquisado;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
