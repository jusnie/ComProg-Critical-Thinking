    class Main {
    public static void main(String[] args) {
        // Constants for the formula
        int a = 1246;  // Multiplier
        int c = 200;   // Increment
        int m = 50;    // Modulus
        int x = 12;    // Seed value
 
        // Display the seed and constants
        System.out.println("Seed = " + x + ", a = " + a + ", c = " + c + ", m = " + m);
        System.out.println();
 
        // Generate 10 numbers with detailed calculations
        for (int i = 0; i < 10; i++) {
            int previousX = x;
            x = (a * x + c) % m;  // Apply the formula
 
            // Display the detailed calculation for each step
            System.out.printf("(%d*%d + %d) %% %d = %d%n", a, previousX, c, m, x);
        }
    }
}
