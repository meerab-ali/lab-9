import java.util.Scanner;

public class FoodSurvey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ratings = new int[40];
        int[] count = new int[11];

        System.out.println("Enter 40 ratings (1 to 10):");

        for (int i = 0; i < 40; i++) {
            ratings[i] = input.nextInt();
            while (ratings[i] < 1 || ratings[i] > 10) {
                ratings[i] = input.nextInt();
            }
            count[ratings[i]]++;
        }

        System.out.println("\n----- SUMMARY OF POLL RESULTS -----");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rating " + i + ": " + count[i] + " time(s)");
        }
    }
}