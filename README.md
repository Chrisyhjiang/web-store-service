# web-store-service

This repository contains a RESTful API for managing an online store shopping cart and product categories, built using the Spring Boot framework.

## Features

- Category Management:
  - Create new product categories
  - Update existing categories
  - Delete categories
  - List all categories with pagination and sorting
- Input Validation
- Global Exception Handling
- Paginated Responses

## Technologies

- **Spring Boot 3.3** - Framework used to build the RESTful API
- **Spring Data JPA** - Data persistence and ORM
- **H2 Database** - In-memory database for development/testing
- **ModelMapper** - Object mapping between DTOs and entities
- **Lombok** - Reduces boilerplate code
- **Hibernate Validator** - Input validation
- **Maven** - Dependency management and build tool
- **Java 22** - Programming language

## Prerequisites

Make sure you have the following installed:

- Java 22 or later
- Maven 3.6+
- Git

## Getting Started

### Clone the repository

- git clone https://github.com/Chrisyhjiang/web-store-service.git
- cd /path/to/web-store-service
- mvn clean install



## API Endpoints

### Categories
- GET /api/public/categories - Get all categories (paginated)
- POST /api/public/categories - Create a new category
- PUT /api/public/categories/{categoryId} - Update a category
- DELETE /api/admin/categories/{categoryId} - Delete a category

## Query Parameters for GET /categories
- pageNumber (default: 0)
- pageSize (default: 50)
- sortBy (default: categoryId)
- sortOrder (default: asc)

## Testing
- Use Postman or any API testing tool to test the endpoints
- H2 Console available at /h2-console for database inspection