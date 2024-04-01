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
public class Etudiant extends Contact {
    private final static String[] repertoireEtudiantsLabel = new String[]{"Code", "Nom", "Date naissance", "Addresse", "Email", "Téléphone", "Cycle", "Niveau"}; 
    private final static String[] cycles = new String[]{"Licence", "Ingénieur"};
    private String cycle; // Licence, Ingénieur, etc.
    private String niveau;

    public Etudiant(String code, String nom, Date dateDeNaissance, String adresse, String email, String telNumber,
            String cycle, String niveau) {
        super(code, nom, dateDeNaissance, adresse, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }

    // Getters et Setters pour Etudiant
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
    public static String[] getCycles() {
        return cycles;
    }

    public static String[] getRepertoireEtudiantsLabel() {
        return repertoireEtudiantsLabel;
    }
    
    @Override
    public void insererContact(Connection connection) throws SQLException{
        String insertion = "INSERT INTO Etudiant (code, nom, dateNaissance, address, email, telNumber, cycle, niveau)"+
                "SELECT ?, ?, ?, ?, ?, ?, ?, ?"+
             "WHERE NOT EXISTS ("+
             "SELECT 1 FROM Etudiant WHERE code = ?"+
             ")";
        try (PreparedStatement statement = connection.prepareStatement(insertion)){
            statement.setString(1, getCode());
            statement.setString(2, getNom());
            statement.setDate(3, new java.sql.Date(getDateDeNaissance().getTime()));
            statement.setString(4, getAdresse());
            statement.setString(5, getEmail());
            statement.setString(6, getTelNumber());
            statement.setString(7, getCycle());
            statement.setString(8, getNiveau());
            statement.setString(9, getCode());
            
            int result = statement.executeUpdate();
            if (result == 0) {
                throw new SQLException("L'enregistrement n'a pas eu lieu car il existe déjà un agent avec la même clé");
            }
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
                "\t\tcycle='" + this.getCycle() + "'\n" +
                "\t\tniveau='" + this.getNiveau() + "'\n" +
                "\t}\n";
    }
}
