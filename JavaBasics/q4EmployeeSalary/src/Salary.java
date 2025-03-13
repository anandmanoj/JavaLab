import java.util.Scanner;

public class Salary {
    public static int bonus(int year, int sal){
        if(year>=3 && year<=5){
            //3 to 5 year 10%bonus
            return sal+(int) (sal*0.1);
        }
        else if(year>5){
            //more than 5 year 20%bonus
            return sal+(int) (sal*0.2);
        }
        return sal; //no bonus <3year
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sal;

        System.out.println("Enter your position");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Intern");
        System.out.print("->");
        int ch = scanner.nextInt();

        switch (ch) {
            case 1 -> sal=50000;
            case 2 -> sal=30000;
            case 3 -> sal=15000;
            default -> {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
        }
        System.out.print("Enter your experience (in year) :");
        int exp = scanner.nextInt();

        System.out.println("Your Salary is: "+bonus(exp,sal));

        scanner.close();
    }
}
