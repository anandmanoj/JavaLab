import java.util.Scanner;

public class Rectangle {
    public static int area(int l, int w) {
        return l*w;
    }
    public static int perimeter(int l, int w) {
        return 2*(l+w);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the Rectangle: ");
        int width = scanner.nextInt();

        System.out.println("Area of the Rectangle is: "+area(length,width));

        System.out.println("Perimeter of the Rectangle is: "+perimeter(length,width));

        scanner.close();
        }
    }

