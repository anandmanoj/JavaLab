import java.util.Scanner;

public class Marks {

    public static void pcm(double m, double p, double c){
        double total_pcm=m+p+c;
        double total_mp=m+p;
        if (total_pcm>=180 && total_mp>=120){
            System.out.println("You are eligible ");
        }
        else{
            System.out.println("Your are not eligible ");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks out of 100");
        System.out.print("Maths: ");
        double maths = scanner.nextDouble();
        System.out.print("Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry = scanner.nextDouble();

        if(maths<0 || maths>100 || physics<0 || physics>100 || chemistry<0 || chemistry>100){
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        }
        else {
            pcm(maths, physics, chemistry);
        }

        scanner.close();
    }
}
