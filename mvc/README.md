# Understand Spring MVC

## What is Spring MVC?
Spring MVC is a web framework that handles HTTP requests and responses
using the Model-View-Controller pattern.

## MVC Components
- Model: Holds data
- View: Displays data
- Controller: Handles requests

## Request Flow
Client → DispatcherServlet → Controller → Model → View → Client

## DispatcherServlet
- Front controller of Spring MVC
- Receives all incoming requests
- Routes request to correct controller

## Controller
- Uses @Controller annotation
- Handles URL mappings
