### Conditionals in Java

Conditionals in Java are used to execute different code blocks based on whether a specified condition evaluates to true or false. They are fundamental to controlling the flow of a program, enabling decision-making capabilities. Java supports several types of conditional statements:

1. **if Statement**
2. **if-else Statement**
3. **if-else-if ladder**
4. **switch Statement**

Let's explore each type in detail:

#### 1. if Statement

The `if` statement is used to execute a block of code only if a specified condition is true. It has the following syntax:

```java
if (condition) {
    // Code block to be executed if condition is true
}
```

- **Example:**

```java
public class IfStatementExample {
    public static void main(String[] args) {
        int number = 10;

        // Check if number is greater than 0
        if (number > 0) {
            System.out.println("Number is positive.");
        }

        // Only executes if the condition is true
        System.out.println("End of program.");
    }
}
```

#### 2. if-else Statement

The `if-else` statement executes one block of code if the condition is true and another block if the condition is false. It has the following syntax:

```java
if (condition) {
    // Code block to be executed if condition is true
} else {
    // Code block to be executed if condition is false
}
```

- **Example:**

```java
public class IfElseStatementExample {
    public static void main(String[] args) {
        int number = -5;

        // Check if number is positive or negative
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }

        // Only executes after the if-else block
        System.out.println("End of program.");
    }
}
```

#### 3. if-else-if ladder

The `if-else-if` ladder is used when there are multiple conditions to be checked. It executes one block among several alternatives. The `else if` condition is checked only if the previous conditions were false. It has the following syntax:

```java
if (condition1) {
    // Code block to be executed if condition1 is true
} else if (condition2) {
    // Code block to be executed if condition2 is true
} else if (condition3) {
    // Code block to be executed if condition3 is true
} 
// Add more else if blocks as needed
else {
    // Code block to be executed if all conditions are false
}
```

- **Example:**

```java
public class ElseIfLadderExample {
    public static void main(String[] args) {
        int number = 0;

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // Only executes after the if-else-if ladder
        System.out.println("End of program.");
    }
}
```

#### 4. switch Statement

The `switch` statement allows you to test a variable against a list of values. It provides a more structured way to handle multiple conditions compared to the `if-else-if` ladder. It has the following syntax:

```java
switch (expression) {
    case value1:
        // Code block executed if expression equals value1
        break;
    case value2:
        // Code block executed if expression equals value2
        break;
    // Add more cases as needed
    default:
        // Code block executed if expression doesn't match any case
}
```

- **Example:**

```java
public class SwitchStatementExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day of the week is " + dayName);

        // Only executes after the switch statement
        System.out.println("End of program.");
    }
}
```

### Key Points:

- **Condition**: The expression inside the parentheses of the `if`, `else if`, or `switch` statement must evaluate to a boolean value (`true` or `false`).
- **Blocks**: Each conditional statement (`if`, `else`, `else if`, `case`) is followed by a block of code enclosed in curly braces `{}`. If the block contains only one statement, the braces are optional but recommended for clarity.
- **Execution Flow**: In `if-else` constructs, exactly one block of code will execute. In a `switch` statement, only one matching `case` block (plus the associated `break`) will execute unless a `break` is omitted (fall-through behavior).

### Choosing the Right Conditional Statement:

- Use `if` for simple binary decisions or conditions that need to be checked in isolation.
- Use `if-else` when there are two possible outcomes based on a condition.
- Use `if-else-if` ladder when there are multiple conditions to check sequentially.
- Use `switch` when comparing a single variable against multiple possible constant values.

Understanding and using these conditional statements effectively allows developers to write more structured and readable code that responds appropriately to different scenarios within a program.