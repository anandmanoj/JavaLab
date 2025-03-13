import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        // Convert string to character array
        char[] charArray = str.toCharArray();

        //you only need to check half of the string ( str.length()/2 ) to check palindrome;
        for(int i=0; i<str.length()/2; i++){
            if(charArray[i] != charArray[str.length()-1-i]){
                System.out.println(str+" is not a Palindrome");
                scanner.close();
                return;
            }
        }
        System.out.println(str+" is a Palindrome");

        scanner.close();
    }
}
