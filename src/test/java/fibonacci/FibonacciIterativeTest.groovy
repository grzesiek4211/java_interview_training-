package fibonacci

import spock.lang.Specification


class FibonacciIterativeTest extends Specification {

    def "Iterative implementation: should throw IllegalArgumentException for n < 0"() {
        given:
        long n = -1
        when:
        Fibonacci.fibonacciIterative(n)
        then:
        thrown(IllegalArgumentException)
    }

    def "Iterative implementation: should return 0 for n = 0"() {
        given:
        long n = 0
        when:
        long result = Fibonacci.fibonacciIterative(n)
        then:
        result == 0
    }

    def "Iterative implementation: should return 1 for n = 1"() {
        given:
        long n = 1
        when:
        long result = Fibonacci.fibonacciIterative(n)
        then:
        result == 1
    }

    def "Iterative implementation: should return 55 for n = 10"() {
        given:
        long n = 10
        when:
        long result = Fibonacci.fibonacciIterative(n)
        then:
        result == 55
    }
}