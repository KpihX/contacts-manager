/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kpihx_lab.contacts_manager.frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.kpihx_lab.contacts_manager.core.*;

/**
 *
 * @author kpihx
 */
public class MainFrmApplication extends javax.swing.JFrame {
    private Repertoire repertoire;
    private static Connection connection;

    /**
     * Creates new form MainFrmApplication
     */
    public MainFrmApplication(Repertoire repertoire) {
        this.repertoire = repertoire;
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

        welcomeMessage = new javax.swing.JLabel();
        buttonAddContact = new javax.swing.JButton();
        buttonShowContacts = new javax.swing.JButton();
        notificationLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionnaire de Contacts");

        welcomeMessage.setText("          Bienvenue dans ce Repertoire de Contacts!");

        buttonAddContact.setText("Ajouter un Contact");
        buttonAddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddContactActionPerformed(evt);
            }
        });

        buttonShowContacts.setText("Afficher les Contacts");
        buttonShowContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowContactsActionPerformed(evt);
            }
        });

        notificationLabel.setText("Notifications:");

        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        saveMenu.setText("Enregistrer");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(buttonAddContact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonShowContacts)
                .addGap(51, 51, 51))
            .addComponent(notificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonShowContacts, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAddContact, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addComponent(notificationLabel))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddContactActionPerformed
        new ContactsCreationFrame(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonAddContactActionPerformed

    private void buttonShowContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowContactsActionPerformed
        new ContactsDisplayFrame(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonShowContactsActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        enregistrer();
    }//GEN-LAST:event_saveMenuActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    public void enregistrer(){
        if (repertoire.getContacts().isEmpty()) {
            notificationLabel.setText("RAS: Rien à enregistrer!"); 
            return;
        }
        boolean error = false;
        for (Contact contact: repertoire.getContacts()) {
            try {
                contact.insererContact(connection);
            } catch( SQLException ex) {
                ex.printStackTrace();
                error = true;
            }
        }
        
        if (error) {
            notificationLabel.setText("Notes: Certaines insertions n'ont pas été efféctuées à cause de clé déjà existantes ou invalides! Plus d'infos dans la stackTrace.");
        } else {
            notificationLabel.setText("Succès: L'enregistrement s'est bien passé!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/contacts_db";
        String user = "user";
        String password = "password";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.err.println("Erreur lors de la connextion à la BD: " + ex.getMessage());
            return;
        }
        
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
            java.util.logging.Logger.getLogger(MainFrmApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrmApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrmApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrmApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrmApplication(new Repertoire()).setVisible(true);
            }
        });
        
        
        
    }
    
    public Repertoire getRepertoire() {
        return repertoire;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddContact;
    private javax.swing.JButton buttonShowContacts;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
