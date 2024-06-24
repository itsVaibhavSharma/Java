public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("a: " + a);
        System.out.println("+a: " + (+a));
        System.out.println("-a: " + (-a));

        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("++a: " + (++a)); // Pre-increment

        System.out.println("a--: " + (a--)); // Post-decrement
        System.out.println("--a: " + (--a)); // Pre-decrement

        boolean b = true;
        System.out.println("!b: " + (!b));   // Logical complement
    }
}