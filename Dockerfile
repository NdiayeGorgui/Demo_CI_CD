# Utilise une image Java officielle (JDK 17 ici)
FROM openjdk:17-jdk-slim

# Crée un répertoire de travail
WORKDIR /app

# Copie le fichier .jar dans le conteneur
COPY target/myapp.jar app.jar
EXPOSE 8082
# Commande de démarrage
ENTRYPOINT ["java", "-jar", "app.jar"]
