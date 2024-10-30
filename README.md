# TP : Localisation en Temps Réel avec Google Maps et Volley

Ce projet est une application Android de localisation en temps réel qui utilise l'API Google Maps pour afficher la position actuelle de l'utilisateur ainsi que d'autres positions pré-enregistrées provenant d'un serveur. L'application utilise la bibliothèque **Volley** pour effectuer des requêtes réseau et récupérer les données de localisation depuis un fichier PHP sur le serveur local.

## Fonctionnalités

- Affichage de la position actuelle de l'utilisateur sur Google Maps
- Affichage des positions pré-enregistrées récupérées depuis un serveur (affichées en tant que marqueurs sur la carte)
- Zoom automatique sur la position actuelle et ajustement pour inclure tous les marqueurs
- Mise à jour périodique de la position de l'utilisateur

## Technologies Utilisées

- **Android** avec Java
- **Google Maps API** pour l'affichage des cartes et des marqueurs
- **Volley** pour les requêtes HTTP
- **PHP** pour fournir les données de localisation

## Configuration du Projet

### Prérequis

1. Android Studio
2. Clé API Google Maps
3. Serveur local (comme XAMPP ou WAMP)

### Étapes de Configuration

1. **Cloner le projet** 
2. **Obtenir une Clé API Google Maps** :
   - Suivez les étapes de la [documentation Google Maps](https://developers.google.com/maps/documentation/android-sdk/get-api-key) pour obtenir une clé API.
   - Remplacez `"YOUR_GOOGLE_MAPS_API_KEY"` dans le fichier `AndroidManifest.xml` par votre clé API.

3. **Configurer le serveur local**
   - Configurez le fichier pour accéder à votre base de données et renvoyer les coordonnées nécessaires sous format JSON.
   
4. **Permissions d'Accès à la Localisation** :
   - Assurez-vous que l'application demande les permissions `ACCESS_FINE_LOCATION` et `ACCESS_COARSE_LOCATION` dans `AndroidManifest.xml`.

5. **Lancer l’Application** :
   - Compilez et exécutez l’application sur un émulateur Android ou un appareil physique pour vérifier le bon fonctionnement de la localisation et l'affichage des marqueurs.


## Vidéo Démonstration et Screens

![image](https://github.com/user-attachments/assets/8b5ecf53-fb70-4a61-bfd9-6284b1108ab2)

![image](https://github.com/user-attachments/assets/ea12373b-b3fb-4070-ae70-05e7bc5bc6d1)


https://github.com/user-attachments/assets/203470af-ea43-4e0b-b669-c6d337c09dbc



