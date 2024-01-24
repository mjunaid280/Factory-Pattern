## Factory-Pattern

# Problem Statement:

You are working on a logistics application that needs to handle shipments of different types, including ground shipments and air shipments. Each type of shipment has specific handling requirements, and new types of shipments may be introduced in the future.

Design a system using the Factory Method design pattern to address the following requirements:

Define a Shipment interface with methods such as prepare() and dispatch() that are common to all types of shipments.
Implement concrete classes for GroundShipment and AirShipment, each representing a specific type of shipment.
Create a ShipmentFactory interface with a method for creating instances of the Shipment interface.
Implement concrete factories, such as GroundShipmentFactory and AirShipmentFactory, that create instances of the corresponding concrete shipment classes.
Ensure that the client code can create different types of shipments through the factory without specifying their concrete classes explicitly.
Allow for the easy addition of new types of shipments without modifying existing client code.
Consider the following aspects in your design:

How to structure the shipment classes and their common interface.
How to organize the factory interface and its concrete implementations.
How to ensure that the client code remains agnostic to the specific classes of shipments it creates.
Your solution should demonstrate the use of the Factory Method pattern to create different variants of shipments while maintaining a flexible and extensible system.
