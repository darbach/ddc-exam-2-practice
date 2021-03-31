package edu.cnm.deepdive;

import java.math.BigInteger;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Exercises {

  /**
   * Perfect squares are positive integers which are the product of some integer multiplied by
   * itself. For example, 1=1^2, 4=2^2, 9=3^2, 16=4^2, etc. Thus, 1,4,9,16,… are perfect squares.
   *
   * Your task is to implement a method that takes a long input parameter, and—if the value of that
   * parameter is a perfect square—returns the next perfect square higher than the input value.
   * For example, 225=15^2, and 256=16^2, so the next perfect square after 225 is 256.
   *
   * @param input number to evaluate
   * @return next highest perfect square above input
   */
  public static long nextPerfectSquare(long input) {
    BigInteger squareRoot = new BigInteger(Long.toString(input)).sqrt(); //find the truncated "int" sqrt
    squareRoot = squareRoot.add(BigInteger.ONE); //add 1
    return squareRoot.multiply(squareRoot).longValue(); //multiply
  }

  /**
   * In very general terms, the greatest common divisor (GCD) of 2 numbers is the largest positive
   * value that evenly divides both numbers. The Greek mathematician Euclid stated a simply elegant
   * algorithm for computing the GCD over 2,000 years ago—and that algorithm is still used today,
   * with only minor refinements.
   *
   * In this problem, you’ll work from a pseudocode statement of the algorithm to implement a
   * method that returns the GCD of 2 long values.
   *
   * @param a first value
   * @param b second value
   * @return greatest common divisor of a and b
   */
  public static long greatestCommonDivisor(long a, long b) {
//  1. Given two numbers, a and b, where:
    //     * a is a natural counting number
    //     * b is a natural counting number
    if ((a > 0) && (b > 0)) {
      //  2. Define new variables a' and b', with:
      //     * a' = a
      //     * b' = b
      long aPrime = a;
      long bPrime = b;

      //  3. While (b' != 0):
      //     * If (a' > b'), then:
      //        * a' = (a' – b')
      //       Otherwise:
      //        * b' = (b' – a')
      while (bPrime != 0) {
        if (aPrime > bPrime) {
          aPrime = aPrime - bPrime;
        } else {
          bPrime = bPrime - aPrime;
        }
      }
      //  4. a' is the GCD of a and b.
      return aPrime;
    } else {
      return -1;
    }
  }

}
