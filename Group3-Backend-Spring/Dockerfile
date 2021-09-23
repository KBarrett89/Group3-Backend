FROM maven:3-openjdk-11
COPY . ./build
WORKDIR /build
RUN mvn install

FROM openjdk:11
COPY --from=0 /build/target/Group3-Backend-Spring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]]


