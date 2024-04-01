/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kpihx_lab.contacts_manager.core;

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
