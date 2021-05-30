# Application Where Party

## Présentation :

Voici le projet application mobile de 3A sous Android Studio développée en Java.

Cette application a pour but de trouver les évènements musicaux qui se trouvent dans une ville proche.

## Fonctionnalités :

### Ecran d'accueil

- Possibilité de rechercher une ville ou d'appuyer sur le bouton de localisation afin de chercher les villes à proximité
- Si les données d'une ville sont sauvegardées en cache cela affiche directement cette ville comme sur la première image

<img src="readmeImage/Welcome-Cache.png" width= 325> <img src="readmeImage/Welcome-Search.png" width= 325>

### Ecran de choix de l'évènement

- Cette fonctionnalité permet d'afficher la liste des évènements en fonction de la ville choisie

<img src="readmeImage/Liste%20des%20evenements.png" width= 325>

- Pour un élement de la liste on peut :
	- Cliquer sur un artiste et cela nous redirige sur sa page
	- Cliquer sur l'endroit et cela nous redirige sur la page de la salle
	- Cliquer ailleurs et cela nous redirige sur la page de l'évènement
	
<img src="readmeImage/Un%20evenement.png" width= 325>

### Ecrans d'information

- Voici des exemples de différents écrans pour l'évènement ci-dessous

<img src="readmeImage/Evenement%20-%20Artiste.png" width= 300> <img src="readmeImage/Evenement%20-%20Salle.png" width= 300> <img src="readmeImage/Evenement%20-%20Evenement.png" width= 300>

## Aspect utilisé :

### Pré-requis :

- Ecran avec une liste d'éléments
- Ecran avec le détail d'un éléments 
- Appel WebService à une API Rest
- Stockage de données en cache

### Les plus :

- Architecture :
	- Singleton
	- Design Patterns
	- MVC
	- Principe SOLID
- Gitflow
- Design

### Autres :

- Utilisation de WebView (via Android Studio)
- Ajout d'une icône d'application personnalisé
- Troisième ecran

