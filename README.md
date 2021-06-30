# shows-graphql-api
[![Java CI with Gradle](https://github.com/louisthomas/shows-graphql-api/actions/workflows/gradle.yml/badge.svg)](https://github.com/louisthomas/shows-graphql-api/actions/workflows/gradle.yml)

Graphql and Rest api example developped with [DGS framework](https://netflix.github.io/dgs/)


## Prerequisites
Make sure you have installed all of the following prerequisites on your development machine:
* Docker - [Download & Install Docker](https://docs.docker.com/get-docker/).
* Java 11

## Run Locally

Clone the project

Go to the project directory

```bash
  cd shows-graphql-api
```

Run with [com.demo.showsgraphqlapi.TestApplication](src/test/java/com/demo/showsgraphqlapi/TestApplication.java). It includes testcontainer to start MongoDb and SpringBootApplication.

[Test Rest API endpoints](restapi-show-requests.http)

[Test GraphQL endpoint](graphql-show-requests.http)


## Authors

- [@louisthomas](https://www.github.com/louisthomas)
