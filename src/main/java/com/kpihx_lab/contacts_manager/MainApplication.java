/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kpihx_lab.contacts_manager;

import java.util.Date;

import com.kpihx_lab.contacts_manager.core.*;

/**
 *
 * @author kpihx
 */

// Permet de faire les tests de fontionnment des méthodes du package core sur un repertoire via le terminal

public class MainApplication {
    // Création du répertoire
    private static Repertoire repertoire;
    
    public static void main(String[] args) {
        repertoire = new Repertoire();
        
        // Création de quelques contacts
        Enseignant enseignant = new Enseignant("ENS001", "Jean Dupont", new Date(), "123 Rue de l'Université", "j.dupont@univ.edu", "0123456789", "permanent");
        Agent agent = new Agent("AGT001", "Marie Curie", new Date(), "456 Avenue dela Recherche", "m.curie@univ.edu", "9876543210", 2500.00, "permanent", "A2", 5, "chercheur");
        Etudiant etudiant = new Etudiant("ETU001", "Pierre Poubelle", new Date(), "Rue de l'indépendance", "pierre@univ.edu", "8525645891", "Licence", "3GI");
        
        // Ajout des contacts au répertoire
        repertoire.ajouterContact(enseignant);
        repertoire.ajouterContact(agent);
        repertoire.ajouterContact(etudiant);

        // Affichage du repertoire
        System.out.println("* Affichage du repertoire:");
        System.out.println(repertoire);

        // Affichage d'un contact
        String matricule = "ETU001";
        System.out.println("\n* Affichage du contact de matricule '" + matricule + "'.");
        Contact contactRecherche = repertoire.rechercherContact(matricule);
        if (contactRecherche != null) {
            System.out.println("Contact trouvé:\n" + contactRecherche.toString());
        } else {
            System.out.println("Contact non trouvé!");
        }

        // Suppression d'un contact
        matricule = "AGT001";
        System.out.println("\n* Suppression du contact de matricule '" + matricule + "'.");
        try {
            repertoire.supprimerContact(matricule);
        } catch (IllegalArgumentException ex) {
            System.out.println("Le contact de matricule '" + matricule+ "' n'existe pas dans le repertoire!");
        }
        

        // Modification d'un contact
        matricule = "ENS001";
        System.out.println("\n* Modification du contact de matricule '" + matricule + "'.");
        Enseignant enseignantModifie = new Enseignant(matricule, "Jean Dupont", new Date(), "123 Rue de l'Université", "j.dupont@univ.edu", "0123456789", "vacataire");
        try {
            repertoire.modifierContact(matricule, enseignantModifie);
        } catch (IllegalArgumentException ex) {
            System.out.println("Le contact de matricule '" + matricule+ "' n'existe pas dans le repertoire!");
        }
        
        // Affichage du repertoire
        System.out.println("\n* Affichage final du repertoire:");
        System.out.println(repertoire);
    }
}

