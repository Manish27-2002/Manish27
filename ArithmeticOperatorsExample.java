class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Sum: 15

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Difference: 5

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Product: 50

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Quotient: 2

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Remainder: 0

        // Demonstrating division with remainder
        int c = 10;
        int d = 3;
        System.out.println("Quotient (10 / 3): " + c / d); // Quotient (10 / 3): 3
        System.out.println("Remainder (10 % 3): " + c % d); // Remainder (10 % 3): 1
    }
}