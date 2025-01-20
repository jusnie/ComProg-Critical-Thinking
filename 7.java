import java.util.Scanner;
 
    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
 
        while (playAgain) { 
            
            System.out.println("Welcome to the Equivalent Fractions Quiz!");
            System.out.println();
            System.out.println(" Please select your difficulty level:");
            System.out.println(" o------------------------o");
            System.out.println("1. Beginner (4 questions)");
            System.out.println("2. Advanced (8 questions)");
            System.out.println(" Please select your difficulty level:");
            System.out.print(" Choose (1 or 2): ");
            int level = scanner.nextInt();
            
            String[] questions = {
                "21/3", "2/3", "4/3", "28/4", "8/12", "1 1/3", "5/1", "125/5"
            };
            int[] correctAnswers = {4, 5, 1, 2, 3, 6, 7, 8};
 
            int numQuestions = (level == 1) ? 4 : 8;
            int correctCount = 0;
            int incorrectCount = 0;
 
            for (int i = 0; i < numQuestions; i++) {
                System.out.printf("%nWhich fraction number is equivalent to fraction #%d (%s)?%n", (i + 1), questions[i]);
                System.out.println("1. 21/3");
                System.out.println("2. 2/3");
                System.out.println("3. 4/3");
                System.out.println("4. 28/4");
                System.out.println("5. 8/12");
                System.out.println("6. 1 1/3");
                System.out.println("7. 5/1");
                System.out.println("8. 125/5");
                System.out.print("Enter your choice: ");
                int answer = scanner.nextInt();
 
                // Checking
                if (answer == correctAnswers[i]) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The correct answer is option " + correctAnswers[i] + ".");
                    incorrectCount++;
                }
            }
 
            // Display final score and feedback
            System.out.printf("%nYou got %d correct and %d incorrect.%n", correctCount, incorrectCount);
            double percentage = (double) correctCount / numQuestions * 100;
 
            if (percentage == 100) {
                System.out.println("Excellent! You're a fractions master!");
            } else if (percentage >= 70) {
            }
 
            // Ask the user if they want to play again
            System.out.println("\nDo you want to play again? (yes or no)");
            scanner.nextLine(); // Consume leftover newline
            String choice = scanner.nextLine().toLowerCase();
 
            if (!choice.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing!");
            }
        }
 
        scanner.close();
    }
}
