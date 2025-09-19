import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // It include mostly used patterns in programming and you can uncomment and use any of them as per your need.

        // Solid Rectangle
        // int row, col;
        // System.out.println("Enter the number of rows: ");
        // row = sc.nextInt();
        // System.out.println("Enter the number of columns: ");
        // col = sc.nextInt();public  {


        // for (int i=1; i<=row; i++) {
        //     for (int j=1; j<=col; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Hollow Rectangle
        // int row;
        // int col;

        // System.out.println("Enter the number of rows: ");
        // row = sc.nextInt();
        // System.out.println("Enter the number of columns: ");
        // col = sc.nextInt();

        // for (int i=1; i<=row; i++) {
        //     for (int j=1; j<=col; j++) {
        //         if (i==1 || i==row || j==1 || j==col) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }



        // Half Pyramid
        // int n;

        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Inverted Half Pyramid
        // int n;
        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=n; j>=i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Half Pyramid after 180 degree rotation
        // int n;
        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=n; j>=i; j--) {
        //         if(j<=i) {
        //             for (int k=1; k<=i; k++) {
        //                 System.out.print("*");
        //             }
        //         }
        //         else System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        

        // Floyd's Triangle

        // int n, number = 1;

        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        // 0/1 Triangle

        // int n;
        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         if((i+j) %2 == 0) {
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Butterfly Pattern
        // int n;
        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k=n; k>=i; k--) {
        //         if(k<=i) {
        //             for (int l=1; l<=i; l++) {
        //                 System.out.print("*");
        //             }
        //         }
        //         else System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=n; i++) {
        //     for (int j=n; j>=i; j--) {
        //         System.out.print("*");
        //     }
            
        //     for (int k=n; k>=i; k--) {

        // It's incomplete code for this pattern. You can complete it as per your need.
        //     }
        //     System.out.println();
        // }


        // Solid Rhombus

        int n;
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
