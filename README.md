# Taco Cloud

Taco Cloud is a sample web application built to demonstrate concepts from *Spring in Action*. This project allows users to design taco creations, place orders, and validate delivery and payment information using Spring Boot, Thymeleaf, and other Spring technologies.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Validation & Error Handling](#validation--error-handling)
- [License](#license)

## Features

- **Taco Design:** Customize tacos by choosing from various ingredients like wraps, proteins, cheeses, veggies, and sauces.
- **Order Submission:** Review taco selections and submit an order with delivery and payment details.
- **Server-Side Validation:** Input is validated on the server using annotations such as `@NotBlank`, `@Pattern`, and `@Digits`.
- **Session Management:** Manage orders through session attributes, allowing users to design multiple tacos before placing the order.
- **Responsive UI:** Render a user-friendly interface using Thymeleaf templates styled with CSS.

## Technologies

- **Spring Boot** for building the web application.
- **Spring MVC** for handling HTTP requests and responses.
- **Thymeleaf** for server-side HTML templating.
- **Hibernate Validator** for bean validation.
- **Lombok** to reduce boilerplate code.
- **Maven** for project build and dependency management.

## Getting Started

### Prerequisites

- **Java 11** or higher.
- **Maven** installed.
- An IDE (e.g., IntelliJ IDEA or Eclipse) for development.

### Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/annasergeevaGIT/taco.git
   cd taco

Build the Project:

Use Maven to build the project:

mvn clean install

1. **Run the Application:**

Run the Spring Boot application using Maven:

      mvn spring-boot:run

Alternatively, run the generated jar file:

      java -jar target/taco-cloud-0.0.1-SNAPSHOT.jar

Access the App:

Open your web browser and navigate to http://localhost:8080 to access Taco Cloud.

Project Structure
-----------------
    taco/
    ├── src/
    │   ├── main/
    │   │   ├── java/tacos/          # Application source code
    │   │   │   ├── TacoOrder.java   # Order model with validation annotations
    │   │   │   ├── Taco.java        # Taco model
    │   │   │   └── web/             # Controllers for design and order processing
    │   │   ├── resources/
    │   │   │   ├── static/          # Static assets (CSS, images, JavaScript)
    │   │   │   └── templates/       # Thymeleaf templates (orderForm.html, design.html, etc.)
    │   └── test/                    # Test cases
    └── pom.xml                      # Maven configuration file

### Usage
#### Design Your Taco:
Navigate to /design to create your custom taco by selecting ingredients. The selected ingredients are stored in the session as you design each taco.

#### Place Your Order:
Once your taco designs are ready, go to /orders/current to review your order, enter delivery information, and provide payment details. Validation errors will be displayed next to the form fields using Thymeleaf and CSS.

### Validation & Error Handling
The application uses Spring’s validation framework with Hibernate Validator to enforce:

Non-empty fields (e.g., delivery name, street, city, state, zip code).

Properly formatted credit card numbers and expiration dates.

Numeric validation for fields like CVV.

Validation errors are displayed next to the form fields using Thymeleaf error attributes and styled via CSS.

### License
This project is licensed under the MIT License.