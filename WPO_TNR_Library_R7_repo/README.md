# Source pour TNRA sur GIREVE WPO

## Plan du document
#### 1 . Objectifs du projet 
#### 2 . Objectifs du document
#### 3 . Pourquoi a-t-on besoin de coder nos Tests De Non Régression
#### 4 . Comment concevoir un cas de Test codé ? (Java)
#### 5 . Compiler & importer sur TestProject
#### 6 . Evolutions à venir sur TestProject
#### 7 . Points à améliorer sur l'implémentation actuelle
#### 8 . Ressources Supplémentaires
#### 9 . Lexique


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
TestProject permet de concevoir des tests : 
-   Sur son interface native : 
[InterfaceNative_TestProject](/images/ConceptionCasDeTest_IHMTP.PNG "Interface native")
-   En important des tests codés (Java, Python , C#) en local et en les incluant dans les tests.

__*Pourquoi faire appel à des tests codés ?*__
### Appel à des bibliothèques externes
L'outil TestProject propose déjà un ensemble de fonctions de base (telles que "Clicker", "Taper un texte dans", etc.). Par ailleurs, les fonctions ajoutées par la communauté sont également utilisables dans nos cas de test. Cela permet d'interagir avec un grand nombre d'éléments Web. 
L'utilisation de tests codés permet néanmoins de faire appel directement aux fonctions de la bibliothèque [Selenium Webdriver](https://www.selenium.dev/documentation/en/webdriver/) ainsi qu'à d'autres fonctions Java qui pourront être utiles dans nos cas de test (Split de Stings, rcupération de la date du jour, etc.).

### Scenarii conditionnels
Dans certains Use Case du site WPO, un grand nombre de fonctions requièrent des protocoles (suites d'actions) dépendant d'un grand nombre de paramètres (par exemple , cliquer sur "un réseau" ou "une operaion" lors de la créatio d'une offre, cliqquer sur un jour donné lorsque l'on précise le fonctionnement en horaires, etc.). L'interface TestProject gère mal ces conditions et **il est nécessaire de passer par un outil de programmation**.

__*Comment faire interagir des tests réalisés en interface native & en code ?*__
### Interaction entre Tests Codés & Tests Natifs de l'Interface
L'interaction de Cas de Test créés sur interface native & codés présente certaines contraintes.

**On peut :**
-   Inspecter les composants d'un test NON CODÉ (étapes & paramètres) dans l'Interface TestProject
-   Editer directement sur l'IHM un Test NON CODÉ
-   Utiliser dans un test NON CODÉ un test CODÉ ou un test NON CODÉ
-   Utiliser dans un test CODÉ un test CODÉ

En revanche, **on ne peut pas :**
-   Inspecter les composants d'un test CODÉ (étapes & paramètres) dans l'Interface TestProject
-   Editer directement sur l'IHM un Test CODÉ
-   Utiliser dans un test CODÉ un test NON CODÉ


## Conception d'un test codé
### Bibliothèques utilisées
### Architecture Standard
### Grands principes de conception proposés
### Cas particuliers

## Compilation & Importation

## Evolutions à prévoir de l'outil de Test

## Tâches à réaliser si ce




## Pourquoi coder nos Tests de Non Régression.





## Evolutions à venir









## 8 . Ressources additionnelles

L'objectif de ce document n'est pas de fournir des informations concernant l'écriture du Java (documentation très fournie préexistante) ni même l'utilisation des bibliothèques TestProject & Selenium existantes. Au besoin, on pourra se référer aux travaux présents dans ce repository concernant l'utilisation de la bibliothèque Java/ Selenium utilisé.

A titre Informatif, on se propose de rassembler ici quelques sources intéressantes concernant le sujet et que l'intéressé pourra trouver utile : 
- Informations générales sur le Setup de l'Outil : [Setup TestProject GitHub](https://github.com/testproject-io/docs) , [Tutoriels débutant GitHub](https://github.com/testproject-io/docs/tree/master/getting-started)
- Un tutoriel sur tous les aspects de l'outil (Automation Step by Step - Raghav Pal) : [TestProject Youtube Tutorial](https://youtu.be/MsgX5oNAh7k)
- Le Forum TestProject qui permet de répondre à certaines interrogations , qui peuvent être techniques ou liées à l'IHM,etc. : [Forum TestProject](https://forum.testproject.io/)
- La documentation sur le SDK TestProject (SDK = Software Developpement Kit, biblitohèque de développement) :
    - **Classic Java SDK :** La bibliothèque traditionnelle contenant tous les packages nécessaire à l'import de nouveaux cas de Test. Elle est disponible sur la page [Developpement Addon](https://app.testproject.io/#/integrations/develop-addon) . C'est la bibliothèque actuellement utilisée pour notre implémentation.
        - Rapide Tutoriel : [Installation & Usage SDK](https://testproject.io/selenium-appium-powered-sdk/)
        - Le GitHub : [GitHub TestProject Classic Java SDK](https://github.com/testproject-io/java-sdk-examples)
        - Un tutoriel vachement bien (Petri Kainulainen): [TestProject Tutorial](https://www.petrikainulainen.net/testproject-tutorial/)
    - **TestProject SDK type Selenium** TestProject développe actuellement une nouvelle solution de test qui fonctionnerait sans import sur la page Web. Elle permettrait un plus grand contrôle sur les rapports de test, la gestion des erreurs, etc. mais sa structure (fonctions de base, objets, méthodes) diffère légèrement. Par ailleurs, elle ne pourrait pas être mêlée avec des tests Web. *Cette solution pourrait représenter un futur pour notre implémentation des TNR, il est donc intéressant de s'y pencher régulièrement & de se tenir au courant de ses évolutions.*
        - Tutoriel officiel sur le nouveau SDK : [Tutoriel SDK](https://docs.testproject.io/testproject-sdk/java-sdk)
        - Le GitHub : [GitHub TestProject New Java SDK](https://github.com/testproject-io/java-sdk)





## 9. Lexique

### Définitions Générales
**Régression :** Une régression est un défaut introduit dans un logiciel à l'occasion de corrections de bogues ou n'importe quel changement établi dans un logiciel (Wikipedia).

**Test de Non Regression :** Test qui vise à repérer ces régressions les plus tôt possible dans le process de Mise En Production. Plus une régression est remarquée vite, moins elle est chère.

**Use Case :** Un Use case est une fonctionnalité spécifiée qui sera réalisée par un acteur donné (Humain ou logiciel) et qui mène à un résultat donné (Ex: Un client se Log-in).

**Test Case / Cas De Test :** La réalisation d'un *"Use Case"* avec un environnement et des données particulières.

**Campagne de Test :** Un ensemble de Cas de Test qui seront lancés en même temps. La campagne de test présente à la fin de son exécution un rapport qui permet de connaitre les régressions éventulles.

**Outil de Test :** Un logiciel permettant la conception de *Cas de Test* automatisés , leur assemblage en *Campagnes de Test*, leur exécution et la génération d'un rapport.

### Définitions propres à l'outil de Test:

**Agent :**