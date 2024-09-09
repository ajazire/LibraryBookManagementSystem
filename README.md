Library System Backend - Java Application
Table of Contents
Introduction
Prerequisites
Getting Started
Running the Application
Running Tests
Building the Application
Deployment
API Documentation
Contributing
License
Introduction
This project is a Java backend application for a library system, providing REST APIs for managing books, users, and loans. The application is built using Java, Spring Boot, and a relational database.

Prerequisites
Before you start, ensure you have the following installed:

Java 11+
Maven 3.6+
Docker (Optional for containerization)
PostgreSQL/MySQL (or your preferred database)
Getting Started
Clone the repository:

bash
Copy code
git clone [https://github.com/your-username](https://github.com/ajazire/LibraryBookManagementSystem/library-system-backend.git
cd library-system-backend
Set up the database:

Ensure your database is running. The default configuration expects PostgreSQL.
Create a new database for the library system:
sql
Copy code
CREATE DATABASE Books;
Configure the application:

Copy the application.properties or application.yml file from the src/main/resources directory.
Update the database connection properties:
properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/library_system
spring.datasource.username=(username)
spring.datasource.password=(password)

Running the Application
Run the application locally: You can use Maven to run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
Access the API: Once the application is running, the REST APIs will be accessible at:

bash
Copy code
http://localhost:8080/api/v1/
Database Migrations: If you are using Flyway for database migrations, they will automatically run when the application starts.

Running Tests
To run unit and integration tests:

bash
Copy code
mvn test
Building the Application
To build the Java backend application, follow these steps:

Package the application: Use Maven to build and package the application into a .jar file:

bash
Copy code
mvn clean package
This will generate a .jar file in the target directory.

Run the packaged application: After packaging, you can run the .jar file:

bash
Copy code
java -jar target/CRUDApplication-0.0.1-SNAPSHOT.jar
Deployment
Option 1: Deploying Locally
Run the application directly: After packaging, run the .jar file using:
bash
Copy code
java -jar target/lCRUDApplication-0.0.1-SNAPSHOT.jar
Option 2: Docker Deployment
Create a Docker image: Build a Docker image for the application:

bash
Copy code
docker build -t CRUDApplication .
Run the Docker container:

bash
Copy code
docker run -d -p 8080:8080 CRUDApplication
Access the API: The application should be accessible at:

bash
Copy code
http://localhost:8080/api/v1/
Option 3: Deploying to Heroku or AWS
You can follow Heroku's or AWS's documentation for deploying Java Spring Boot applications:
Heroku Spring Boot Deployment
AWS Elastic Beanstalk Deployment
API Documentation
To explore the available APIs, you can use the Swagger UI provided by Spring Boot:
bash
Copy code
http://localhost:8080/swagger-ui.html
Contributing
Fork the repository
Create a new branch (git checkout -b feature-branch)
Commit your changes (git commit -am 'Add new feature')
Push to the branch (git push origin feature-branch)
Open a pull request

License
This project is licensed under the MIT License - see the LICENSE file for details.

CI status badge

![image](https://github.com/user-attachments/assets/06b30541-42b5-45c5-9851-cd1cf1333ba8)

