class AndOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = (a && b);
        System.out.println("a AND b: " + andResult); // false

        // Logical OR
        boolean orResult = (a || b);
        System.out.println("a OR b: " + orResult); // true

        // Logical NOT
        boolean notResult = !a;
        System.out.println("NOT a: " + notResult); // false

        // Combining operators
        boolean combinedResult = (a && (b || !a));
        System.out.println("Combined Result: " + combinedResult); // false
    }
}