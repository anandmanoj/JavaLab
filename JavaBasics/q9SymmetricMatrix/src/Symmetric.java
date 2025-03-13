import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int column = scanner.nextInt();

        if(row!=column){
            System.out.println("Matrix must be square(row=column)");
            return;
        }

        int[][] a = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("Enter a[%d][%d]: ",i,j);
                a[i][j] = scanner.nextInt();
            }
        }


        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(a[i][j] != a[j][i]){
                    System.out.println("Matrix is asymmetric");
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println("Matrix is symmetric ");

        scanner.close();

    }
}
