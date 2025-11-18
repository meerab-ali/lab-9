import java.util.Scanner;

public class ArrayImplementation  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Press 1 for Inputting Elements into Array");
            System.out.println("Press 2 for Displaying Elements of the Array");
            System.out.println("Press 3 for Searching Elements in the Array");
            System.out.println("Press 4 for Copying the Elements into New Array");
            System.out.println("Press 5 for Largest and Smallest in the Array");
            System.out.println("Press 0 for Exit");
            System.out.print("Your Option: ");
            option = input.nextInt();

            switch (option) {

                // For Input
                case 1:
                    int[] a1 = new int[5];
                    int[] array = inputdata(a1);
                    display(array);
                    break;

                // For Display
                case 2:
                    int[] a2 = new int[5];
                    int[] array2 = inputdata(a2);
                    System.out.println("Displaying the elements");
                    display(array2);
                    break;

                // For Search
                case 3:
                    int[] a3 = new int[5];
                    int[] array3 = inputdata(a3);
                    System.out.print("Enter number to be searched: ");
                    int searchKey = input.nextInt();
                    search(array3, searchKey);
                    break;

                // For Copying
                case 4:
                    int[] a4 = new int[5];
                    int[] array4 = inputdata(a4);
                    int[] copied = copydata(array4);
                    System.out.println("Copied Array:");
                    display(copied);
                    break;

                // For Largest and Smallest
                case 5:
                    int[] a5 = new int[5];
                    int[] array5 = inputdata(a5);
                    largestsmallest(array5);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }

        } while (option != 0);
    }

    // Input Method
    public static int[] inputdata(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "] = ");
            array[i] = input.nextInt();
        }
        return array;
    }

    // Display Method
    public static void display(int[] a) {
        for (int i = 0; i < 5; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }

    // Searching Method
    public static void search(int[] array, int s) {
        int flag = 0;

        for (int i = 0; i < 5; i++) {
            if (array[i] == s) {
                System.out.println("Element found at index " + i);
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }
    }

    // Copy Method
    public static int[] copydata(int[] array) {
        int[] copy = new int[5];
        for (int i = 0; i < 5; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // Largest & Smallest Method
    public static void largestsmallest(int[] array) {
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < 5; i++) {
            if (array[i] > largest) largest = array[i];
            if (array[i] < smallest) smallest = array[i];
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}