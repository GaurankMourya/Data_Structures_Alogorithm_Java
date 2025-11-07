import java.util.Scanner;

public class Array {
    static void CountFrequency(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The frequency of " + num + " is: " + count);
    }

    static void LastOccurence(int arr[], int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                index = i;
        }
        System.out.println("The last occurence of " + num + " is at index: " + index);
    }

    static boolean Chk_Sorted_Array(int arr[]) {

        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void CountNumberOfPairs(int arr[], int target) {
        // METHOD TO FIND THE NUMBER OF PAIRS IN AN ARRAY WHOSE SUM IS EQUAL TO A GIVEN
        // NUMBER
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println("The number of pairs with sum " + target + " is: " + count);
    }

    static void CountNumberOfTriplets(int arr[], int target) {
        // METHOD TO FIND THE NUMBER OF TRIPLETS IN AN ARRAY WHOSE SUM IS EQUAL TO A
        // GIVEN NUMBER

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println("The number of triplets with sum " + target + " is: " + count);
    }

    static void UniqueNumber(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("Unique Number is: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // CountFrequency(arr, num);
        // LastOccurence(arr, num);

        // int chk_arr[] = new int[10];
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < chk_arr.length; i++) {
        // chk_arr[i] = sc.nextInt();
        // }
        // System.out.println("Is Sorted: " + Chk_Sorted_Array(chk_arr));

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println("Enter the target sum:");
        // int target = sc.nextInt();
        // CountNumberOfPairs(arr, target);
        // CountNumberOfTriplets(arr, target);

        // int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        // UniqueNumber(arr);

        
    }
}