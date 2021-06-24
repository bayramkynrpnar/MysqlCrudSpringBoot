FROM openjdk:8-jdk-alpine


# ARG PACKAGED_JAR=target/MysqlCrudSpringBoot-0.0.1-SNAPSHOT.jar

# ADD ${PACKAGED_JAR} MysqlCrudSpringBoot-0.0.1-SNAPSHOT.jar

COPY ./target/. .

EXPOSE 8080

ENTRYPOINT ["java","-jar","MysqlCrudSpringBoot-0.0.1-SNAPSHOT.jar"]