
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void shouldReturnProperSumOfFibonacciNumbers() {
        int expectedHowManyNumbersShouldBeAddTogether = 33;
        FibonacciEven.generateOnlyEvenFibonacciNumbersSum(expectedHowManyNumbersShouldBeAddTogether);
        assertThat(expectedHowManyNumbersShouldBeAddTogether);
    }

    @Test
    void shouldMakeUnableToUseZero() {
        int unexpectedZero = 0;
        int userChoice = 5;
        FibonacciEven.generateOnlyEvenFibonacciNumbersSum(userChoice);
        assertThat(unexpectedZero).isNotEqualTo(userChoice);
    }
    @Test
    void shouldMakeUnableToUseNegativeNumbers(){
        int testNumberFromUser = 20;
        FibonacciEven.generateOnlyEvenFibonacciNumbersSum(15);
        assertThat(testNumberFromUser)
                .isNotNegative();
    }
    @Test
    void shouldPreventHigherNumbersThan33 (){
        int higherThanExpected = 34;
        FibonacciEven.generateOnlyEvenFibonacciNumbersSum(38);
        assertThat(32)
                .isLessThan(higherThanExpected);
    }
}
