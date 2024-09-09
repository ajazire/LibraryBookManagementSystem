### Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Getting Started](#getting-started)
4. [Running the Application](#running-the-application)
5. [Running Tests](#running-tests)
6. [Building the Application](#building-the-application)
7. [Deployment](#deployment)
8. [API Documentation](#api-documentation)
9. [Contributing](#contributing)
10. [License](#license)

---

### Introduction
This project is a Java backend application for a library system, providing REST APIs for managing books, users, and loans. The application is built using Java, Spring Boot, and a relational database.

### Prerequisites
Before you start, ensure you have the following installed:
- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.6+](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/get-started) (Optional for containerization)
- [PostgreSQL/MySQL](https://www.postgresql.org/) (or your preferred database)

### Getting Started
1. **Clone the repository**:
   ```bash
   git clone [https://github.com/your-username/library-system-backend.git](https://github.com/ajazire/LibraryBookManagementSystem.git)
   cd CRUDApplication
   ```

2. **Set up the database**:
   - Ensure your database is running. The default configuration expects PostgreSQL.
   - Create a new database for the library system:
     ```sql
     CREATE DATABASE Books;
     ```

3. **Configure the application**:
   - Copy the `application.properties` or `application.yml` file from the `src/main/resources` directory.
   - Update the database connection properties:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/CRUDApplication
     spring.datasource.username=username
     spring.datasource.password=password
     ```

### Running the Application

1. **Run the application locally**:
   You can use Maven to run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the API**:
   Once the application is running, the REST APIs will be accessible at:
   ```
   http://localhost:8080/api/v1/
   ```

3. **Database Migrations**:
   If you are using Flyway for database migrations, they will automatically run when the application starts.

### Running Tests
To run unit and integration tests:
```bash
mvn test
```

### Building the Application
To build the Java backend application, follow these steps:

1. **Package the application**:
   Use Maven to build and package the application into a `.jar` file:
   ```bash
   mvn clean package
   ```
   This will generate a `.jar` file in the `target` directory.

2. **Run the packaged application**:
   After packaging, you can run the `.jar` file:
   ```bash
   java -jar target/CRUDApplication-0.0.1-SNAPSHOT.jar
   ```

### Deployment

#### Option 1: Deploying Locally
1. **Run the application directly**:
   After packaging, run the `.jar` file using:
   ```bash
   java -jar target/CRUDApplication-0.0.1-SNAPSHOT.jar
   ```

#### Option 2: Docker Deployment
1. **Create a Docker image**:
   Build a Docker image for the application:
   ```bash
   docker build -t CRUDApplication .
   ```

2. **Run the Docker container**:
   ```bash
   docker run -d -p 8080:8080 CRUDApplication
   ```

3. **Access the API**:
   The application should be accessible at:
   ```
   http://localhost:8080/api/v1/
   ```

#### Option 3: Deploying to Heroku or AWS
- You can follow Heroku's or AWS's documentation for deploying Java Spring Boot applications:
  - [Heroku Spring Boot Deployment](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku)
  - [AWS Elastic Beanstalk Deployment](https://aws.amazon.com/elasticbeanstalk/)

### API Documentation
- To explore the available APIs, you can use the Swagger UI provided by Spring Boot:
  ```
  http://localhost:8080/swagger-ui.html
  ```

### Contributing
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a pull request

### License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
