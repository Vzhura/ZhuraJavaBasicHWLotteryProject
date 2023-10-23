import java.util.Arrays;
import java.util.Random;

public class LotteryProject {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            first[i] = random.nextInt(10);
            second[i] = random.nextInt(10);
        }

        System.out.println("Перший масив: " + Arrays.toString(first));
        System.out.println("Другий масив: " + Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println("Відсортований перший масив: " + Arrays.toString(first));
        System.out.println("Відсортований другий масив: " + Arrays.toString(second));

        int matches = countMatches(first, second);
        System.out.println("Кількість збігів: " + matches);
    }

    public static int countMatches(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }
}

