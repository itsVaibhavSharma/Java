#### 1.1 Overview of Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is widely used for building enterprise-scale applications, Android apps, web applications, and more.

**Key Features of Java:**
- **Platform Independence**: Java programs are compiled into bytecode that can be executed on any system with a Java Virtual Machine (JVM).
- **Object-Oriented**: Java follows the principles of object-oriented programming, such as encapsulation, inheritance, and polymorphism.
- **Robust and Secure**: Java has strong memory management, exception handling, and security features.
- **Multithreaded**: Java supports multithreading, allowing concurrent execution of two or more threads for maximum CPU utilization.
- **High Performance**: Java’s Just-In-Time (JIT) compiler enhances performance by converting bytecode into native machine code at runtime.

#### 1.2 Setting Up the Development Environment

Before you can start writing Java programs, you need to set up your development environment.

##### Step 1: Install Java Development Kit (JDK)

1. **Download JDK**: Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-downloads.html) and download the latest JDK for your operating system.
2. **Install JDK**: Follow the installation instructions for your operating system:
   - **Windows**: Run the installer and follow the on-screen instructions.
   - **macOS**: Open the `.dmg` file and follow the instructions to install.
   - **Linux**: Use the package manager specific to your distribution (e.g., `apt` for Debian/Ubuntu, `yum` for CentOS/Fedora).

3. **Set Environment Variables**:
   - **Windows**: Add `JAVA_HOME` and update the `PATH` variable.
     1. Right-click on ‘This PC’ and select ‘Properties’.
     2. Click on ‘Advanced system settings’.
     3. Click on ‘Environment Variables’.
     4. Under ‘System variables’, click ‘New’ and add `JAVA_HOME` with the path to your JDK installation.
     5. Find the `Path` variable, click ‘Edit’, and add `%JAVA_HOME%\bin`.
   - **macOS/Linux**: Add the following lines to your `.bash_profile` or `.bashrc` file:
     ```bash
     export JAVA_HOME=/path/to/your/jdk
     export PATH=$JAVA_HOME/bin:$PATH
     ```
     Then, run `source ~/.bash_profile` or `source ~/.bashrc` to apply the changes.

4. **Verify Installation**: Open a terminal or command prompt and type `java -version` and `javac -version` to verify that the installation was successful.

##### Step 2: Install an Integrated Development Environment (IDE)

An IDE will provide you with tools to write, debug, and compile Java code more easily. Here are a few popular IDEs:

- **IntelliJ IDEA**: Download from [JetBrains](https://www.jetbrains.com/idea/download/).
- **Eclipse**: Download from [Eclipse](https://www.eclipse.org/downloads/).
- **NetBeans**: Download from [NetBeans](https://netbeans.apache.org/download/index.html).

After downloading, follow the installation instructions for your chosen IDE.

##### Step 3: Configure the IDE

1. **IntelliJ IDEA**:
   - Open IntelliJ IDEA and select ‘New Project’.
   - Choose ‘Java’ and specify the JDK location.
   - Follow the prompts to create a new project.

2. **Eclipse**:
   - Open Eclipse and select a workspace directory.
   - Go to `File > New > Java Project`.
   - Name your project and configure the JDK.

3. **NetBeans**:
   - Open NetBeans and go to `File > New Project`.
   - Choose ‘Java’ and ‘Java Application’.
   - Follow the prompts to set up your project.

#### 1.3 Writing and Running Your First Java Program

Let’s write a simple “Hello, World!” program to verify that everything is set up correctly.

1. **Create a New Java File**:
   - In your IDE, create a new file named `HelloWorld.java`.

2. **Write the Code**:
   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

3. **Compile and Run the Program**:
   - In the IDE, there should be a ‘Run’ button or you can use a terminal to compile and run:
     ```bash
     javac HelloWorld.java  # This compiles the Java file into bytecode
     java HelloWorld        # This runs the compiled bytecode
     ```

You should see the output:
```
Hello, World!
```

Congratulations! You've successfully set up your Java development environment and run your first Java program.

# How does it work?
Let's break down the outer syntax of the "Hello, World!" Java program:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 1. **Class Declaration**

```java
public class HelloWorld {
```

- **`public`**: This is an access modifier that makes the class accessible from any other class.
- **`class`**: This keyword is used to declare a class in Java.
- **`HelloWorld`**: This is the name of the class. In Java, the class name should start with an uppercase letter by convention. The filename must match the class name (e.g., `HelloWorld.java`).

### 2. **Main Method Declaration**

```java
public static void main(String[] args) {
```

- **`public`**: This is an access modifier that makes the method accessible from any other class. It's necessary for the main method because the JVM needs to call it from outside the class.
- **`static`**: This keyword means that the method belongs to the class itself, rather than an instance of the class. This is required for the main method because it is called by the JVM without creating an instance of the class.
- **`void`**: This indicates that the method does not return any value.
- **`main`**: This is the name of the method. It's the entry point of any Java application. When the program starts, the JVM looks for the `main` method to begin execution.
- **`String[] args`**: This is the parameter of the main method. It is an array of `String` objects. The `args` array stores command-line arguments passed to the program when it is run. If no arguments are passed, it is an empty array.

### 3. **Method Body**

```java
{
    System.out.println("Hello, World!");
}
```

- **`{}`**: Curly braces denote the beginning and end of a block of code. The main method's code block is enclosed within these braces.
- **`System.out.println("Hello, World!");`**: This statement prints the text "Hello, World!" to the console.
  - **`System`**: This is a predefined class that provides access to the system, including standard input, output, and error streams.
  - **`out`**: This is a static member of the `System` class, which represents the standard output stream.
  - **`println`**: This is a method of the `PrintStream` class (to which `System.out` belongs) that prints the argument passed to it to the console, followed by a new line.

### Summary of Outer Syntax:

1. **Class Declaration**: Defines a new class named `HelloWorld`.
2. **Main Method Declaration**: Defines the main method which is the entry point of the program. The method signature must be exactly `public static void main(String[] args)` for the JVM to recognize it as the entry point.
3. **Method Body**: Contains the code that is executed when the program runs. In this case, it prints "Hello, World!" to the console.

### Diagram:

```java
public class HelloWorld {         // Class Declaration
    public static void main(String[] args) { // Main Method Declaration
        System.out.println("Hello, World!"); // Method Body
    }
}
```

Understanding this outer structure is crucial for writing any Java program. Each part plays a specific role in defining how the program is structured and how it executes.

