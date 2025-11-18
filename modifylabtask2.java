import java.util.Scanner;

public class modifylabtask2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        // call modify function
        modify(array);

        System.out.println("Array after modification:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] modify(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
        return arr;
    }
}