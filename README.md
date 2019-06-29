## Overview

Demonstration of deploying a Spring Boot 2 application as a war into
Tomcat running inside a Docker container.

Current issue: the application deploys inside Tomcat but the published path cannot
be accessed `http://localhost:8080/app/help`

## Prerequisites

* Docker

## Running

To run in Docker Tomcat container

`./gradlew build docker dockerRun`

To tear down the docker container:

`./gradlew dockerStop`