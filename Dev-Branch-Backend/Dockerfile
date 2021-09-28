FROM maven:3-openjdk-14
COPY . ./build
WORKDIR /build
RUN mvn install

FROM openjdk:14
COPY --from=0 /build/target/Dev-Branch-Backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]]


