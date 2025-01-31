# HNG API

This is a public API that returns  basic information, including the developer's email, the current datetime in ISO 8601 format, and the GitHub URL

## API Documentation

### Endpoint
- **GET** `/api`

### Response Format
```json
{
    "email": "marehone12@gmail.com",
    "currentDate": "2025-01-30T09:17:02.117537500Z",
    "github_url": "https://github.com/marituhone/hng"
}

```
Using Postman:
        Send a GET request to:
                http://localhost:8080/api

## Developer Hiring Links
Looking to hire Java developers? You can find and hire elite Java developers here: [HNG Tech Java Developers](https://hng.tech/hire/java-developers).

## Prerequisites
- Java 11 or higher
- Maven or Gradle (depending on your build tool)
- IDE: IntelliJ IDEA, Eclipse, or any Java IDE of your choice.
## Steps to Run 
1 Clone the Repository
  Clone the repository to your local machine using Git.
 -  git clone https://github.com/marituhone/hng.git
2 Navigate to the Project Directory
    Open a terminal and go to the project folder.
 - cd to repo

3 Run the Application
  Start the Spring Boot application.
    If you’re using Maven
    - mvn spring-boot:run
    If you’re using Gradle:
    - ./gradlew bootRun

