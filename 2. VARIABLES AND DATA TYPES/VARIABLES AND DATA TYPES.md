### Variables and Data Types in Java

#### Variables
A variable in Java is a container that holds data that can be changed during the execution of a program. Each variable in Java has a specific type, which determines what kind of data it can hold and how much memory it requires.

**Declaration and Initialization:**
- **Declaration**: Specifying the type and name of the variable.
- **Initialization**: Assigning a value to the variable.

Example:
```java
int number;       // Declaration
number = 10;      // Initialization

int count = 5;    // Declaration and initialization
```

#### Data Types
Java data types are divided into two main categories: primitive data types and reference data types.

##### Primitive Data Types
Java has eight built-in primitive data types:

1. **byte**:
   - **Size**: 8-bit
   - **Range**: -128 to 127
   - **Usage**: Useful for saving memory in large arrays.

   Example:
   ```java
   byte age = 30;
   ```

2. **short**:
   - **Size**: 16-bit
   - **Range**: -32,768 to 32,767
   - **Usage**: Also useful for saving memory in large arrays.

   Example:
   ```java
   short year = 2023;
   ```

3. **int**:
   - **Size**: 32-bit
   - **Range**: -2^31 to 2^31 - 1
   - **Usage**: Default choice for integer values.

   Example:
   ```java
   int salary = 50000;
   ```

4. **long**:
   - **Size**: 64-bit
   - **Range**: -2^63 to 2^63 - 1
   - **Usage**: Useful for large integer values.

   Example:
   ```java
   long population = 7500000000L;
   ```

5. **float**:
   - **Size**: 32-bit
   - **Usage**: Useful for single-precision decimal values.

   Example:
   ```java
   float pi = 3.14f;
   ```

6. **double**:
   - **Size**: 64-bit
   - **Usage**: Default choice for decimal values (double-precision).

   Example:
   ```java
   double distance = 9876.54321;
   ```

7. **char**:
   - **Size**: 16-bit
   - **Usage**: Represents a single Unicode character.

   Example:
   ```java
   char grade = 'A';
   ```

8. **boolean**:
   - **Size**: Not precisely defined (depends on JVM)
   - **Usage**: Represents two possible values: `true` and `false`.

   Example:
   ```java
   boolean isJavaFun = true;
   ```

##### Reference Data Types
Reference data types are used to refer to objects. They are created using defined classes and interfaces.

1. **Strings**:
   - A sequence of characters.
   - Example:
     ```java
     String greeting = "Hello, World!";
     ```

2. **Arrays**:
   - A collection of elements of the same type.
   - Example:
     ```java
     int[] numbers = {1, 2, 3, 4, 5};
     ```

3. **Classes**:
   - User-defined types that can contain fields and methods.
   - Example:
     ```java
     class Person {
         String name;
         int age;
     }
     ```

4. **Interfaces**:
   - Abstract types that allow you to specify methods that must be implemented by derived classes.
   - Example:
     ```java
     interface Animal {
         void eat();
         void sleep();
     }
     ```

### Example Program

Here is a Java program that demonstrates the use of various variables and data types:

```java
public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive data types
        byte age = 30;
        short year = 2023;
        int salary = 50000;
        long population = 7500000000L;
        float pi = 3.14f;
        double distance = 9876.54321;
        char grade = 'A';
        boolean isJavaFun = true;

        // Reference data types
        String greeting = "Hello, World!";
        int[] numbers = {1, 2, 3, 4, 5};

        // Display values
        System.out.println("byte: " + age);
        System.out.println("short: " + year);
        System.out.println("int: " + salary);
        System.out.println("long: " + population);
        System.out.println("float: " + pi);
        System.out.println("double: " + distance);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + greeting);

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

### Explanation

1. **Primitive Data Types**:
   - Variables like `age`, `year`, `salary`, `population`, `pi`, `distance`, `grade`, and `isJavaFun` are primitive types that store simple values directly.

2. **Reference Data Types**:
   - `greeting` is a `String` object that stores a sequence of characters.
   - `numbers` is an array of integers.

3. **Printing Values**:
   - The `System.out.println` statements are used to print the values of the variables to the console.
   - A `for-each` loop is used to iterate through the elements of the array `numbers` and print each element.

By understanding and using these basic data types and variables, you can start writing more complex Java programs.