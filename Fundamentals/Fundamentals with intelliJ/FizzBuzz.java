package bites.examples;

public class FizzBuzz {
    public static String play(Integer number) {
        System.out.println("The number is: ");
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.play(1));
        System.out.println(FizzBuzz.play(3));
        System.out.println(FizzBuzz.play(5));
        System.out.println(FizzBuzz.play(15));
    }
}
