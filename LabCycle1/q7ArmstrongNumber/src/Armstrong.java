import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        int temp = num;

        while(temp!=0){
            temp = temp/10;
            count++;
        }

        temp = num;
        int last;
        int exp;
        int result = 0;
        while(temp!=0){
            last = temp%10;
            exp = (int) Math.pow(last, count);
            result = result + exp;
            temp = temp/10;
        }

        if(result == num){
            System.out.println(num+" is a Armstrong number");
        }else{
            System.out.println(num+" is not a Armstrong number");
        }

        scanner.close();

    }
}

//        int result = (int) Math.pow(2, 3);
//        System.out.println(result);