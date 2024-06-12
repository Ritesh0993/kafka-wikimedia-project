# Apache Kafka-Wikimedia Producer and Consumer

## Overview
## Project Description

This project is a multimodule Spring Boot application consisting of two main modules:
- **Wikimedia Producer**
- **Wikimedia Consumer**

The application ingests real-time data from Wikimedia, processes it using Apache Kafka, and writes the generated events to a PostgreSQL database.

## Table of Contents
- [Project Overview](#overview)
- [Tech Stack](#tech-stack)
- [Features](#features)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Configuration](#configuration)

## Tech Stack

- **Apache Kafka**: Distributed event streaming platform
- **Spring Boot**: Framework for building Java-based applications
- **Java 17**: Programming language used for the project
- **PostgreSQL**: Relational database management system

## Features

- Real-time data ingestion with Apache Kafka
- Efficient data processing and transformation using Spring Boot
- Reliable storage with PostgreSQL
- Scalable and fault-tolerant architecture

- ## Getting Started

To get a local copy of the project up and running, follow these simple steps.

### Prerequisites

- Java 17
- Apache Kafka
- PostgreSQL
- Maven


### Installation

1. **Clone the repo**

    ```sh
   [ git clone https://github.com/your_username/wikimedia-apache-kafka-project.git](https://github.com/Ritesh0993/kafka-wikimedia-project.git)
    ```

2. **Navigate to the project directory**

    ```sh
    cd wikimedia-apache-kafka-project
    ```

3. **Install Maven dependencies**

    ```sh
    mvn clean install
    ```

4. **Set up PostgreSQL database**

    - Create a PostgreSQL database.
    - Update the `application.properties` file with your database configuration.

5. **Start Kafka server**

    Ensure Kafka server is up and running. Refer to the [Kafka Quickstart Guide](https://kafka.apache.org/quickstart) if needed.

6. **Run the application**

- for Running the Producer, Open the "SpringBootProducerApplication" and run as java Application.
- for Running the Consumer, Open the "SpringBootConsumerApplication" and run as java Application.

## Configuration

Below are the configuration details for the producer, consumer, and PostgreSQL database.

### Producer Configuration
```properties
spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
```
### Consumer Configuration
```properties
server.port= 8090

#Kafka Consumer Properties
spring.kafka.topic.name=wikimedia_recentChange

spring.kafka.consumer.bootstrap-servers = localhost:9092
spring.kafka.consumer.group-id = myGroup
spring.kafka.consumer.auto-offset-reset = earliest
spring.kafka.consumer.key-deserializer = org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=  org.apache.kafka.common.serialization.StringDeserializer

# PostgresSQL

spring.datasource.url=jdbc:postgresql://localhost:5432/your-Db-name
spring.datasource.username=yourname
spring.datasource.password=password

#Hibernate

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments = true
spring.jpa.properties.hibernate.format_sql = true
```


