import java.util.Scanner;

public class PatternReplace {
    static void replace(){
        System.out.println("Enter String Value");
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        System.out.println("Enter the word to be replaced");
        String replaceString = sc.nextLine();
        System.out.println("Enter the new word");
        String newString = sc.nextLine();
        System.out.println(myStr.replace(replaceString, newString));
        sc.close();
    }
    public static void main(String [] args){
        replace();
    }
}
