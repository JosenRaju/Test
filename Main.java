import java.util.*;

// Problem - 4

public class Main{

    public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};


        Map<Integer, Integer> multipleCount = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            multipleCount.put(i, 0);
        }


        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int num : numbers) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            multipleCount.put(divisor, count);
        }


        System.out.println(multipleCount);
    }
}
