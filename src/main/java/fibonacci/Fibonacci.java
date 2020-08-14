package fibonacci;

import lombok.NoArgsConstructor;

import java.util.stream.Stream;

@NoArgsConstructor
public class Fibonacci {
    public static long fibonacciIterative(long n) {
        validateArgument(n);
        if (n == 0 || n == 1) {
            return n;
        }

        long f0 = 0;
        long f1 = 1;
        for (long i = 2; i <= n; i++) {
            long tmp = f0 + f1;
            f0 = f1;
            f1 = tmp;
        }
        return f1;
    }

    public static long fibonacciRecursive(long n) {
        validateArgument(n);
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciStream(long n) {
        validateArgument(n);
        return Stream.iterate(new long[]{0, 1}, i -> new long[]{i[1], i[0] + i[1]})
                .limit(n)
                .reduce((f0, f1) -> f1)
                .map(f1 -> f1[1])
                .orElse(0L);
    }

    private static void validateArgument(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter 'n' have to be > 0!");
        }
    }
}

