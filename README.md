# Contacts Manager 🗂️

Ce projet réalisé en Java, offre une interface graphique pour gerer un repertoire de contacts (Agents, Enseignants, Etudiants); avec même la possibilité de les enregirstrer dans une base de données, en vue d'une persistance des données

## Fonctionnalités 🛠️

- Le projet offre une interface graphique pour gérer l'ajout de contacts dans un repertoire
- Il offre aussi un affichage graphique des repertoires par catégorie de contacts
- Il offre aussi des interfaces cmd pour des tests
- Il propose enfin la persistance des données via l'utilisation d'une base de données MySQL

## Dépendances 📦

- Ce projet dépend comme on peut le voir dans pom.xml de *mysql-connector-j version 8.2.0* qui est déjà présent dans le projet.

- Le script de création de la BD se trouve dans `src/main/ressources` et se nomme `schema_deb.sql.`

## Execution 🚀

Le est réalisé avec l'outil maven; et donc peut être ouvert et reconfiguré et retesté avec la plupart des IDEs java (NetBeans (celui qui a permis la réalisation), IntelliJ Idea, VSCode ...)

Pour juste l'exécuter, il faut:

- ouvrir un termanal dans le repertoire du projet
- faire `cd target`
- puis `java -jar contacts-manager.jar` (Pour lancer l'application)

## Exemples d'utilisation 🚀

### Interface d'Accueil

![1711974528503](image/README/1711974528503.png)

### Ajout Contact

![adding_contact](src/test/results/images/adding_contact.png)

### Ajout Étudiant

![adding student](src/test/results/images/adding_student.png)

### Ajout Enseignant

![adding_teacher](src/test/results/images/adding_teacher.png)

### Ajout Agent

![adding_agent](src/test/results/images/adding_agent.png)

### Affichage Contacts

![1711974722104](image/README/1711974722104.png)

### Enregistrement dans la BD

![saving](src/test/results/images/saving.png)

### Author ✍️

Ce peojet a été réalisé l'étudiant: **KAMDEM POUOKAM Ivann Harold du 3GI à l'ENSPY.**

## License 📄

This project is under the MIT license - see the LICENSE file for details.

🔗: https://github.com/KpihX/contacts-manager
