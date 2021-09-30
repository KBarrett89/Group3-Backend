#! /bin/sh
export DBUrl=$(cat /run/secrets/DBUrl)
export DBPassword=$(cat /run/secrets/DBPassword)
export JWTSecret=$(cat /run/secrets/JWTSecret)

java -jar app.jar

