import java.util.Scanner;
 
    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int num1 = (int) (Math.random() * 10) + 1; // Random number between 1 and 10
        int num2 = (int) (Math.random() * 10) + 1;
        char[] operators = {'+', '-', '*', '/'};
        char operator = operators[(int) (Math.random() * 4)]; 
 
        int correctAnswer = 0;

        switch (operator) {
            case '+':
                correctAnswer = num1 + num2;
                break;
            case '-':
                correctAnswer = num1 - num2;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            case '/':
                while (num2 == 0 || num1 % num2 != 0) {
                    num2 = (int) (Math.random() * 10) + 1;
                }
                correctAnswer = num1 / num2;
                break;
        }
        System.out.printf("  What is %d %c %d = ", num1, operator, num2);
     
        int userAnswer = scanner.nextInt();
 
        if (userAnswer == correctAnswer) {
               System.out.println(" o----------------o");
            System.out.print("   Correct!");
        } else {
            System.out.println(" o---------------------------o");
            System.out.printf(" Incorrect. The correct answer is: %d%n ", correctAnswer);
        }
    }
}
