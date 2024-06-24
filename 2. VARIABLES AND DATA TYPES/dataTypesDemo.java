public class dataTypesDemo {
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
