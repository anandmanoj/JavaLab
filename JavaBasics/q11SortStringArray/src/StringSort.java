import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit of the String Array: ");
        int limit = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[limit];

        for(int i=0;i<limit;i++){
            System.out.print("Enter word: ");
            words[i] = scanner.nextLine();
        }

        System.out.println("\nEntered Strings in Array: ");
        for(String i: words){
            System.out.println(i);
        }

        String temp;

        for(int i=0; i<limit-1; i++){
            for(int j=i+1; j<limit; j++){
                if(words[i].compareToIgnoreCase(words[j])>0){
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }

        System.out.println("\nSorted Array of Strings: ");
        for(String i: words){
            System.out.println(i);
        }

        scanner.close();

    }
}

