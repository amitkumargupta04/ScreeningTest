
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) numbers.add(Integer.parseInt(part));

        Map<Integer, Integer> multiplesCount = new HashMap<>();
        for (int i = 1; i <= 9; i++) multiplesCount.put(i, 0);

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) multiplesCount.put(i, multiplesCount.get(i) + 1);
            }
        }

        System.out.println(multiplesCount);
        sc.close();
    }
}
