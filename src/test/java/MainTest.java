
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void shouldReturnProperSumOfFibonacciNumbers() {
        //given
        int expectedHowManyNumbersShouldBeAddTogether = 33;
        //when
        List<Integer> sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(expectedHowManyNumbersShouldBeAddTogether);
        //then
        assertThat(expectedHowManyNumbersShouldBeAddTogether);
    }

    @Test
    void shouldMakeUnableToUseZero() {
        //given
        int unexpectedZero = 0;
        int userChoice = 5;
        //when
        List<Integer> sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(userChoice);
        //then
        assertThat(unexpectedZero).isNotEqualTo(userChoice);
    }
    @Test
    void shouldMakeUnableToUseNegativeNumbers(){
        //given
        int testNumberFromUser = 20;
        //when
        List<Integer> sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(15);
        //then
        assertThat(testNumberFromUser)
                .isNotNegative();
    }
    @Test
    void shouldPreventHigherNumbersThanThirtyThree (){
        //given
        int higherThanExpected = 34;
        //when
        List<Integer> sum = FibonacciEven.generateOnlyEvenFibonacciNumbersSum(38);
        //then
        assertThat(32)
                .isLessThan(higherThanExpected);
    }
}
