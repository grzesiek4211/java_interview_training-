package factotial;

import lombok.NoArgsConstructor;

import java.util.stream.LongStream;
import java.util.stream.Stream;

@NoArgsConstructor
public class Factorial {

    public static long factorialIterative(long n) {
        validateArgument(n);
        if (n == 0) {
            return 0;
        }

        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(long n) {
        validateArgument(n);
        if (n == 0) {
            return 0;
        }
        if(n > 1) {
            return n * factorialRecursive(n-1);
        }
        return 1;
    }

    public static long factorialStream(long n) {
        validateArgument(n);
        if (n == 0) {
            return 0;
        }
        return LongStream.rangeClosed(1,n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        factorialStream(5);
    }

    private static void validateArgument(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter 'n' have to be > 0!");
        }
    }

}
