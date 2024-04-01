/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kpihx_lab.contacts_manager.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.text.SimpleDateFormat;

/**
 *
 * @author kpihx
 */
public class Repertoire {
    private ArrayList<Contact> contacts;

    // Constructeur
    public Repertoire() {
        contacts = new ArrayList<>();
    }

    // Ajouter un contact
    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }

    // Supprimer un contact
    public void supprimerContact(Contact contact) {
        contacts.remove(contact);
    }

    // Modifier un contact
    public void modifierContact(Contact ancienContact, Contact nouveauContact) {
        int index = contacts.indexOf(ancienContact);
        if (index != -1) {
            contacts.set(index, nouveauContact);
        }
    }

    // Rechercher un contact
    public Contact rechercherContact(String code) {
        for (Contact contact : contacts) {
            if (contact.getCode().equals(code)) {
                return contact;
            }
        }
        return null;
    }
    
    public static String[][] arrayArrayStringToTable2D(ArrayList<ArrayList<String>> list) {
        if (list.size() == 0 || list.get(0).size() == 0) {
            return null;
        }
        String[][] table = new String[list.size()][list.get(0).size()];
        for (int i=0; i < list.size(); i++) {
            for (int j=0; j < list.get(i).size(); j++) {
                table[i][j] = list.get(i).get(j);
            }
        }
        
        return table;
    }
    
    public String[][][] sousRepertoires() {
        ArrayList<ArrayList<String>> repertoireAgents = new ArrayList<>();
        ArrayList<ArrayList<String>> repertoireEnseignants = new ArrayList<>();
        ArrayList<ArrayList<String>> repertoireEtudiants = new ArrayList<>();
     
        ArrayList<String> list = new ArrayList<>();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        int i = 0;
        for (Contact contact: contacts) {
            list.addAll(Arrays.asList(contact.getCode(), contact.getNom(), dateFormat.format(contact.getDateDeNaissance()), contact.getAdresse(), contact.getEmail(), contact.getTelNumber()));
            if (contact instanceof Agent) {
                list.addAll(Arrays.asList(String.valueOf(((Agent) contact).getSalaire()), ((Agent) contact).getStatut(), ((Agent) contact).getCategorie(), String.valueOf(((Agent) contact).getIndiceSalaire()), ((Agent) contact).getOccupation()));
                repertoireAgents.add((ArrayList)list.clone());
            } else if (contact instanceof Enseignant) {
                list.add(((Enseignant) contact).getStatut());
                repertoireEnseignants.add((ArrayList)list.clone());
            } else if (contact instanceof Etudiant) {
                list.addAll(Arrays.asList(((Etudiant) contact).getCycle(), ((Etudiant) contact).getNiveau()));
                repertoireEtudiants.add((ArrayList)list.clone());
                
            }
            list.clear();i++;
        }
        
        return new String[][][]{Repertoire.arrayArrayStringToTable2D(repertoireAgents), Repertoire.arrayArrayStringToTable2D(repertoireEnseignants), Repertoire.arrayArrayStringToTable2D(repertoireEtudiants)};
        
    }

    // Afficher tous les contacts
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Repertoire[\n");
        for (Contact contact : contacts) {
            sb.append(contact.toString());
        }
        sb.append("]");
        return sb.toString();
    }
    
    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
