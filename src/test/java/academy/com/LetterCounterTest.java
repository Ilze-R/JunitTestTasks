package academy.com;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LetterCounterTest {

    @Test
    public void countLettersInWord_shouldReturnTheCount_ifLetterIsPresent(){
       assertThat(LetterCounter.countCharacters("apple", 'p')).isEqualTo(2);
    }

    @Test
    public void countLettersInWord_returnZeroWhenWordISEmpty(){
        assertThat(LetterCounter.countCharacters("", 'p')).isEqualTo(0);
    }

    @Test
    public void countLettersInWord_returnZero_whenSelectedLetterIsNotPresent(){
        assertThat(LetterCounter.countCharacters("apple", 'z')).isEqualTo(0);
    }
}
