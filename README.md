# Core Java - Java Essentials

- Java Can be used to develop Smartphone Apps, Websites, Server Side Process's

## Development Environment

- Java SDK
- Maven/Gradle (Build Tool)
- IDE (Eclipse, IntelliJ IDEA, etc.,)

## Object Oriented Programming

- Objects are all around us. Our brains naturally see the world as an organized collection of various objects.
- Object Oriented Programming is a programming paradigm that organizes software around objects. It is a natural and pragmatic way of modelling the real world.

### OOP Benefits

- **Software Modularity** : The source code for an object can be written, maintained and evolved independently from the code of other objects.
- **code re-use**         : Think of all the libraries.
- **Encapsulation**       : Information Hiding - Hide implementation details from the outside world. Thus increasing the robustness of code.

## 01. Object

- A software construct that models real world concepts. Everything in this world can be modelled as an object. An object needs to have **State** and **Behaviour**

Example: Aircraft Object

- **State** (Properties)       : Maximum **Altitude**, Maximum **Speed**, Fuel **Capacity**, **Wingspan**
- **Behaviour** (Capabilities) : Land, Take off, Dump fuel

State is modelled by fields. Behaviour is modelled by methods.

As a best practice, objetcs should remain in control of how the outside world can use them. **It must hide away as much implemntation detail as possible and expose only the appropriate behaviour**.

## 02. Class

- A class is a prototype from which objects can be created/instantiated. It contains all the properties and methods that are common to all objects of that type.

Defining a class in Java

 - **class** keyword
 - class name
 - class body between curly brackets.
 - fields (state), methods (behavior) within the body

By default a class is visible only in its own package.

**Access Modifier's** can be used to make a class more or less visible.

A public class is visible to any other class in the project.

A class can extend another class by using the **Extend keyword** and can implement one or more interfaces using the **implements** keyword.

Class Anatomy

- Class access modifier
- **class** keyword
- class name
- Superclass and/or interfaces
- fields
- methods

## Concepts/Topics

- Objects
- Classes and Static Members
- Packages (Code/Classes Organization)

- Modelling State (Instances) & Behaviour (Static Fields & Methods)

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

- Variables
- Data Types
- Constructors & Initializers
- Operators
- Garbage Collection
- String Processing
- Date Processing
- Control Flow
- Methods
- Parameter Handling
- Language/Java Construct (Enum Types, Nested Classes, etc.,)
- Statement Syntax
- Comments: Line Comments, Block Comments

## Various

- Domain Oriented Code
- Run the application from the **Command Line** without an **IDE**.
