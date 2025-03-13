import java.util.Scanner;

public class VowelConsonantsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        char[] charArray = str.toCharArray();

        int vcount=0,ccount=0; //vcount-VowelCount ccount-ConsonantsCount

        for(char i: charArray){
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                vcount++;
            }else if (i >= 'a' && i <= 'z') { // Check if it's a letter
                ccount++;
            }
        }

        System.out.println("Vowel count in "+str+": "+vcount);

        System.out.println("Consonants count in "+str+": "+ccount);

        scanner.close();

    }
}
