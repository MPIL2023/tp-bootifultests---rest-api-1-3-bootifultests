# Utilise l'image de base openjdk:8-jdk-alpine
FROM openjdk:8-jdk-alpine

# Copie le fichier jar de l'application
COPY target/my-application.jar app.jar

# Exécute la commande pour lancer l'application
CMD ["java", "-jar", "app.jar"]

# Expose le port sur lequel l'application sera exécutée
EXPOSE 8080