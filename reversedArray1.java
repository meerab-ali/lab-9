import java.util.Scanner;
public class reversedArray1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       int[] array=new int[10];
       for(int i =0;i<array.length;i++){
        array[i]=input.nextInt();
       } 
       reverse(array);
    }
    public static void reverse(int[] arr){
        System.out.println("\nreversed array");
        for(int a=arr.length-1;a>=0;a--){
            System.out.print(arr[a]+" ");
    }
}