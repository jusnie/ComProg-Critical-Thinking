import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Enter the number of eggs purchased: ");
        int eggs = scanner.nextInt();
        

        int dozens = eggs / 12;
        int extraEggs = eggs % 12;
        double pricePerDozen;

        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        double totalCost = (dozens * pricePerDozen) + (extraEggs * (pricePerDozen / 12));
        
        System.out.println();
        
        System.out.println(" o-------------------------------o");
        System.out.printf("   The bill is equal to: $%.2f%n", totalCost);
        System.out.println(" o-------------------------------o");
    }
}
