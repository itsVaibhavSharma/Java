public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        // Assignment operator (=)
        int a = 10;
        System.out.println("Initial value of a: " + a);

        // Add and assign (+=)
        a += 5;
        System.out.println("After a += 5: " + a);

        // Subtract and assign (-=)
        a -= 3;
        System.out.println("After a -= 3: " + a);

        // Multiply and assign (*=)
        a *= 2;
        System.out.println("After a *= 2: " + a);

        // Divide and assign (/=)
        a /= 4;
        System.out.println("After a /= 4: " + a);

        // Modulus and assign (%=)
        a %= 3;
        System.out.println("After a %= 3: " + a);

        // Bitwise AND and assign (&=)
        int b = 6;  // Binary: 0110
        a &= b;     // Binary: 0010 (2 in decimal)
        System.out.println("After a &= b: " + a);

        // Bitwise OR and assign (|=)
        a |= b;     // Binary: 0110 (6 in decimal)
        System.out.println("After a |= b: " + a);

        // Bitwise XOR and assign (^=)
        a ^= b;     // Binary: 0000 (0 in decimal)
        System.out.println("After a ^= b: " + a);

        // Left shift and assign (<<=)
        a <<= 2;    // Binary: 0000 (0 in decimal)
        System.out.println("After a <<= 2: " + a);

        // Right shift and assign (>>=)
        a >>= 1;    // Binary: 0000 (0 in decimal)
        System.out.println("After a >>= 1: " + a);

        // Unsigned right shift and assign (>>>=)
        a >>>= 1;   // Binary: 0000 (0 in decimal)
        System.out.println("After a >>>= 1: " + a);
    }
}
