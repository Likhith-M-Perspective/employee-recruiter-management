# employee-recruiter-management
Demo Spring Boot + MySQL backend for internship
# Employee & Recruiter Management System (Spring Boot + MySQL)

## Overview
This is a demo backend project that simulates an Employee & Recruiter management system.
It uses **Spring Boot** for REST APIs and **MySQL** for persistence. Unique email IDs are used as primary identifiers.

## Features (Demo)
- User registration with unique email ID
- Employee & Recruiter entity tables
- REST endpoints to fetch by email (GET) and create (POST)
- Simple project scaffold: entities, repositories, controllers

## API examples
- `POST /users/register` → Register user
- `GET  /users/email/{email}` → Fetch user by email
- `POST /employees` → Add employee
- `GET  /employees/email/{email}` → Get employee by email
- `POST /recruiters` → Add recruiter
- `GET  /recruiters/email/{email}` → Get recruiter by email

## How to run (local)
1. Clone repo
2. Update `src/main/resources/application.properties` with DB credentials
3. Create database `jobportal`
4. Run with `mvn spring-boot:run` or from IDE

## Notes
This is a demo scaffold prepared for internship submission. Full features (auth tokens, frontend, validations) are planned in the next phase.
