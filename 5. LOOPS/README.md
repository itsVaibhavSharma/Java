### Loops in Java

Loops are used to execute a block of code repeatedly until a certain condition is met. Java provides several types of loops, each with its specific use cases:

1. **for Loop**
2. **while Loop**
3. **do-while Loop**
4. **Enhanced for Loop (for-each Loop)**

Let's explore each type in detail:

#### 1. for Loop

The `for` loop is used to execute a block of code a specified number of times. It consists of three parts: initialization, condition, and increment/decrement. It has the following syntax:

```java
for (initialization; condition; update) {
    // Code block to be executed
}
```

- **Example:**

```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

- **Explanation:**
  - **Initialization**: `int i = 1` sets the starting value.
  - **Condition**: `i <= 5` checks if the loop should continue.
  - **Update**: `i++` increments the counter after each iteration.

#### 2. while Loop

The `while` loop is used to execute a block of code as long as a specified condition is true. It checks the condition before each iteration. It has the following syntax:

```java
while (condition) {
    // Code block to be executed
}
```

- **Example:**

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Print numbers from 1 to 5
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
```

- **Explanation:**
  - **Condition**: `i <= 5` checks if the loop should continue.
  - The loop continues to execute as long as the condition is true.

#### 3. do-while Loop

The `do-while` loop is similar to the `while` loop, but it checks the condition after each iteration. This guarantees that the loop body is executed at least once. It has the following syntax:

```java
do {
    // Code block to be executed
} while (condition);
```

- **Example:**

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Print numbers from 1 to 5
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);
    }
}
```

- **Explanation:**
  - The loop body is executed once before the condition `i <= 5` is checked.
  - The loop continues to execute as long as the condition is true.

#### 4. Enhanced for Loop (for-each Loop)

The enhanced `for` loop (also known as the for-each loop) is used to iterate over arrays or collections. It simplifies the iteration process by eliminating the need for an explicit counter. It has the following syntax:

```java
for (type variable : array/collection) {
    // Code block to be executed
}
```

- **Example:**

```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print all numbers in the array
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
```

- **Explanation:**
  - The loop iterates over each element in the array `numbers`.
  - The variable `number` takes the value of each element in the array one by one.

### Break and Continue Statements

Java provides two control statements to alter the flow of loops:

1. **break**: Terminates the loop immediately and transfers control to the statement following the loop.
2. **continue**: Skips the current iteration and proceeds to the next iteration of the loop.

#### Example using break:

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Exit the loop when i equals 3
            }
            System.out.println("i = " + i);
        }
    }
}
```

#### Example using continue:

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip the current iteration when i equals 3
            }
            System.out.println("i = " + i);
        }
    }
}
```

### Choosing the Right Loop

- Use the `for` loop when the number of iterations is known beforehand.
- Use the `while` loop when the number of iterations is not known and you need to repeat a block of code as long as a condition is true.
- Use the `do-while` loop when you need to execute the loop body at least once regardless of the condition.
- Use the enhanced `for` loop (for-each loop) for iterating over arrays or collections in a concise manner.

Understanding and using these loops effectively allows developers to write flexible and efficient code to handle repetitive tasks.