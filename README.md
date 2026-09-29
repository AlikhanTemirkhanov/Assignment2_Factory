# Assignment 2 - Factory Method & Abstract Factory

## Domain
Smart Home System

## Product Types
- Smart Light
- Smart Thermostat
- Security Camera

## Product Families
- HomeKit
- Google
- Alexa
- Samsung

## Design Patterns

### Factory Method
The Factory Method pattern is implemented using `LightCreator`.
Concrete creators create family-specific SmartLight objects.

### Abstract Factory
The Abstract Factory pattern is implemented using `SmartHomeFactory`.
Each concrete factory creates a compatible family of:
- Smart Light
- Smart Thermostat
- Security Camera

## Business Operations
The SmartHomeSystem provides:
- Activate Home
- Night Mode
- Away Mode
- Security Mode

Each operation works with product interfaces instead of concrete product classes.

## Runtime Family Selection
The product family can be selected at runtime using a command-line argument.

Example:

```text
samsung