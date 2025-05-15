# Taco Shop

Taco Shop is a web application that allows users to design custom tacos, place orders, and validate delivery and payment information. Built with Spring Boot and Thymeleaf, the application is containerized using Docker, uses PostgreSQL for persistent storage, and integrates Spring Actuator for monitoring.

🔗 Live Demo: [here](https://taco-deployment-latest.onrender.com/)

### Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Deployment](#deployment)
- [Project Structure](#project-structure)
- [License](#license)

### Features

- **Ingredient Selection**: Users can choose from a variety of ingredients to customize their tacos.
- **Order Management**: Users can view their orders and track the status of their taco creations.
- **Responsive Design**: The app is designed to work on both desktop and mobile devices.
- **User Authentication**: Secure login and registration for personalized experiences.
- **Deployment**: The app is deployed on Render for easy access.

### Technologies

- **Spring Boot** for building the web application.
- **Spring MVC** for handling HTTP requests and responses.
- **Thymeleaf** for server-side HTML templating.
- **Hibernate Validator** for bean validation.
- **Lombok** to reduce boilerplate code.
- **Maven** for project build and dependency management.

## Getting Started

### Prerequisites

- **Java 17**
- **Maven**
- IntelliJ IDEA
- Docker

### Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/annasergeevaGIT/taco.git
   cd taco
   ```
Start PostgreSQL & PgAdmin (http://localhost:5050):
   ```bash
   docker-compose up -d
   ```

Build the Project:
   ```bash
   ./mvnw clean package
   ```

Run the Application:
   ```bash
   ./mvnw spring-boot:run
   ```

Access the App:
Open your web browser and navigate to http://localhost:8080 to access Taco Shop.

### API Endpoints

- GET /api/ingredients: Retrieve a list of all available ingredients.
- POST /api/orders: Create a new order with selected ingredients.

### Deployment

🛠 Build the Docker Image

   ```bash
   docker build -t taco-deployment .
   docker tag taco-deployment <yourusername>/taco-deployment:latest
   docker push <yourusername>/taco-deployment:latest
   ```
The Taco App is deployed and can be accessed at the following URL: https://taco-deployment-latest.onrender.com/

Project Structure
-----------------
      taco/
      ├── src/
      │   ├── main/
      │   │   ├── java/
      │   │   │   └── tacos/
      │   │   │       ├── TacoApplication.java # Main Spring Boot entry point
      │   │   │       ├── Taco.java # Entity: Taco
      │   │   │       ├── Ingredient.java # Entity: Ingredient
      │   │   │       ├── TacoOrder.java # Entity: Taco Order
      │   │   │       ├── User.java # Entity: User
      │   │   │       ├── data/
      │   │   │       │   ├── OrderRepository.java # JPA repository for orders
      │   │   │       │   ├── UserRepository.java # JPA repository for users
      │   │   │       │   ├── TacoRepository.java # JPA repository for tacos
      │   │   │       │   └── IngredientRepository.java # JPA repository for ingredients
      │   │   │       ├── data/service/
      │   │   │       │   └── OrderAdminService.java # Business logic for managing orders
      │   │   │       ├── security/
      │   │   │       │   ├── SecurityConfig.java # Spring Security configuration
      │   │   │       │   ├── UserRepositoryUserDetailsService.java # Custom UserDetailsService
      │   │   │       │   ├── RegistrationController.java # Handles user registration
      │   │   │       │   └── RegistrationForm.java # DTO for registration
      │   │   │       └── web/
      │   │   │           ├── DesignTacoController.java # Handles taco design page
      │   │   │           ├── CorsConfig.java # Cross-Origin configuration for REST API
      │   │   │           ├── WebConfig.java # Web MVC configuration
      │   │   │           ├── OrderController.java # Handles taco order requests
      │   │   │           ├── AdminController.java # Admin-related endpoints
      │   │   │           ├── IngredientByIdConverter.java # Custom Spring converter
      │   │   │           └── HomeController.java # Landing/home page
      │   │   └── resources/
      │   │       ├── static.css/
      │   │       │   └── styles.css # App-specific CSS
      │   │       ├── static.images/ # Image assets
      │   │       │   ├── TacoCloud.png
      │   │       │   ├── favicon.svg
      │   │       │   └── TacoShop.png
      │   │       ├── templates/ # Thymeleaf templates
      │   │       │   ├── design.html
      │   │       │   ├── orderForm.html
      │   │       │   ├── login.html
      │   │       │   ├── registration.html
      │   │       │   └── home.html
      │   │       ├── application.properties # Spring Boot configuration
      │   │       └── logback.xml # Logging configuration
      │   └── test/ # Test source files
      ├── .env # Environment variables used in deployment
      ├── docker-compose.yaml # Cloud Postgres & PgAdmin configuration
      ├── Dockerfile # Docker build used in Render deployment
      ├── LICENSE # Project License
      └── pom.xml # Maven project configuration


### License
This project is licensed under the MIT License.
