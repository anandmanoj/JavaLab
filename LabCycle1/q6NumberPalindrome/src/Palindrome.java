import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int rev = 0;
        int oth = num;
        while(oth!=0){
            int last = oth%10;
            oth = oth/10;
            rev = (rev*10)+last;
        }
        if(num == rev){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not a palindrome");
        }

        scanner.close();
    }
}
