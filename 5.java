import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("         Grading Scale:");
        System.out.println("Percentage Range   Letter Grade");
        System.out.println("o---------------o  o-----------o");
        System.out.println("90 - 100               A");
        System.out.println("80 - 89                B");
        System.out.println("70 - 79                C");
        System.out.println("60 - 69                D");
        System.out.println("Below 60               F");
        System.out.println();

        System.out.print("Enter the percentage: ");
        int percentage = scanner.nextInt();
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The corresponding letter grade is: " + grade);
    }
}
