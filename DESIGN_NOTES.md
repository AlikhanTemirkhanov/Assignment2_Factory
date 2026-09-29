# Design Notes

## Part A - Direct Object Creation

In the initial version, objects were created directly inside the client code.

This approach caused several problems:

1. The client code was tightly coupled to concrete product classes.
2. Adding a new product family required changing the client logic.
3. It was easy to mix products from different families accidentally.

For example, the client could directly create a HomeKit light and a Google thermostat.

The Factory Method and Abstract Factory patterns solve these problems by moving object creation into dedicated factory classes.

## Part G - Adding the Fourth Family

The fourth product family is Samsung.

The following files were added:

- SamsungLight.java
- SamsungThermostat.java
- SamsungCamera.java
- SamsungFactory.java

The following existing component was extended:

- FactoryProvider.java

The existing business logic in SmartHomeSystem did not require Samsung-specific code.

SmartHomeSystem works with the SmartHomeFactory abstraction, so it can work with Samsung and the other families without changing its business operations.

## Compatibility

Each concrete Abstract Factory creates products from the same family.

For example:

SamsungFactory creates:

- SamsungLight
- SamsungThermostat
- SamsungCamera

This prevents the client from intentionally mixing products from different families when it uses one SmartHomeFactory.