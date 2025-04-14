##### Importation The Baseline image #####
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /spring_app

COPY ../target/simple_pipeline-0.0.1-SNAPSHOT.jar ./

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring.jar"]