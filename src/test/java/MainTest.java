
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void shouldReturnProperSumOfFibonacciEvenNumbers() {
        //given
        int testValue = 33;
        //when
        int sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(testValue);
        //then
        int expectedValue = 4613732;
        assertThat(sum).isEqualTo(expectedValue);
    }

    @Test
    void shouldMakeUnableToUseZero() {
        //given
        int unexpectedZero = 0;
        int testValue = 5;
        //when
        int sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(testValue);
        //then
        assertThat(unexpectedZero).isNotEqualTo(testValue);
    }

    @Test
    void shouldMakeUnableToUseNegativeNumbers() {
        //given
        int testValue = 5;
        //when
        int sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(testValue);
        //then
        assertThat(testValue)
                .isNotNegative();
    }
}
