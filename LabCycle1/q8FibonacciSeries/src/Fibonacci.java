import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = scanner.nextInt();

        int a=0, b=1, c;

        if(num<0){
            System.out.println("Invalid input! Enter a positive number");
        } else if (num==1) {
            System.out.println("Fibonacci series: "+a);
        }else{
            System.out.print("Fibonacci series: "+a+" "+b);

            for (int i=2;i<num;i++){
                c = a+b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }

        }
        scanner.close();
    }
}
