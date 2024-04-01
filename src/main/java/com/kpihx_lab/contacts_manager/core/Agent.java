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
public class Agent extends Contact {
    private final static String[] statuts = new String[]{"temporaire", "stagiaire", "permanent"}; 
    private final static String[] repertoireAgentsLabel = new String[]{"Code", "Nom", "Date naissance", "Addresse", "Email", "Téléphone", "Salaire", "Statut", "Catégorie", "Indice salaire", "Occupation"}; 
    private double salaire;
    private String statut; // temporaire, stagiaire ou permanent
    private String categorie;
    private int indiceSalaire;
    private String occupation;

    // Constructeur
    public Agent(String code, String nom, Date dateDeNaissance, String address, String email, String telNumber,
            double salaire, String statut, String categorie, int indiceSalaire, String occupation) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.categorie = categorie;
        this.indiceSalaire = indiceSalaire;
        this.occupation = occupation;
    }

    // Getters et Setters
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getIndiceSalaire() {
        return indiceSalaire;
    }

    public void setIndiceSalaire(int indiceSalaire) {
        this.indiceSalaire = indiceSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public static String[] getStatus() {
        return statuts;
    }
    
    public static String[] getRepertoireAgentsLabel() {
        return repertoireAgentsLabel;
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
                "\t\tsalaire=" + this.getSalaire() + "\n" +
                "\t\tstatut='" + this.getStatut() + "'\n" +
                "\t\tcategorie='" + this.getCategorie() + "'\n" +
                "\t\tindiceSalaire=" + this.getIndiceSalaire() + "\n" +
                "\t\toccupation='" + this.getOccupation() + "'\n" +
                "\t}\n";
    }
}

