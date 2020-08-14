package fibonacci

import spock.lang.Specification


class FibonacciTest extends Specification {

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


    def "Recursive implementation: should throw IllegalArgumentException for n < 0"() {
        given:
        long n = -1
        when:
        Fibonacci.fibonacciRecursive(n)
        then:
        thrown(IllegalArgumentException)
    }

    def "Recursive implementation: should return 0 for n = 0"() {
        given:
        long n = 0
        when:
        long result = Fibonacci.fibonacciRecursive(n)
        then:
        result == 0
    }

    def "Recursive implementation: should return 1 for n = 1"() {
        given:
        long n = 1
        when:
        long result = Fibonacci.fibonacciRecursive(n)
        then:
        result == 1
    }

    def "Recursive implementation: should return 55 for n = 10"() {
        given:
        long n = 10
        when:
        long result = Fibonacci.fibonacciRecursive(n)
        then:
        result == 55
    }

    def "Stream implementation: should throw IllegalArgumentException for n < 0"() {
        given:
        long n = -1
        when:
        Fibonacci.fibonacciStream(n)
        then:
        thrown(IllegalArgumentException)
    }

    def "Stream implementation: should return 0 for n = 0"() {
        given:
        long n = 0
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 0
    }

    def "Stream implementation: should return 1 for n = 1"() {
        given:
        long n = 1
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 1
    }

    def "Stream implementation: should return 55 for n = 10"() {
        given:
        long n = 10
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 55
    }
}