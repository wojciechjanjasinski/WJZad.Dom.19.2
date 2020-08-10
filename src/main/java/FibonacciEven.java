
import java.util.List;

public class FibonacciEven {

    public static List<Integer> generateOnlyEvenFibonacciNumbersSum(int limitFromUser){
        int sum = 0;
        long limit = limitFromUser;
        for (Integer[] number = new Integer[]{0, 1}; ; number = new Integer[]{number[1], number[0] + (number[1])}) {
            if (limit-- == 0) break;
            Integer integer = number[0];
            if (integer % 2 == 0) {
                int intValue = integer;
                sum += intValue;
            }
        }
        return List.of(sum);
    }
}
