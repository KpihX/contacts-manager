/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kpihx_lab.contacts_manager.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author kpihx
 */
public class Enseignant extends Contact {
    private final static String[] repertoireEnseignantsLabel = new String[]{"Code", "Nom", "Date naissance", "Addresse", "Email", "Téléphone", "Statut"}; 
    private final static String[] statuts = new String[]{ "vacataire", "permanent" };
    private String statut; // vacataire ou permanent

    // Constructeur
    public Enseignant(String code, String nom, Date dateDeNaissance, String address, String email, String telNumber,
            String statut) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.statut = statut;
    }

    // Getter
    public String getStatut() {
        return statut;
    }

    // Setter
    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    public static String[] getStatuts() {
        return statuts;
    }
    
    public static String[] getRepertoireEnseignantsLabel() {
        return repertoireEnseignantsLabel;
    }
    
    @Override
    public void insererContact(Connection connection) throws SQLException {
        String sql = "INSERT INTO Enseignant (code, nom, dateNaissance, address, email, telNumber, statut)"+
                "SELECT ?, ?, ?, ?, ?, ?, ?"+
             "WHERE NOT EXISTS ("+
             "SELECT 1 FROM Agent WHERE code = ?"+
             ")";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, getCode());
            statement.setString(2, getNom());
            statement.setDate(3, new java.sql.Date(getDateDeNaissance().getTime()));
            statement.setString(4, getAdresse());
            statement.setString(5, getEmail());
            statement.setString(6, getTelNumber());
            statement.setString(7, getStatut());
            statement.setString(8, getCode());

            statement.executeUpdate();
        }
    }

    @Override
    public String toString() {
        return "\tContact{\n" +
                "\t\tcode='" + this.getCode() + "'\n" +
                "\t\tnom='" + this.getNom() + "'\n" +
                "\t\tdateDeNaissance=" + this.getDateDeNaissance() + "\n" +
                "\t\tadresse='" + this.getAdresse() + "'\n" +
                "\t\temail='" + this.getEmail() + "'\n" +
                "\t\ttelNumber='" + this.getTelNumber() + "'\n" +
                "\t\tstatut='" + this.getStatut() + "'\n" +
                "\t}\n";
    }
}
