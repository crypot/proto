#!/bin/bash
#this script installs maven proto dep to the system
mvn clean
mvn compile
mvn jar:jar
mvn install:install-file -Dfile=./target/proto-0.0.1-SNAPSHOT.jar -DpomFile=./pom.xml