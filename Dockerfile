FROM eclipse-temurin:23
LABEL maintainer="rafaroga46@gmail.com"
WORKDIR /dockerImage
COPY target/pecaFacil-0.0.1-SNAPSHOT.jar /dockerImage/pecaFacil.jar
ENTRYPOINT ["java","-jar","pecaFacil.jar"]

