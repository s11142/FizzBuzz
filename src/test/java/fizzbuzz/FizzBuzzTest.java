package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは数字を文字列に変換する {
        @Nested
        class その他の数字の場合はそのまま文字列に変換する {
            @Test
            void _1の場合に文字列1を返す() {
                assertEquals("1", fizzBuzz.convert(1));
            }

            @Test
            void _2の場合に文字列2を返す() {
                assertEquals("2", fizzBuzz.convert(2));
            }
        }


        @Nested
        class _3の倍数の場合は数字の代わりにFizzと変換する {
            @Test
            void _3の場合にFizzを返す() {
                assertEquals("Fizz", fizzBuzz.convert(3));
            }
        }

        @Nested
        class _5の倍数の場合は数字の代わりにBuzzと変換する {
            @Test
            void _5の場合にBuzzを返す() {
                assertEquals("Buzz", fizzBuzz.convert(5));
            }
        }
    }

}
