
public class FibonacciEven {

    public static int generateOnlyEvenFibonacciNumbersSum(int maxNumber) {
        int fibonacci;
        int currentNumber = 0;
        int previousNumber = 1;
        int sum = 0;

        for (int i = 0; i < maxNumber; i++) {
            fibonacci = currentNumber;
            currentNumber = previousNumber;
            previousNumber = fibonacci + currentNumber;

            if (previousNumber % 2 == 0)
                sum += previousNumber;
        }
        return sum;
    }
}
