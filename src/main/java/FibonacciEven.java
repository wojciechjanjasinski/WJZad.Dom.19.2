
public class FibonacciEven {

    public static int generateOnlyEvenFibonacciNumbersSum(int limit){
        int sum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        int i = 1;
        while (i <= limit){
            if (secondNumber % 2 == 0){
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                i++;
            }

        }
        return sum;
    }
}
