📘 Spring Boot REST API Project
- This project is a Spring Boot Backend Application that provides REST APIs for performing CRUD operations (Create, Read, Update, Delete).

🛠️ Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
  
📂 Project Structure
src/main/java/STS/SpringBoot/
|
├── - controller        # REST API Controller
├── - services          # Service Interfaces
├── - services.impl     # Service Implementation
├── - repository        # JPA Repositories[DAO]
├── - model             # Entity Class
├── - exception         # Exception Handling

🔁Run the project
-Run the main class: SpringBootBackendApplication.java

🔥 REST API Endpoints
- Method	Endpoint	Description
- GET	/api/employees    	    = Get all records
- GET	/api/employees/{id}     =	Get record by ID
- POST	/api/employees	      = Create new record
- PUT	/api/employees/{id}     =	Update record
- DELETE	/api/employees/{id} =	Delete record

🧪 API Testing using Postman
- Use Postman to test APIs.
- Base URL = http://localhost:8080/api/......

▶️ How to Run
- Start MySQL server
- Run Spring Boot application
- Open Postman and test APIs

📌 Features
- Layered Architecture
- RESTful API Design
- CRUD Operations
- Database Integration (MySQL)
