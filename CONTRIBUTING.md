# Contributing to Library System Backend

Thank you for considering contributing to the **Library System Backend** project! This document provides guidelines for the development, deployment, and contribution process to ensure smooth collaboration.

## Table of Contents
1. [Project Setup](#project-setup)
2. [Development Workflow](#development-workflow)
3. [Branching Strategy](#branching-strategy)
4. [CI/CD Configuration](#ci-cd-configuration)
5. [Deployment Process](#deployment-process)
6. [Code Reviews and Pull Requests](#code-reviews-and-pull-requests)
7. [Version Control](#version-control)

---

### Project Setup

#### Prerequisites
Before contributing, ensure you have the following tools installed on your local machine:
- **Java 11+**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven**: For building the project, [install Maven](https://maven.apache.org/download.cgi)
- **Git**: [Install Git](https://git-scm.com/)
- **Docker** (optional): For containerized deployment, [install Docker](https://www.docker.com/get-started)
- **PostgreSQL** (or any other relational database)

#### Setting Up Locally

1. **Clone the repository**:
   ```bash
   git clone [https://github.com/your-username/library-system-backend.git](https://github.com/ajazire/LibraryBookManagementSystem.git)
   cd CRUDApplication
   ```

2. **Database Setup**:
   - Ensure your PostgreSQL server is running.
   - Create a database for the application:
     ```sql
     CREATE DATABASE Books;
     ```

3. **Configure the application**:
   - Update the `application.properties` or `application.yml` file located in `src/main/resources/` with your local database credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/library_system
     spring.datasource.username=username
     spring.datasource.password=password
     ```

4. **Build and run the application**:
   - Build the project:
     ```bash
     mvn clean install
     ```
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

5. **Testing**:
   - To run unit and integration tests:
     ```bash
     mvn test
     ```

---

### Development Workflow

To maintain a clean and organized codebase, follow this development workflow:

1. **Fork the repository**.
2. **Create a new branch** based on the `develop` branch.
   - Use meaningful branch names, e.g., `feature/add-book-api` or `bugfix/fix-loan-issue`.
   - Create the branch:
     ```bash
     git checkout -b feature/your-feature-name
     ```

3. **Make your changes**:
   - Ensure your code follows the project’s coding standards.
   - Write tests for new features or bug fixes.

4. **Run tests locally** to ensure no functionality is broken:
   ```bash
   mvn test
   ```

5. **Commit your changes** with a clear, concise commit message:
   ```bash
   git commit -m "Add feature to manage book loans"
   ```

6. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Submit a Pull Request**:
   - Open a PR against the `develop` branch.
   - Ensure that you fill out the PR template, describing what changes have been made and their purpose.

---

### Branching Strategy

We follow **GitFlow** to maintain an organized and efficient branching model:

1. **Main Branches**:
   - `main`: The production-ready branch containing stable releases.
   - `develop`: The default branch for development. All new features and fixes are merged here before release.

2. **Feature Branches**:
   - **feature/feature-name**: Branch off from `develop` for developing new features. Once completed and tested, open a pull request to `develop`.

3. **Hotfix Branches**:
   - **hotfix/hotfix-description**: Created from `main` to fix critical issues. After the fix, merge back into both `main` and `develop`.

4. **Release Branches**:
   - **release/version-number**: Created from `develop` when preparing for a new production release. Merges back into `main` and `develop` upon release.

---

### CI/CD Configuration

We use **GitHub Actions** for continuous integration and continuous deployment (CI/CD) to automate testing, building, and deploying the application.

#### CI: Continuous Integration
1. **Automated Testing**:
   - GitHub Actions runs tests on each push and pull request.
   - Located in the `.github/workflows/ci.yml` file:
     ```yaml
     name: Java CI

     on:
       push:
         branches:
           - develop
       pull_request:
         branches:
           - develop

     jobs:
       build:
         runs-on: ubuntu-latest

         steps:
         - uses: actions/checkout@v2
         - name: Set up JDK 11
           uses: actions/setup-java@v1
           with:
             java-version: '11'
         - name: Build with Maven
           run: mvn clean install
         - name: Run Tests
           run: mvn test
     ```

#### CD: Continuous Deployment
1. **Automated Deployment**:
   - After successfully passing tests on the `main` branch, the application is automatically deployed to **Heroku** (or any other cloud provider).
   - Located in the `.github/workflows/deploy.yml` file:
     ```yaml
     name: Deploy to Heroku

     on:
       push:
         branches:
           - main

     jobs:
       deploy:
         runs-on: ubuntu-latest

         steps:
         - uses: actions/checkout@v2
         - name: Deploy to Heroku
           run: |
             heroku deploy:jar target/CRUDApplication.jar --app ajazire
           env:
             HEROKU_API_KEY: ${{ secrets.HEROKU_API_KEY }}
     ```

2. **Secrets**:
   - Set up secrets like `HEROKU_API_KEY` in GitHub repository settings to securely deploy to the cloud provider.

---

### Deployment Process

#### Deploying Locally
After building the application:
```bash
java -jar target/library-system-backend-0.0.1-SNAPSHOT.jar
```

#### Deploying via Docker
1. **Build Docker image**:
   ```bash
   docker build -t library-system-backend .
   ```

2. **Run Docker container**:
   ```bash
   docker run -d -p 8080:8080 library-system-backend
   ```

#### Deploying to Heroku
- Push to the `main` branch to trigger an automatic deployment through GitHub Actions.
- Ensure the Heroku app is set up and linked to the repository.

---

### Code Reviews and Pull Requests

1. All changes must be reviewed via **Pull Requests** (PRs). Ensure that:
   - The PR title is descriptive.
   - The PR includes details of the changes made.
   - Tests have been added for new features or bug fixes.

2. At least one project maintainer must review the PR before it is merged.

3. Follow the established **coding standards** and address all comments before the PR is merged.

---

### Version Control

We follow **Semantic Versioning** for tagging releases:
- **vMAJOR.MINOR.PATCH** (e.g., `v1.0.0`)
  - **MAJOR**: Incompatible API changes.
  - **MINOR**: New functionality that is backward-compatible.
  - **PATCH**: Bug fixes or small changes.

#### Creating a New Release
1. Tag the version before merging into `main`:
   ```bash
   git tag -a v1.0.0 -m "Release version 1.0.0"
   git push origin --tags
   ```

2. Create a new GitHub Release with detailed release notes.

---

Thank you for contributing to the project! Your help is invaluable, and we appreciate your effort to maintain high-quality code and documentation.

---
