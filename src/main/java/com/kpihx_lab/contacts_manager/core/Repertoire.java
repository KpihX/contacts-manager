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
    public void ajouterContact(Contact contact) throws IllegalArgumentException {
        for (Contact contact2: contacts) {
            if (contact.getCode().equals(contact2.getCode())) {
                throw new IllegalArgumentException("Un contact avec le même code est déjà dans le repertoire!");
            }
        }
        contacts.add(contact);
    }

    // Supprimer un contact
    public void supprimerContact(String code)  throws IllegalArgumentException {
        for (Contact contact: contacts) {
            if (contact.getCode().equals(code)) {
                contacts.remove(contact);
                return;
            }
        }
        throw new IllegalArgumentException("Le code entré ne correspond à aucun contact!");
    }

    // Modifier un contact
    public void modifierContact(String oldCode, Contact nouveauContact) {
        for (int i=0; i < contacts.size(); i++) {
            if (contacts.get(i).getCode().equals(oldCode)) {
                contacts.set(i, nouveauContact);
                return;
            }
        }
        throw new IllegalArgumentException("Le code entré ne correspond à aucun contact!");
    }

    // Rechercher un contact
    public Contact rechercherContact(String code) {
        for (Contact contact: contacts) {
            if (contact.getCode().equals(code)) {
                return contact;
            }
        }
        return null;
    }
    
    /**
    * Converts a list of lists of strings into a 2D array of strings.
    *
    * @param list The input list containing lists of strings.
    * @return A 2D array of strings representing the same data as the input list.
    *         Returns null if the input list is empty or if any inner list is empty.
    */
    public static String[][] arrayArrayStringToTable2D(ArrayList<ArrayList<String>> list) {
        // Check if the input list or any inner list is empty
        if (list.isEmpty() || list.get(0).isEmpty()) {
            return null;
        }

        // Create a 2D array to hold the converted data
        String[][] table = new String[list.size()][list.get(0).size()];

        // Populate the 2D array with values from the input list
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                table[i][j] = list.get(i).get(j);
            }
        }

        return table;
   }

    
    /**
    * Generates a 3D array representing subdirectories of contacts categorized by type.
    *
    * @return A 3D array containing subdirectories:
    *         - The first dimension represents the contact type (Agents, Enseignants, Etudiants).
    *         - The second dimension represents individual contacts within each type.
    *         - The third dimension contains contact details (code, nom, dateNaissance, etc.).
    */
    public String[][][] sousRepertoires() {
        // Initialize lists to store categorized contacts
        ArrayList<ArrayList<String>> repertoireAgents = new ArrayList<>();
        ArrayList<ArrayList<String>> repertoireEnseignants = new ArrayList<>();
        ArrayList<ArrayList<String>> repertoireEtudiants = new ArrayList<>();

        // Temporary list to hold contact details
        ArrayList<String> list = new ArrayList<>();

        // Date format for dateNaissance
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Iterate through each contact
        for (Contact contact : contacts) {
            // Populate common contact details
            list.addAll(Arrays.asList(
                    contact.getCode(),
                    contact.getNom(),
                    dateFormat.format(contact.getDateDeNaissance()),
                    contact.getAdresse(),
                    contact.getEmail(),
                    contact.getTelNumber()));

            // Categorize contacts based on type
            if (contact instanceof Agent) {
                // Additional details for Agents
                list.addAll(Arrays.asList(
                        String.valueOf(((Agent) contact).getSalaire()),
                        ((Agent) contact).getStatut(),
                        ((Agent) contact).getCategorie(),
                        String.valueOf(((Agent) contact).getIndiceSalaire()),
                        ((Agent) contact).getOccupation()));
                repertoireAgents.add((ArrayList<String>) list.clone());
            } else if (contact instanceof Enseignant) {
                // Additional details for Enseignants
                list.add(((Enseignant) contact).getStatut());
                repertoireEnseignants.add((ArrayList<String>) list.clone());
            } else if (contact instanceof Etudiant) {
                // Additional details for Etudiants
                list.addAll(Arrays.asList(
                        ((Etudiant) contact).getCycle(),
                        ((Etudiant) contact).getNiveau()));
                repertoireEtudiants.add((ArrayList<String>) list.clone());
            }

            // Clear the temporary list for the next contact
            list.clear();
        }

        // Convert categorized lists to 2D arrays and return as a 3D array
        return new String[][][]{
                Repertoire.arrayArrayStringToTable2D(repertoireAgents),
                Repertoire.arrayArrayStringToTable2D(repertoireEnseignants),
                Repertoire.arrayArrayStringToTable2D(repertoireEtudiants)
        };
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
