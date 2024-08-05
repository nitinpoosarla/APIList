FROM openjdk:8
COPY target/APIList-0.0.1-SNAPSHOT.jar APIList-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "/API-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT exec java $JAVA_OPTS -jar /APIList-0.0.1-SNAPSHOT.jar