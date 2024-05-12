public class FizzBuzz {

    public String convert(int num) {
        if (isMultipleOfThree(num) && isMultipleOfFive(num)) {
            return "FizzBuzz";
        }
        if (isMultipleOfThree(num)) {
            return "Fizz";
        }
        if (isMultipleOfFive(num)) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }

    private boolean isMultipleOfThree(int num) {
        return num % 3 == 0;
    }
}
