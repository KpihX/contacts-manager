/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kpihx_lab.contacts_manager.frames;

import com.kpihx_lab.contacts_manager.core.Enseignant;
import com.kpihx_lab.contacts_manager.core.Repertoire;
import java.util.Date;

/**
 *
 * @author kpihx
 */
public class EnseignantCreationFrame extends javax.swing.JFrame {
    private ContactsCreationFrame contactsCreationFrame;
    private Repertoire repertoire;
    private Date birth;
    private String code, name, address, email, tel;
    private String contactType;
    
    private String statut;
    /**
     * Creates new form EnseignantCreationFrame
     */
    public EnseignantCreationFrame(ContactsCreationFrame contactsCreationFrame, String code, String name, Date birth, String address, String email, String tel) {
        this.contactsCreationFrame = contactsCreationFrame;
        this.repertoire = contactsCreationFrame.getRepertoire();
        this.code = code;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.email = email;
        this.tel = tel;
        
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

        menuButton = new javax.swing.JButton();
        statutComboBox = new javax.swing.JComboBox<>(Enseignant.getStatuts());
        createButton = new javax.swing.JButton();
        notificationText = new javax.swing.JTextField();
        statutLabel = new javax.swing.JLabel();
        menuButton1 = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        menuButton.setText("Menu Principal");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statutComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statutComboBoxActionPerformed(evt);
            }
        });

        createButton.setText("Creer");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        notificationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationTextActionPerformed(evt);
            }
        });

        statutLabel.setText("Statut");

        menuButton1.setText("Menu Principal");
        menuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton1ActionPerformed(evt);
            }
        });

        returnButton.setText("Revenir");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(menuButton1)
                .addGap(18, 18, 18)
                .addComponent(returnButton)
                .addGap(37, 37, 37)
                .addComponent(createButton)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(statutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statutLabel)
                    .addComponent(statutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(notificationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(menuButton1)
                    .addComponent(returnButton))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statutComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statutComboBoxActionPerformed
        statut = (String) statutComboBox.getSelectedItem();
    }//GEN-LAST:event_statutComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        statutComboBoxActionPerformed(evt);

        repertoire.ajouterContact(new Enseignant(code, name, birth, address, email, tel, statut));
        notificationText.setText("Le contact a bien été ajouté!");
    }//GEN-LAST:event_createButtonActionPerformed

    private void notificationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationTextActionPerformed
        notificationText.setText("Veuillez finir de remplir les informations du nouvel agent!");
    }//GEN-LAST:event_notificationTextActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        new MainFrmApplication(repertoire).setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void menuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton1ActionPerformed
        contactsCreationFrame.getMainFrmApplication().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButton1ActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        contactsCreationFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnseignantCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnseignantCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnseignantCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnseignantCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnseignantCreationFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton menuButton1;
    private javax.swing.JTextField notificationText;
    private javax.swing.JButton returnButton;
    private javax.swing.JComboBox<String> statutComboBox;
    private javax.swing.JLabel statutLabel;
    // End of variables declaration//GEN-END:variables
}
