# Source pour TNRA sur GIREVE WPO
##### Utilisation de l'outil TestProjectavec cas de tests codés

## Plan du document
#### 1 . Objectifs du projet 
#### 2 . Objectifs du document
#### 3 . Pourquoi a-t-on besoin de coder nos Tests De Non Régression
#### 4 . Comment concevoir un cas de Test codé ? (Java)
#### 5 . Compiler & importer sur TestProject
#### 6 . Evolutions à venir sur TestProject
#### 7 . Points à améliorer sur l'implémentation actuelle


#### Lexique


## Objectifs du projet 

Réaliser des cas de tests sur Connect-Place qui visent à vérifier le bon fonctionnement des fonctionnalités de base de l'application au fur et à mesure des évolutions.
Comme ces tests et ce qu'ils vérifient sont similaires et consommateurs de temps, on cherche à automatiser ce processus.

*Cette étude permet donc aussi de déboucher sur une structure préexistante pour l'ajout de nouvelles fonctionnalités (nouveaux Cas de Tests sur WPO - R7, PP, PROD -  mais aussi d'autres applications ayant besoin d'automates IHM.*


## Objectifs du document

L'outil de test choisi au terme d'une étude comparative est **TestProject**, outil gratuit qui propose de construire des cas de test , de les assembler en campagnes de test (jobs) et des les lancer sur des postes de travail muni d'automates (nommés "agents"). 

L'interface TestProject est géré par une application Web (à l'adresse  : [Adresse Site TestProject](https://app.testproject.io/#/projects/)  )

Ce repository vise à indiquer :
- Pourquoi a-t-on besoin de coder nos Tests De Non Régression
- Comment concevoir un cas de Test codé ? (Java)
- Compiler & importer sur TestProject
- Evolutions à venir sur TestProject
- Points à améliorer sur l'implémentation actuelle

***L'architecture actuelle des Cas De Test / Briques de Test sur WPO est expliquée dans les documents suivants :***

## Coder des tests de Non Régression

## Conception d'un test codé
### Bibliothèques utilisées
### Architecture Standard
### Grands principes de conception proposés
### Cas particuliers

## Compilation & Importation

## Evolutions à prévoir de l'outil de Test

## Tâches à réaliser si ce

## Ressources additionnelles

L'objectif de ce document n'est pas de fournir des informations concernant l'écriture du Java (documentation très fournie préexistante) ni même l'utilisation des bibliothèques TestProject & Selenium existantes. Au besoin, on pourra se référer aux travaux présents dans ce repository concernant l'utilisation de la bibliothèque Java/ Selenium utilisé.

A titre Informatif, on se propose de rassembler ici quelques sources intéressantes concernant le sujet et que l'intéressé pourra trouver utile : 
- Le Forum TestProject qui permet de répondre à certaines interrogations , qui peuvent être techniques ou liées à l'IHM,etc. : [Forum TestProject](https://forum.testproject.io/)
- 

## Pourquoi coder nos Tests de Non Régression.





## Evolutions à venir

## Lexique

### Définitions Générales
**Régression :** Une régression est un défaut introduit dans un logiciel à l'occasion de corrections de bogues ou n'importe quel changement établi dans un logiciel (Wikipedia).
**Test de Non Regression :** Test qui vise à repérer ces régressions les plus tôt possible dans le process de Mise En Production. Plus une régression est remarquée vite, moins elle est chère.
**Use Case :** Un Use case est une fonctionnalité spécifiée qui sera réalisée par un acteur donné (Humain ou logiciel) et qui mène à un résultat donné (Ex: Un client se Log-in).
**Test Case / Cas De Test :** La réalisation d'un *"Use Case"* avec un environnement et des données particulières.
**Campagne de Test :** Un ensemble de Cas de Test qui seront lancés en même temps. La campagne de test présente à la fin de son exécution un rapport qui permet de connaitre les régressions éventulles.
**Outil de Test :** Un logiciel permettant la conception de *Cas de Test* automatisés , leur assemblage en *Campagnes de Test*, leur exécution et la génération d'un rapport.

### Définitions propres à l'outil de Test:

