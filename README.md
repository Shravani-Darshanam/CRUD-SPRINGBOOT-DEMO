# CrudSpringBootDemo

A simple Spring Boot REST API for managing student records, built as a learning/demo project to practice CRUD architecture (Controller → Service → Repository → Entity).

## 🧱 Tech Stack

- **Java** (Spring Boot)
- **Spring Web** (REST Controllers)
- **Jakarta Persistence (JPA annotations)**
- **Postman** for API testing

> Note: This project currently excludes `DataSourceAutoConfiguration`, so it does **not** persist data to a real database yet — the repository layer is a stub. See [Roadmap](#-roadmap) below.

## 📁 Project Structure

```
com.nikky.CrudSpringBootDemo
├── CrudSpringBootDemoApplication.java   # Main entry point
├── controller
│   └── StudentController.java           # REST endpoints
├── service
│   └── StudentService.java              # Business logic layer
├── repository
│   └── StudentRepository.java           # Data access layer (stub)
└── entity
    └── Student.java                     # Student data model
```

## 🎓 Student Entity

| Field    | Type   | Description         |
|----------|--------|----------------------|
| id       | long   | Unique identifier    |
| name     | String | Student's name       |
| age      | int    | Student's age        |
| email    | String | Student's email      |
| rollNo   | int    | Roll number          |
| subject  | String | Subject enrolled in  |

## 🚀 Getting Started

### Prerequisites
- Java 17+ (or your configured JDK version)
- Maven

### Run the application
```bash
./mvnw spring-boot:run
```

The app starts on `http://localhost:8080` by default.

## 📡 API Endpoints

### Create a Student

**POST** `/api/students/create`

**Request Body:**
```json
{
  "id": 1,
  "name": "shravani",
  "email": "shravani@gmail.com",
  "age": 21,
  "rollNo": 101,
  "subject": "springboot"
}
```

**Response:** `200 OK`
```
Student created successfully
```

> More endpoints (GET, UPDATE, DELETE) coming soon — see roadmap.

## 🗺️ Roadmap

- [ ] Connect a real database (H2 for local dev, or MySQL/Postgres for production)
- [ ] Enable `DataSourceAutoConfiguration` and configure `application.properties`
- [ ] Convert `StudentRepository` to extend `JpaRepository<Student, Long>`
- [ ] Add `@GeneratedValue` for auto-incrementing `id`
- [ ] Add GET (fetch all / fetch by id), UPDATE, and DELETE endpoints
- [ ] Return `ResponseEntity<Student>` instead of plain strings
- [ ] Add input validation (`@NotNull`, `@Email`, etc.)
- [ ] Add exception handling with `@ControllerAdvice`
- [ ] Write unit and integration tests

## 🧑‍💻 Author

Shravani Darsham
