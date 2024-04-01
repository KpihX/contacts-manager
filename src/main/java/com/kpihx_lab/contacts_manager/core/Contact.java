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
public class Contact {
    private final static String[] contactsTypes = new String[]{"Agent", "Enseignant", "Etudiant"};
    private String code;
    private String nom;
    private Date dateDeNaissance;
    private String address;
    private String email;
    private String telNumber;

    public Contact(String code, String nom, Date dateDeNaissance, String address, String email, String telNumber) {
        this.code = code;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.address = address;
        this.email = email;
        this.telNumber = telNumber;
    }

    // Getters et Setters pour Contact
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return address;
    }

    public void setAdresse(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    public static String[] getContactsTypes() {
        return contactsTypes;
    }

    @Override
    public String toString() {
        return "\tContact{\n" +
                "\t\tcode='" + code + "'\n" +
                "\t\tnom='" + nom + "'\n" +
                "\t\tdateDeNaissance=" + dateDeNaissance + "\n" +
                "\t\taddress='" + address + "'\n" +
                "\t\temail='" + email + "'\n" +
                "\t\ttelNumber='" + telNumber + "'\n" +
                "\t}\n";
    }
}
