# Un "MonoRepo" avec Spring Boot, vue.js et Bootstrap
Le projet s'inscrit dans la création d'une application de gestion de syllabus de l'école d'ingénieurs ISIS.

Le FrontEnd a été développé en VueJS et le Backend a été développé en Java avec le Framework Spring Boot.

Nous avons utilisé Docker & Gitlab pour la CI/CD. Vous pouvez télécharger le projet et le démarrer en local.

N'hésitez pas à me contacter en cas de questions par e-mail. **bakezechiel3231@gmail.com**

## Structure du projet

```
monorepo
├─┬ backend     → backend module with Spring Boot code
│ ├── src
│ └── pom.xml
├─┬ frontend    → frontend module with Vue.js code
│ ├── src
│ └── pom.xml
└── pom.xml     → Maven parent pom managing both modules
```
mvn --prohj
## Pour exécuter le projet

A la racine du projet: 

```
mvn clean install
```
Va construire le frontend, recopier les fichiers dans le backend.

Exécution de l'application "fullstack" :

```
mvn --projects backend spring-boot:run
```

Ouvrir http://localhost:8989/ pour accéder à l'application.

## Utilisation des outils de développement "front-end"

On peut lancer le serveur de développement, qui "rafraîchit" automatiquement le front-end à chaque changement dans le code ! Pour cela, se positionner dans le répertoire `frontend` et lancer :

```
npm run serve
```

## Browser developer tools extension

Installer vue-devtools Browser extension https://devtools.vuejs.org/ dans votre navigateur pour débugger plus facilement le front-end.
