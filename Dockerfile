FROM openjdk:11-alpine
COPY target/demo-*-all.jar demo.jar
EXPOSE 8080
ENV aws_secretkey="mock"
ENV aws_accesskey="mock"
ENV dynamo_endpoint="http://yegor:8000"
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "demo.jar"]