import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fizz Buzz 数列と変換規則を扱う FizzBuzzクラス")
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void 前準備() {
        fizzBuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは数を文字列に変換する {
        @Nested
        class その他の数のときはそのまま文字列に変換する {
            @Test
            void _1を渡すと文字列1を返す() {
                // 実行(Act) && 検証(Assert)
                assertEquals("1", fizzBuzz.convert(1));
            }
        }

        @Nested
        class _3の倍数の場合は数字の代わりにFizzに変換する {
            @Test
            void _3を渡すと文字列Fizzを返す() {
                assertEquals("Fizz", fizzBuzz.convert(3));
            }
        }

        @Nested
        class _5の倍数の場合は数字の代わりにBuzzに変換する {
            @Test
            void _5を渡すと文字列Buzzを返す() {
                assertEquals("Buzz", fizzBuzz.convert(5));
            }
        }

        @Nested
        class _3と5の倍数の場合は数字の代わりにFizzBuzzに変換する {
            @Test
            void _15を渡すと文字列FizzBuzzを返す() {
                assertEquals("FizzBuzz", fizzBuzz.convert(15));
            }
        }
    }


}