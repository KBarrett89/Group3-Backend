FROM maven:3-openjdk-14
COPY . ./build
WORKDIR /build
RUN mvn install

FROM openjdk:14
COPY ./EntryPoint.sh .
COPY --from=0 /build/target/Dev-Branch-Backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "EntryPoint.sh"]]

