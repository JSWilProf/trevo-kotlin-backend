FROM eclipse-temurin:17-jre-ubi9-minimal
VOLUME /tmp
ENV JAR_FILE build/libs/trevo-1.0.0.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Xmx512m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]