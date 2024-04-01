/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kpihx_lab.contacts_manager.frames;

import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Arrays;

import com.kpihx_lab.contacts_manager.core.*;

/**
 *
 * @author kpihx
 */
public class ContactsCreationFrame extends javax.swing.JFrame {
    private MainFrmApplication mainFrmApplication;
    private Repertoire repertoire;
    private Date birth;
    private int birthYear;
    private String code, name, email, tel, birthDay, birthMonth, address;
    private String contactType;
    private int currentYear = LocalDate.now().getYear();
    private int minimalBirthYear = currentYear - 200;
    
    /**
     * Creates new form ContactsCreationFrame
     */
    public ContactsCreationFrame(MainFrmApplication mainFrmApplication) {
        this.mainFrmApplication = mainFrmApplication;
        this.repertoire = mainFrmApplication.getRepertoire();
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        birthText = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        typeContactComboBox = new javax.swing.JComboBox<>(Contact.getContactsTypes());
        jLabel6 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        codeText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        telText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        notificationText = new javax.swing.JTextField();
        birthDayComboBox = new javax.swing.JComboBox<>(DateUtils.days);
        birthMonthComboBox = new javax.swing.JComboBox<>(DateUtils.months);
        birthYearText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        birthText.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codeLabel.setText("Code");

        nameLabel.setText("Nom");

        birthLabel.setText("Date de Naissance");

        emailLabel.setText("Email");

        telLabel.setText("Numéro Téléphone");
        telLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                telLabelComponentHidden(evt);
            }
        });

        typeContactComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeContactComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Type contact");

        continueButton.setText("Continuer");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        previousButton.setText("Revenir");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        codeText.setText("d");
        codeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codeTextFocusLost(evt);
            }
        });
        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

        nameText.setText("f");
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        telText.setText("556");
        telText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTextActionPerformed(evt);
            }
        });

        emailText.setText("xyz@gmail.com");
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        notificationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationTextActionPerformed(evt);
            }
        });

        birthDayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDayComboBoxActionPerformed(evt);
            }
        });

        birthMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthMonthComboBoxActionPerformed(evt);
            }
        });

        birthYearText.setText("2003");
        birthYearText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthYearTextFocusLost(evt);
            }
        });
        birthYearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthYearTextActionPerformed(evt);
            }
        });

        addressText.setText("d");
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        addressLabel.setText("Addresse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(telLabel)
                            .addComponent(jLabel6)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeContactComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameText)
                            .addComponent(telText)
                            .addComponent(emailText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(birthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(birthDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(birthMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(birthYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeLabel)
                            .addComponent(addressLabel))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeText)
                            .addComponent(addressText))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(previousButton)
                .addGap(123, 123, 123)
                .addComponent(continueButton)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notificationText, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthLabel)
                    .addComponent(birthDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telLabel)
                    .addComponent(telText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(typeContactComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(continueButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telLabelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_telLabelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_telLabelComponentHidden

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        try {
            codeTextActionPerformed(evt);
            nameTextActionPerformed(evt);
            birthDayComboBoxActionPerformed(evt);
            birthMonthComboBoxActionPerformed(evt);
            birthYearTextActionPerformed(evt);
            addressTextActionPerformed(evt);
            emailTextActionPerformed(evt);
            telTextActionPerformed(evt);
            typeContactComboBoxActionPerformed(evt);
        } catch (IllegalArgumentException ex) {
            notificationText.setText(ex.getMessage());
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birth;
        try {
            String dateFormated = birthDay + "/" + (Arrays.asList(DateUtils.months).indexOf(birthMonth) + 1) + "/" + birthYear;
            birth = dateFormat.parse(dateFormated);
        } catch (ParseException ex) {
            notificationText.setText(ex.getMessage());
            return;
        }
        notificationText.setText(contactType);
        switch (contactType) {
            case "Agent":
                new AgentsCreationFrame(this, code, name, birth, address, email, tel).setVisible(true);
                break;
            case "Enseignant":
                new EnseignantCreationFrame(this, code, name, birth, address, email, tel).setVisible(true);
                break;
            case "Etudiant":
                new EtudiantCreationFrame(this, code, name, birth, address, email, tel).setVisible(true);
                break;
        }
        setVisible(false);
    }//GEN-LAST:event_continueButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        name = nameText.getText();
    }//GEN-LAST:event_nameTextActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        email = emailText.getText();
    }//GEN-LAST:event_emailTextActionPerformed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        code = codeText.getText();
        if (repertoire.rechercherContact(code) != null) {
            throw new IllegalArgumentException("Le code entré existe déjà!");
        }
    }//GEN-LAST:event_codeTextActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        mainFrmApplication.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void codeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codeTextFocusLost
        code = codeText.getText();
        if (repertoire.rechercherContact(code) != null) {
            notificationText.setText("Le code entré existe déjà!");
        }
    }//GEN-LAST:event_codeTextFocusLost

    private void telTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTextActionPerformed
        tel = telText.getText();
    }//GEN-LAST:event_telTextActionPerformed

    private void typeContactComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeContactComboBoxActionPerformed
        contactType = (String) typeContactComboBox.getSelectedItem();
    }//GEN-LAST:event_typeContactComboBoxActionPerformed

    private void notificationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationTextActionPerformed
        notificationText.setText("Veuillez entrer les informations générales du nouveau contact!");
    }//GEN-LAST:event_notificationTextActionPerformed

    private void birthDayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDayComboBoxActionPerformed
        birthDay = (String) birthDayComboBox.getSelectedItem();
    }//GEN-LAST:event_birthDayComboBoxActionPerformed

    private void birthMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthMonthComboBoxActionPerformed
        birthMonth = (String) birthMonthComboBox.getSelectedItem();
    }//GEN-LAST:event_birthMonthComboBoxActionPerformed

    private void birthYearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthYearTextActionPerformed
        try {
            birthYear = Integer.valueOf(birthYearText.getText());
            if (birthYear < minimalBirthYear || birthYear > currentYear) {
                throw new IllegalArgumentException("L'année de naissance doit être entre " + minimalBirthYear + " et " + currentYear + "!");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("L'année de naissance doit être un entier!");
        }
    }//GEN-LAST:event_birthYearTextActionPerformed

    private void birthYearTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthYearTextFocusLost
        try {
            birthYear = Integer.valueOf(birthYearText.getText());
            if (birthYear < minimalBirthYear || birthYear > currentYear) {
                notificationText.setText("L'année de naissance doit être entre " + minimalBirthYear + " et " + currentYear + "!");
            }
        } catch (NumberFormatException ex) {
            notificationText.setText("L'année de naissance doit être entre " + minimalBirthYear + " et " + currentYear + "!");
        }
    }//GEN-LAST:event_birthYearTextFocusLost

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        address = addressText.getText();
    }//GEN-LAST:event_addressTextActionPerformed

    public Repertoire getRepertoire() {
        return repertoire;
    }
    
    public MainFrmApplication getMainFrmApplication() {
        return mainFrmApplication;
    }
    
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
            java.util.logging.Logger.getLogger(ContactsCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactsCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactsCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactsCreationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactsCreationFrame(new Repertoire()).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JComboBox<String> birthDayComboBox;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JComboBox<String> birthMonthComboBox;
    private javax.swing.JTextField birthText;
    private javax.swing.JTextField birthYearText;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeText;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField notificationText;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField telText;
    private javax.swing.JComboBox<String> typeContactComboBox;
    // End of variables declaration//GEN-END:variables
}
