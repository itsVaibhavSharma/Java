### Generics in Java: A Detailed Explanation

Generics in Java enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This allows for code reusability, type safety, and ensures that you can catch more errors at compile time rather than at runtime.

### Core Concepts of Generics

1. **Why Use Generics?**
2. **Generic Classes**
3. **Generic Methods**
4. **Bounded Type Parameters**
5. **Generic Interfaces**
6. **Type Inference**
7. **Wildcard Parameters**
8. **Restrictions on Generics**

### 1. Why Use Generics?

Generics provide several benefits:
- **Type Safety:** Ensures that the code only uses the intended types, reducing runtime errors.
- **Elimination of Type Casting:** Reduces the need for explicit type casting.
- **Code Reusability:** Allows the creation of classes, interfaces, and methods that can operate on any type.

### 2. Generic Classes

A generic class is defined with type parameters. These type parameters are specified within angle brackets `<>` after the class name.

```java
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Value: " + stringBox.get());
    }
}
```

In this example, `Box<T>` is a generic class with a type parameter `T`. The type parameter `T` can be replaced with any type (e.g., `Integer`, `String`).

### 3. Generic Methods

Generic methods allow type parameters to be used in method signatures. They can be static as well as non-static.

```java
public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C"};

        printArray(intArray);  // Output: 1 2 3 4 5
        printArray(stringArray);  // Output: A B C
    }
}
```

In this example, `printArray` is a generic method with the type parameter `T`.

### 4. Bounded Type Parameters

Bounded type parameters allow you to restrict the types that can be used as type arguments. This is done using the `extends` keyword.

```java
public class BoundedTypeParameterExample {
    public static <T extends Number> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        printValue(10);  // Valid
        printValue(10.5);  // Valid
        // printValue("Hello");  // Invalid, String is not a subclass of Number
    }
}
```

In this example, the type parameter `T` is bounded by `Number`, meaning only `Number` or its subclasses can be used as type arguments.

### 5. Generic Interfaces

Interfaces can also be generic, allowing them to be parameterized with types.

```java
public interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("One", 1);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
```

In this example, `Pair<K, V>` is a generic interface, and `OrderedPair<K, V>` is a class that implements this interface.

### 6. Type Inference

The compiler can infer the type arguments from the context in which the generic method is used, reducing the need for explicit type specification.

```java
public class TypeInferenceExample {
    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        String[] stringArray = {"A", "B", "C"};
        Integer[] intArray = {1, 2, 3};

        String firstString = getFirstElement(stringArray);  // Type inferred as String
        Integer firstInteger = getFirstElement(intArray);  // Type inferred as Integer

        System.out.println("First String: " + firstString);
        System.out.println("First Integer: " + firstInteger);
    }
}
```

### 7. Wildcard Parameters

Wildcards allow for flexibility in specifying type arguments. There are three types of wildcards:

- **Unbounded Wildcards (`<?>`):** Represents any type.
- **Upper Bounded Wildcards (`<? extends T>`):** Represents a type that is a subtype of `T`.
- **Lower Bounded Wildcards (`<? super T>`):** Represents a type that is a supertype of `T`.
### Wildcard Parameters in Java: Examples

Wildcards in Java generics provide flexibility in defining and working with parameterized types. There are three types of wildcards:

1. **Unbounded Wildcards (`<?>`)**
2. **Upper Bounded Wildcards (`<? extends T>`)**
3. **Lower Bounded Wildcards (`<? super T>`)**

Let's explore each of these with examples.

### 1. Unbounded Wildcards (`<?>`)

Unbounded wildcards represent any type. They are used when the type parameter can be any object and no operations are performed on the type parameter that depends on its type.

```java
import java.util.List;
import java.util.ArrayList;

public class UnboundedWildcardExample {
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        printList(intList);  // Output: 1 2 3
        printList(stringList);  // Output: A B C
    }
}
```

### 2. Upper Bounded Wildcards (`<? extends T>`)

Upper bounded wildcards restrict the type parameter to be a subclass of a particular type. They are used when you want to read from a generic object but not modify it.

```java
import java.util.List;
import java.util.ArrayList;

public class UpperBoundedWildcardExample {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        printNumbers(intList);  // Output: 1 2 3
        printNumbers(doubleList);  // Output: 1.1 2.2 3.3
    }
}
```

### 3. Lower Bounded Wildcards (`<? super T>`)

Lower bounded wildcards restrict the type parameter to be a superclass of a particular type. They are used when you want to write to a generic object.

```java
import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcardExample {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        
        System.out.println(numList);  // Output: [1, 2, 3, 4, 5]

        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        
        System.out.println(objList);  // Output: [1, 2, 3, 4, 5]
    }
}
```

### Putting It All Together

Here is a complete example that demonstrates the usage of all three types of wildcards in a single file.

```java
import java.util.List;
import java.util.ArrayList;

public class WildcardExample {
    
    // Unbounded wildcard example
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Upper bounded wildcard example
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Lower bounded wildcard example
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // Unbounded wildcard
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        printList(stringList);  // Output: A B C

        // Upper bounded wildcard
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printNumbers(intList);  // Output: 1 2 3

        // Lower bounded wildcard
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        printList(numList);  // Output: 1 2 3 4 5
    }
}
```

Wildcards provide flexibility when working with generics by allowing you to define methods and classes that can operate on a range of types while maintaining type safety. Understanding how to use unbounded, upper bounded, and lower bounded wildcards effectively is crucial for writing robust and reusable generic code in Java.
### 8. Restrictions on Generics

There are some restrictions when using generics in Java:

- **Cannot Instantiate Generic Types with Primitive Types:**
  ```java
  // List<int> list = new ArrayList<>();  // Invalid
  List<Integer> list = new ArrayList<>();  // Valid
  ```

- **Cannot Create Instances of Type Parameters:**
  ```java
  public class GenericClass<T> {
      // T obj = new T();  // Invalid
  }
  ```

- **Cannot Declare Static Fields with Generic Types:**
  ```java
  public class GenericClass<T> {
      // private static T obj;  // Invalid
  }
  ```

- **Cannot Use instanceof with Parameterized Types:**
  ```java
  public class GenericClass<T> {
      public boolean isSameType(Object obj) {
          // return obj instanceof T;  // Invalid
          return false;
      }
  }
  ```

### Conclusion

Generics are a powerful feature in Java that provides type safety, reduces the need for type casting, and allows for code reusability. By understanding and effectively using generics, you can write more robust and flexible code. This detailed explanation should give you a solid foundation in generics, but feel free to ask for more examples or clarifications if needed!