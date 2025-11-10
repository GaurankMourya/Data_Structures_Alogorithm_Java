import java.util.Scanner;
public class MaxAndSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter the elements of the array: ");
        for( int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int MAX = Integer.MIN_VALUE;
        int SECOND_MAX = Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            if (arr[i] > MAX) { MAX = arr[i]; }
        }

        for(int i=0; i<size; i++) {
            if(arr[i] == MAX) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        for(int i=0; i<size; i++) {
            if(arr[i] > SECOND_MAX) { SECOND_MAX = arr[i]; }
        } 

        System.out.println("The maximum element in the array is: " + MAX);
        System.out.println("The second maximum element in the array is: " + SECOND_MAX);



    }
}
