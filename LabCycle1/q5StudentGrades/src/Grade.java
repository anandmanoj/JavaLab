import java.util.Scanner;

public class Grade {
    public static void display(int mark){

        if(mark>=90){
            System.out.println("GRADE-A Excellent work!");
        } else if (mark>=80) {
            System.out.println("GRADE-B Good job!");
        } else if (mark>=70) {
            System.out.println("GRADE-C You can do better");
        } else if (mark>=60) {
            System.out.println("GRADE-D Work harder");
        } else {
            System.out.println("GRADE-F Failed. Try again");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total marks in percentage: ");
        int mark = scanner.nextInt();

        if(mark>100 || mark<0){
            System.out.println("\u26A0\uFE0FInvalid input! mark should be between 0-100");
            System.exit(0);
        }else {
            display(mark);
        }

        scanner.close();
    }

}
