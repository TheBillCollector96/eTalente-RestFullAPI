# Assessment Project - Katlego Mtileni - eTalente Spring Boot RestFull API

This is a Spring Boot application developed for an assessment project at eTalente. The project demonstrates a RESTful API built using modern Java practices, featuring endpoints for managing specific resources generically.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Features](#features)
- [Usage](#usage)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- **Java 17** (Oracle OpenJDK 22.0.1)
- **Maven** (version 3.8+)
- **Spring Boot** (framework included in the project dependencies)
- **Development Environment**:
  - IntelliJ IDEA
  - Spring Tool Suite 4 (STS)

## Setup Instructions

To get started with this project:

1. Clone the repository:
   ```bash
   git clone [<repository-url>](https://github.com/TheBillCollector96/eTalente-RestFullAPI.git)
   ```

2. Navigate to the project directory:
   ```bash
   cd assessment.grad001.katlegomtileni
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application at:
   - **Local environment**: `http://localhost:8080`
   - **Swagger API Documentation**: `http://localhost:8080/swagger-ui.html` (if Swagger is enabled).

## Features

This project includes the following features:

- **REST API Endpoints**: 
  - CRUD operations for managing resources.
  - Well-structured API response handling.
- **Error Handling**:
  - Custom exceptions and global exception handling.
- **Swagger Integration**:
  - Interactive API documentation for testing and exploring endpoints.
- **Database Support**:
  - Integration with a relational database (In-Memory H2).
- **Testing Suite**:
  - Unit and integration tests using JUnit and Mockito.

## Usage

### API Endpoints

Here is a sample structure of available endpoints:

| Method | Endpoint          | Description                  |
|--------|-------------------|------------------------------|
| GET    | `/api/resources`  | Retrieve all resources       |
| POST   | `/api/resources`  | Create a new resource        |
| PUT    | `/api/resources/{id}` | Update an existing resource |
| DELETE | `/api/resources/{id}` | Delete a resource           |

### Example Request

#### Create a Resource
```bash
curl -X POST http://localhost:8080/api/resources \
-H "Content-Type: application/json" \
-d '{
  "name": "Sample Resource",
  "description": "This is a sample resource."
}'
```

## Testing

To ensure the application works as expected, execute the test suite:

1. Run all tests:
   ```bash
   mvn test
   ```

2. Check test coverage reports (if configured).

3. Postman can also be used as an alternative to test the endpoints of the api

### Technologies Used in Testing
- **JUnit**: Unit testing framework.
- **Mockito**: For mocking dependencies during tests.

## Contributing

Contributions to this project are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit:
   ```bash
   git commit -m "Add feature name"
   ```
4. Push to your fork:
   ```bash
   git push origin feature-name
   ```
5. Submit a pull request.

## License

This project is licensed under the eTalente License. See the [LICENSE](LICENSE) file for details.
