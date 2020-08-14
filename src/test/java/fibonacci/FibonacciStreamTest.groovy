package fibonacci

import spock.lang.Specification


class FibonacciStreamTest extends Specification {

    def "should throw IllegalArgumentException for n < 0"() {
        given:
        long n = -1
        when:
        Fibonacci.fibonacciStream(n)
        then:
        thrown(IllegalArgumentException)
    }

    def "should return 0 for n = 0"() {
        given:
        long n = 0
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 0
    }

    def "should return 1 for n = 1"() {
        given:
        long n = 1
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 1
    }

    def "should return 55 for n = 10"() {
        given:
        long n = 10
        when:
        long result = Fibonacci.fibonacciStream(n)
        then:
        result == 55
    }
}