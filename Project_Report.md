Project Report: Library System Backend
Introduction
This project involves the development of a Java-based library system backend application. It utilizes Spring Boot and a relational database to provide RESTful APIs for managing books. The project incorporates GitHub's tools for continuous integration (CI), continuous deployment (CD), and code analysis.

Development Process
Initial Setup:

The project started by creating the basic structure using Spring Boot.
PostgreSQL was chosen as the database, and the RESTful API endpoints were defined for managing library resources.
Version Control:

GitHub was used to manage all code changes. The project follows a structured GitFlow branching strategy for managing development and releases.
Commits were tagged using Semantic Versioning, making it easy to track releases and maintain consistency across versions.
Continuous Integration and Deployment:

GitHub Actions was configured to run tests automatically upon code pushes. This pipeline ensures that the code passes all quality checks before merging into the main branch.
A Continuous Deployment pipeline was set up to automatically deploy the application to Heroku upon successful build and test.
Code Quality and Security:

CodeQL was integrated to identify potential security vulnerabilities and maintain code quality. Any detected issues were fixed promptly, ensuring a secure and maintainable codebase.
Collaboration:

GitHub Issues were used to track bugs and feature requests throughout the project.
All changes were reviewed through pull requests, ensuring code quality and proper documentation of new features or bug fixes.
GitHub Releases:

Releases were created for each major version using GitHub Releases. Each release included detailed notes on the changes and improvements made.
Challenges and Learning Process
Challenge: CI/CD Integration:

Setting up GitHub Actions and automating the entire deployment process presented a learning curve. I had to understand how to configure workflows and deploy the application efficiently.
Solution: Leveraged documentation and examples to create customized workflows that suit the project’s needs, ultimately automating the build, test, and deploy processes.

Challenge: Semantic Versioning:

Ensuring proper tagging of commits using Semantic Versioning required coordination across branches and during releases.
Solution: Established a process for tagging before every release, incorporating it into the CI/CD pipeline to minimize manual oversight.

GitHub Facilitated Project Management:

GitHub Actions automated the testing and deployment, significantly speeding up the development cycle.
GitHub Issues streamlined task management, and the integrated pull request process ensured that every change was reviewed thoroughly.
GitHub Releases and tagging helped maintain a clear and structured version history.
Conclusion
This project allowed us as Group 4 to gain hands-on experience with modern development practices, including microservice architecture, CI/CD pipelines, and GitHub's project management features. The combination of automated tools and a structured approach to collaboration made the development process efficient and manageable.
