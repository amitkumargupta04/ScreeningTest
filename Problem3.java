
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; count < n; i += 2) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        sc.close();
    }
}
