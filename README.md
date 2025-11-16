# PROYECTOFINALPOO - Sistema de Historia Clínica Veterinaria J&M

Este proyecto es un sistema de escritorio para la gestión de historias clínicas en una clínica veterinaria, desarrollado en **Java** como proyecto final para la materia de Programación Orientada a Objetos.

El sistema permite administrar las entidades clave de la veterinaria (Veterinarios, Propietarios, Mascotas) y gestionar el ciclo de vida completo de una Historia Clínica, desde su creación hasta su exportación.

La aplicación gira en torno a la **persistencia y gestión de datos**, utilizando una base de datos local **MySQL (phpMyAdmin)** como pilar central para todas las operaciones.

---

##  Características Principales

* **Gestión de Entidades:** Creación, lectura y actualización (CRUD) de:
    * Veterinarios
    * Propietarios
    * Mascotas
    * etc...
* **Historia Clínica:**
    * Creación de nuevos registros clínicos (anamnesis, exámen fisico, hallazgos clinicos, examen complementario, diagnóstico).
    * Búsqueda de historias clínicas existentes por ID.
* **Exportación:** Generación y guardado de la historia clínica completa en formato **PDF** en tu maquina local.

---

## Diseño y Arquitectura del Software

El proyecto está construido sobre fundamentos sólidos de POO y una arquitectura en capas que sigue técnicas de modelado de software para separar responsabilidades.

###  Principios de Programación Orientada a Objetos (POO)

La POO es el núcleo de la lógica del negocio:

* **Manejo de Objetos:** Todas las entidades (ej. `Propietario`, `Mascota`, `HistoriaC`) se modelan como clases. Para enviar o recibir información de la base de datos, se instancian objetos de estas clases que encapsulan y transportan los datos.
* **Encapsulamiento:** Se protege la integridad de los datos utilizando modificadores de acceso (`private`) para los atributos, exponiendo únicamente los métodos `getters` y `setters` necesarios.
* **Composición:** Se utiliza la composición de objetos para crear modelos complejos. Por ejemplo, la clase `ImprimirHistoriaClinica` no duplica datos, sino que contiene atributos que son **instancias de otras clases** (ej. `private Mascota mascota;`), demostrando una fuerte relación de "tiene un".

### Arquitectura en Capas (Modelo-Vista-Controlador-DAO)

El proyecto utiliza una **técnica de modelado y empaquetamiento** que separa el código en capas según su responsabilidad.


Como se observa en la estructura de paquetes:

* `com.mycompany.finalproyectpoo.Models`: Contiene las clases de entidad (POJOs) que modelan el mundo real (ej. `Mascota.java`, `Veterinario.java`, `Historia_Clinica.java`).
* `com.mycompany.finalproyectpoo.DAO`: (Data Access Object) Contiene toda la lógica de acceso a datos. Es la única capa que "sabe" cómo conectarse y hablar con la base de datos (ej. `Conexion.java`, `ConexionHistoria.java`).
* `com.mycompany.finalproyectpoo.View`: Contiene todas las interfaces gráficas de usuario (`JFrame`) que el usuario ve y con las que interactúa (ej. `interfas.java`, `interfasAnamnesis.java`).

###  Interfaz Gráfica (GUI) con Java Swing

* Toda la interacción con el usuario se realiza a través de una **interfaz gráfica de usuario (GUI)** amigable.
* Se utilizaron **JFrames** para construir las múltiples ventanas que componen el flujo de la aplicación (vistas para crear propietario, crear mascota, registrar historia, etc.).

---

##  Tecnologías Utilizadas

* **Lenguaje:** Java
* **IDE:** Netbeans IDE 27
* **Base de Datos:** MySQL (gestionada localmente con phpMyAdmin)
* **UI (Interfaz de Usuario):** Java Swing (`JFrame`)
---

##  Instalación y Puesta en Marcha

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/JuanTrader500/FinalProyectPOO]
    ```
2.  **Base de Datos:**
    * Importar los archivos `.sql` (Se tratara de incluir en el repositorio PROXIMAMENTE ) en tu instancia local de **phpMyAdmin** para crear la estructura de tablas.
    * Configurar la conexión: Asegúrate de que las credenciales (usuario, contraseña, puerto) en la clase `Conexion.java` coincidan con las de tu servidor MySQL local.
3.  **Abrir el Proyecto:**
    * Abrir el proyecto con Netbeans IDE 27.
4.  **Ejecutar:**
    * Ejecutar el archivo `main` (o la `interfas.java` principal) para iniciar la aplicación.

---

##  Modo de Uso

1.  **Registrar Entidades:** Primero, asegúrate de registrar Veterinarios y Propietarios en sus respectivos módulos.
2.  **Registrar Mascotas:** Asocia nuevas mascotas a sus propietarios ya existentes.
3.  **Crear Historia Clínica:** Ve al módulo de "Nueva Historia.C", selecciona la mascota y completa los formularios (Anamnesis, Examen fisico etc.).
4.  **Buscar y Exportar:** Utiliza la función de "Buscar Historia" (por ID de historia ) y presiona el botón "Buscar ID" y seguido de eso si el ID existe saldra la opcion de imprimir H.C.
