package academy.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    private Calculator calculator;

    @Test
    public void addNumbers_shouldReturnSum_positiveNumbers(){
       assertThat(Calculator.calculate(2,3)).isEqualTo(5);
    }

    @Test
    public void addNumbers_shouldReturnZero_ifZero(){
        assertThat(Calculator.calculate(0,0)).isEqualTo(0);
    }

    @Test
    public void addNumbers_shouldReturnNegative_ifSumIsMinus(){
        assertThat(Calculator.calculate(4,-5)).isEqualTo(-1);
    }

    @Test
    public void subtractNumbers_shouldReturnResultOfSubtraction(){
       final int expected = 10;
       final int actual = Calculator.subtract(20,10);
       assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplyNumbers_shouldReturnMultiplyResult(){
        final int expected = 25;
        final int actual = Calculator.multiply(5,5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideNumbers_shouldReturnDividedResult(){
        final int expected = 3;
        final int actual = Calculator.divide(6,2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void reminderOfNumbers_shouldReturnReminder(){
        final int expected = 1;
        final int actual = Calculator.reminder(11,2);
        assertThat(actual).isEqualTo(expected);
    }


}
