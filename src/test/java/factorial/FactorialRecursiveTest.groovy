package factorial

import factotial.Factorial
import spock.lang.Specification

class FactorialRecursiveTest extends Specification {


    def "Should throw IllegalArgumentException for n < 0"() {
        given:
        long n = -1
        when:
        Factorial.factorialRecursive(n)
        then:
        thrown(IllegalArgumentException)
    }

    def "Should return 0 for n = 0"() {
        given:
        long n = 0
        when:
        long result = Factorial.factorialRecursive(n)
        then:
        result == 0
    }

    def "Should return 1 for n = 1"() {
        given:
        long n = 1
        when:
        long result = Factorial.factorialRecursive(n)
        then:
        result == 1
    }

    def "Should return 120 for n = 5"() {
        given:
        long n = 5
        when:
        long result = Factorial.factorialRecursive(n)
        then:
        result == 120
    }
}