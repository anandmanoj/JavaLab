import java.util.Scanner;

public class SumRC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();

        int[][] a = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("a[%d][%d]: ",i,j);
                a[i][j] = scanner.nextInt();
            }
        }

        int rsum=0, csum=0; //int rsum=csum=0;

        //sum of each row
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                rsum=rsum+a[i][j];
            }
            System.out.println("Sum of row"+(i+1)+":"+rsum);
            rsum=0;
        }

        //sum of each column
        for(int j=0; j<col; j++){
            csum=0;
            for(int i=0; i<row; i++){
                csum+=a[i][j];
            }
            System.out.printf("\nsum of column %d: %d",j+1,csum);
        }

        //sum of all row
        rsum=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                rsum=rsum+a[i][j];
            }
        }
        System.out.println("\n\nSum of rows: "+rsum);

        //sum of all column
        csum=0;
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                csum+=a[i][j];
            }
        }

        System.out.println("Sum of columns: "+csum);

        scanner.close();

    }
}
