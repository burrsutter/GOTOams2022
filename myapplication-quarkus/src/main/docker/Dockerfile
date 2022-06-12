FROM registry.access.redhat.com/ubi8/openjdk-11:1.11

ENV JAVA_APP_JAR myapplication-quarkus-1.0.0-runner.jar
WORKDIR /app/
COPY target/$JAVA_APP_JAR .
EXPOSE 8080
CMD java $JAVA_OPTIONS -jar $JAVA_APP_JAR