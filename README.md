## Overview

Demonstration of deploying a Spring Boot 2 application as a war into
Tomcat running inside a Docker container.

Running as standalone war is working correctly to access `http://localhost:8080/doit`

Current issue: the application deploys inside Tomcat but the published path cannot
be accessed `http://localhost:8080/springbootify/doit`

## Prerequisites

* Docker

## Running

To build:

`./gradlew build`

To run war standalone:

`java -jar build/libs/springbootify.war`

To run in Docker Tomcat container:

`./gradlew build docker dockerRun`

To tear down the docker container:

`./gradlew dockerStop`