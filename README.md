# PROYECTOFINALPOO - J&M Veterinary Medical Record System

This project is a desktop system for managing medical records in a veterinary clinic, developed in **Java** as a final project for the Object-Oriented Programming course.

The system allows managing the key entities of the clinic (Veterinarians, Owners, Pets) and managing the complete lifecycle of a Medical Record, from its creation to its export.

The application revolves around **data persistence and management**, using a local **MySQL database (phpMyAdmin)** as the central pillar for all operations.

##  Main Features

* **Entity Management:** Create, Read, Update (CRUD) operations for:
    * Veterinarians
    * Owners
    * Pets
    * etc...
* **Medical Record:**
    * Creation of new clinical records (anamnesis, physical exam, clinical findings, complementary exam, diagnosis).
    * Search for existing medical records by ID.
* **Export:** Generate and save the complete medical record in **PDF** format to your local machine.

---

##  Software Design and Architecture

The project is built on solid OOP foundations and a layered architecture that follows software modeling techniques to separate responsibilities.

### 1. Object-Oriented Programming (OOP) Principles

OOP is the core of the business logic:

* **Object Handling:** All entities (e.g., `Propietario`, `Mascota`, `Historia_Clinica`) are modeled as classes. To send or receive information from the database, objects of these classes are instantiated to encapsulate and transport the data.
* **Encapsulation:** Data integrity is protected using access modifiers (`private`) for attributes, exposing only the necessary `getters` and `setters`.
* **Composition:** Object composition is used to create complex models. For example, the `ImprimirHistoriaClinica` class does not duplicate data; instead, it contains attributes that are **instances of other classes** (e.g., `private Mascota mascota;`), demonstrating a strong "has-a" relationship.

### 2. Layered Architecture (Model-View-Controller-DAO)

The project uses a **modeling and packaging technique** that separates code into layers based on responsibility.

As seen in the package structure:

* `com.mycompany.finalproyectpoo.Models`: Contains the entity classes (POJOs) that model the real world (e.g., `Mascota.java`, `Veterinario.java`, `Historia_Clinica.java`).
* `com.mycompany.finalproyectpoo.DAO`: (Data Access Object) Contains all data access logic. It is the only layer that "knows" how to connect and talk to the database (e.g., `Conexion.java`, `ConexionHistoria.java`).
* `com.mycompany.finalproyectpoo.View`: Contains all the graphical user interfaces (`JFrame`) that the user sees and interacts with (e.g., `interfas.java`, `interfasAnamnesis.java`).

### 3. Graphical Interface (GUI) with Java Swing

* All user interaction is done through a friendly **graphical user interface (GUI)**.
* **`JFrames`** were used to build the multiple windows that make up the application's flow (views to create owners, create pets, register records, etc.).

---

##  Technologies Used

* **Language:** Java
* **IDE:** Netbeans IDE 27
* **Database:** MySQL (managed locally with phpMyAdmin)
* **UI (User Interface):** Java Swing (`JFrame`)

---

##  Installation and Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/JuanTrader500/FinalProyectPOO]
    ```
2.  **Database:**
    * Import the `.sql` files (Will try to include in the repository SOON) into your local **phpMyAdmin** instance to create the table structure.
    * **Configure the connection:** Ensure that the credentials (user, password, port) in the `Conexion.java` class match those of your local MySQL server.
3.  **Open the Project:**
    * Open the project with Netbeans IDE 27.
4.  **Run:**
    * Execute the `main` file (or the main `interfas.java`) to start the application.

---

##  Usage

1.  **Register Entities:** First, make sure to register Veterinarians and Owners in their respective modules.
2.  **Register Pets:** Associate new pets with their existing owners.
3.  **Create Medical Record:** Go to the "Nueva Historia.C" (New Medical Record) module, select the pet, and complete the forms (Anamnesis, Physical Exam, etc.).
4.  **Search and Export:** Use the "Buscar Historia" (Search Record) function (by record ID) and press the "Buscar ID" (Search ID) button. If the ID exists, the option to "imprimir H.C." (print medical record) will appear.
