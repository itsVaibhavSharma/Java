public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        // Bitwise AND
        int resultAnd = a & b;   // Binary: 0001 (1 in decimal)
        System.out.println("a & b = " + resultAnd);
        
        // Bitwise OR
        int resultOr = a | b;    // Binary: 0111 (7 in decimal)
        System.out.println("a | b = " + resultOr);
        
        // Bitwise XOR
        int resultXor = a ^ b;   // Binary: 0110 (6 in decimal)
        System.out.println("a ^ b = " + resultXor);
        
        // Bitwise Complement
        int resultComplement = ~a;   // Binary: 1010 (In two's complement form, it is -6)
        System.out.println("~a = " + resultComplement);
        
        // Left Shift
        int resultLeftShift = a << 2;   // Binary: 10100 (20 in decimal)
        System.out.println("a << 2 = " + resultLeftShift);
        
        // Right Shift
        int resultRightShift = a >> 1;   // Binary: 0010 (2 in decimal)
        System.out.println("a >> 1 = " + resultRightShift);
        
        // Unsigned Right Shift
        int unsignedRightShift = -20 >>> 2;   // Binary: 00111111111111111111111111111011 (1073741819 in decimal)
        System.out.println("-20 >>> 2 = " + unsignedRightShift);
    }
}