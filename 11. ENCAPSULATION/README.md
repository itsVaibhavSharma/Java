### Encapsulation in Java

Encapsulation is one of the fundamental principles of object-oriented programming (OOP) and refers to the bundling of data (attributes) and methods (behaviors) that operate on the data into a single unit called a class. It is used to hide the internal state (data) of an object and only expose the necessary functionalities through public methods. Encapsulation helps in achieving data hiding, abstraction, and modularization of code.

### Key Concepts of Encapsulation

1. **Data Hiding**
2. **Access Modifiers**
3. **Getters and Setters**
4. **Encapsulation Example**

### 1. Data Hiding

Encapsulation allows you to hide the internal state (data) of an object from outside interference and misuse. By restricting direct access to variables, you ensure that the data is accessed and modified only through the methods defined in the class.

### 2. Access Modifiers

Access modifiers (`public`, `private`, `protected`, default) control the visibility and accessibility of classes, variables, constructors, and methods in Java. They play a crucial role in encapsulation by defining who can access the members of a class.

- **`private`**: Limits access to within the same class.
- **`default`**: Limits access to within the same package.
- **`protected`**: Allows access within the same package and subclasses.
- **`public`**: Allows access from anywhere.

### 3. Getters and Setters

Getters (accessor methods) and setters (mutator methods) are public methods used to access and update the private data members of a class, respectively. They provide controlled access to encapsulated data, enabling validation and ensuring proper state management.

**Example:**

```java
public class Person {
    // Private data members
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
```

### 4. Encapsulation Example

Encapsulation ensures that the internal state of an object is protected from unwanted access and modification. It promotes code reusability, modularity, and maintainability by adhering to the principle of information hiding.

**Example:**

```java
public class Person {
    // Private data members
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.displayInfo();

        // Updating age using setter method
        person.setAge(35);
        person.displayInfo();
    }
}
```

### Benefits of Encapsulation

- **Controlled Access:** Prevents direct modification of data, ensuring data integrity and security.
- **Flexibility:** Allows internal representation to be changed without affecting the external code that uses it (maintaining compatibility).
- **Modularity:** Encapsulated classes are easier to maintain, debug, and extend.
- **Code Reusability:** Encapsulation promotes reusable code by exposing only necessary functionalities through well-defined interfaces (public methods).

Encapsulation is a fundamental concept in Java and other object-oriented programming languages that supports the design principles of abstraction, modularity, and separation of concerns. It forms the basis for building robust and scalable software systems. If you have further questions or need more examples, feel free to ask!