import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double pi = 3.14159265359;
        double area = pi*(radius*radius);
        System.out.println("Area of the circle is: "+area);

        double perimeter = 2*radius*pi;
        System.out.println("Perimeter of the circle is: "+perimeter);

        scanner.close();
    }
}
