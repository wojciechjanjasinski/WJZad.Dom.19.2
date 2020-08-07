
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FibonacciEven {


    public static List<Integer> generateOnlyEvenFibonacciNumbersSum(int numberFromUser){
        List<Integer> fibonacciNumbers = Collections.singletonList(Stream.iterate(new Integer[]{0, 1},
                number -> new Integer[]{number[1], number[0] + (number[1])})
                .limit(numberFromUser)
                .map(numeral -> numeral[0])
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue).sum());
        System.out.println(fibonacciNumbers);
        return fibonacciNumbers;
    }
}
