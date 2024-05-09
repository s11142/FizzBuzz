import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void _1を渡すと文字列1を返す() {
        // 準備(Arrange)
        FizzBuzz fizzBuzz = new FizzBuzz();
        // 実行(Act)
        String actual = fizzBuzz.convert(1);
        // 検証(Assert)
        assertEquals("1", actual);
    }
}