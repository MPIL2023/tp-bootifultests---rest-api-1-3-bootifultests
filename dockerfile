# Utilise l'image de base openjdk:8-jdk-alpine
FROM openjdk:8-jdk-alpine

# Copie le fichier jar de l'application
COPY target/my-api-adder.jar my-api-adder.jar

# Exécute la commande pour lancer l'application
CMD ["java", "-jar", "my-api-adder.jar"]

# Expose le port sur lequel l'application sera exécutée
EXPOSE 8090