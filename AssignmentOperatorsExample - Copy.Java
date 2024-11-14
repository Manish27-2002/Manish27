class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Equal to
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual); // false

        // Not equal to
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual); // true

        // Greater than
        boolean isGreater = (a > b);
        System.out.println("Is a greater than b? " + isGreater); // true

        // Less than
        boolean isLess = (a < b);
        System.out.println("Is a less than b? " + isLess); // false

        // Greater than or equal to
        boolean isGreaterOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual); // true

        // Less than or equal to
        boolean isLessOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual); // false
    }
}