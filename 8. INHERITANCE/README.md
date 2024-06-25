### Inheritance in Java

Inheritance is a fundamental concept of object-oriented programming (OOP) that allows one class to inherit the fields and methods of another class. It promotes code reuse and establishes a natural hierarchy among classes.

### Key Concepts

1. **Superclass and Subclass**
2. **Types of Inheritance**
3. **Method Overriding**
4. **Using `super` Keyword**
5. **Constructors in Inheritance**
6. **Polymorphism**

### 1. Superclass and Subclass

- **Superclass (Parent/Base Class)**: The class whose properties and methods are inherited.
- **Subclass (Child/Derived Class)**: The class that inherits properties and methods from the superclass.

- **Example**:

```java
// Superclass
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

### 2. Types of Inheritance

Java supports single inheritance, where a class can inherit from only one superclass. However, multiple inheritance (a class inheriting from multiple classes) is not supported directly in Java to avoid complexity and ambiguity.

#### Single Inheritance

One class inherits from one superclass.

- **Example**:

```java
// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method
    }
}

```

#### Multilevel Inheritance

A class is derived from another class, which is also derived from another class.

- **Example**:

```java
// Superclass
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate subclass
public class Mammal extends Animal {
    public void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Subclass
public class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

### 3. Method Overriding

Method overriding allows a subclass to provide a specific implementation of a method already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameters.

- **Example**:

```java
// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Calls the overridden method in Dog class
    }
}

```

### 4. Using `super` Keyword

The `super` keyword in Java is used to refer to the immediate parent class object. It is used to:

- Call the superclass constructor.
- Access superclass methods and fields.

- **Example**:

```java
// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();  // Calling superclass method
        System.out.println("This dog eats bones.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calls overridden method in Dog class
    }
}

```

### 5. Constructors in Inheritance

When an object of a subclass is created, the constructor of the superclass is called first. If the superclass has a parameterized constructor, the subclass must explicitly call it using `super(parameters)`.

- **Example**:

```java
// Superclass
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    public String getName() {
        return name;
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        super(name);  // Calling superclass constructor
        this.breed = breed;
        System.out.println("Dog constructor called for: " + name + ", Breed: " + breed);
    }

    // Method
    public void displayInfo() {
        System.out.println(getName() + " is a " + breed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo();  // Calls subclass method
    }
}

```

### 6. Polymorphism

Polymorphism allows objects to be treated as instances of their superclass rather than their actual class. It enables one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

- **Example**:

```java
// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Calls overridden method in Dog class
        myCat.makeSound();  // Calls overridden method in Cat class
    }
}

```

### Complete Example of Inheritance

Let's create a complete example demonstrating various concepts of inheritance:

```java
// Superclass
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        super(name);  // Calling superclass constructor
        this.breed = breed;
    }

    // Overridden method
    @Override
    public void eat() {
        super.eat();  // Calling superclass method
        System.out.println(getName() + " the " + breed + " is eating dog food.");
    }

    // Subclass-specific method
    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.eat();  // Calls overridden method in Dog class
        myDog.bark(); // Calls subclass-specific method
    }
}
```

When you run this program, the output will be:

```
Buddy is eating.
Buddy the Golden Retriever is eating dog food.
Buddy is barking.
```

### Summary

- **Inheritance**: Allows one class to inherit fields and methods from another class.
- **Superclass and Subclass**: The superclass is the class being inherited from, and the subclass is the class that inherits.
- **Single and Multilevel Inheritance**: Java supports single and multilevel inheritance.
- **Method Overriding**: A subclass provides a specific implementation of a method already defined in its superclass.
- **`super` Keyword**: Refers to the immediate parent class object, used to call superclass constructors and methods.
- **Constructors in Inheritance**: Superclass constructors are called before subclass constructors.
- **Polymorphism**: Allows objects to be treated as instances of their superclass, enabling one interface for a general class of actions.

Understanding inheritance and its related concepts will help you create more organized, modular, and reusable code in Java. If you have more specific questions or need further details, feel free to ask!

### Types of Inheritance in Java

Inheritance is a fundamental concept in object-oriented programming, where one class inherits the properties and behaviors (fields and methods) of another class. Java supports several types of inheritance:

1. **Single Inheritance**
2. **Multilevel Inheritance**
3. **Hierarchical Inheritance**
4. **Multiple Inheritance** (Through interfaces)
5. **Hybrid Inheritance** (Through interfaces)

#### 1. Single Inheritance

In single inheritance, a class inherits from only one superclass. This is the most straightforward type of inheritance.

**Example:**

**File: Main.java**

```java
// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method
    }
}
```

#### 2. Multilevel Inheritance

In multilevel inheritance, a class is derived from another class, which is also derived from another class. This forms a chain of inheritance.

**Example:**

**File: Main.java**

```java
// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate subclass
class Mammal extends Animal {
    public void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Subclass
class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();     // Inherited from Animal
        myDog.breathe(); // Inherited from Mammal
        myDog.bark();    // Subclass method
    }
}
```

#### 3. Hierarchical Inheritance

In hierarchical inheritance, multiple classes inherit from a single superclass. This allows different subclasses to share the common features of the superclass.

**Example:**

**File: Main.java**

```java
// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method

        myCat.eat();  // Inherited method
        myCat.meow(); // Subclass method
    }
}
```

#### 4. Multiple Inheritance (Through Interfaces)

Java does not support multiple inheritance with classes to avoid complexity and ambiguity (the "diamond problem"). However, multiple inheritance is achieved through interfaces.

**Example:**

**File: Main.java**

```java
// Interface 1
interface CanFly {
    void fly();
}

// Interface 2
interface CanSwim {
    void swim();
}

// Class implementing multiple interfaces
class Duck implements CanFly, CanSwim {
    public void fly() {
        System.out.println("The duck flies.");
    }

    public void swim() {
        System.out.println("The duck swims.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly();  // Method from CanFly interface
        myDuck.swim(); // Method from CanSwim interface
    }
}
```

#### 5. Hybrid Inheritance (Through Interfaces)

Hybrid inheritance is a combination of two or more types of inheritance. Java achieves hybrid inheritance through interfaces to avoid the complexities associated with multiple inheritance using classes.

**Example:**

**File: Main.java**

```java
// Interface 1
interface CanFly {
    void fly();
}

// Interface 2
interface CanSwim {
    void swim();
}

// Base class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Class implementing multiple interfaces and inheriting from a class
class Duck extends Animal implements CanFly, CanSwim {
    public void fly() {
        System.out.println("The duck flies.");
    }

    public void swim() {
        System.out.println("The duck swims.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.eat();  // Method from Animal class
        myDuck.fly();  // Method from CanFly interface
        myDuck.swim(); // Method from CanSwim interface
    }
}
```

### Summary

- **Single Inheritance**: A class inherits from one superclass.
- **Multilevel Inheritance**: A class is derived from another class, which in turn is derived from another class.
- **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
- **Multiple Inheritance**: Achieved through interfaces in Java.
- **Hybrid Inheritance**: A combination of two or more types of inheritance, achieved through interfaces in Java.

Each type of inheritance has its use cases and helps in creating a flexible and reusable code structure. If you need further details or have any questions, feel free to ask!