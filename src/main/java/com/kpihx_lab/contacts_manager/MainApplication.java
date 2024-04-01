/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kpihx_lab.contacts_manager;

import com.kpihx_lab.contacts_manager.core.*;
import com.kpihx_lab.contacts_manager.frames.*;

/**
 *
 * @author kpihx
 */
public class MainApplication {
    // Création du répertoire
    private static Repertoire repertoire;
    
    public static void main(String[] args) {
        repertoire = new Repertoire();
        new MainFrmApplication(repertoire).setVisible(true);
        // // Création de quelques contacts
        // Enseignant enseignant = new Enseignant("ENS001", "Jean Dupont", new Date(),
        // "123 Rue de l'Université",
        // "j.dupont@univ.edu", "0123456789", "permanent");
        // Agent agent = new Agent("AGT001", "Marie Curie", new Date(), "456 Avenue de
        // la Recherche", "m.curie@univ.edu",
        // "9876543210", 2500.00, "permanent", "A2", 5, "chercheur");

        // // Ajout des contacts au répertoire
        // repertoire.ajouterContact(enseignant);
        // repertoire.ajouterContact(agent);

        // // Affichage du repertoire
        // System.out.println(repertoire);

        // // Affichage d'un contact
        // Contact contactRecherche = repertoire.rechercherContact("ENS001");
        // if (contactRecherche != null) {
        // System.out.println("Contact trouvé : " + contactRecherche.getNom());
        // } else {
        // System.out.println("Contact non trouvé.");
        // }

        // // Suppression d'un contact
        // repertoire.supprimerContact(agent);

        // // Modification d'un contact
        // Enseignant enseignantModifie = new Enseignant("ENS001", "Jean Dupont", new
        // Date(), "123 Rue de l'Université",
        // "j.dupont@univ.edu", "0123456789", "vacataire");
        // repertoire.modifierContact(enseignant, enseignantModifie);

        // // Affichage du repertoire
        // System.out.println(repertoire);
    }
}

