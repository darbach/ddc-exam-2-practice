package edu.cnm.deepdive;

import java.math.BigInteger;
import java.util.Arrays;

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

  /**
   * Given an int[], return a specified slice of the array. Rather than a simple sub-array, a slice
   * contains the elements starting from beginIndex, up to (but not including) endIndex, skipping
   * elements according to a step or stride parameter value (stride).
   *
   * For example, a slice of {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, with a beginIndex value of 1, an
   * endIndex of 9, and a stride of 2, would return {1, 3, 8, 21}—that is, the array containing the
   * elements from the original array starting at position 1, advancing by 2 positions in each step
   * (thus, including values from positions 1, 3, 5, etc. of the original), including each such
   * value up to, but not including the element in position 9.
   *
   * @param input an array of ints
   * @param beginIndex the starting index
   * @param endIndex the ending index (non-inclusive)
   * @param stride number of elements to skip
   * @return an array from input from beginIndex to endIndex, skipping to each stride element
   */
  public static int[] sliceArray(int[] input, int beginIndex, int endIndex, int stride) {
    int[] result = new int[(endIndex - beginIndex) / stride];
    for (int i = 0, j = beginIndex; j < endIndex; i++, j += stride) {
      result[i] = input[j];
    }
    return result;
  }


  public static String formatSSN(int[] ssn) {
    return String.format("%03d-%03d-%04d", ssn[0], ssn[1], ssn[2]);
  }

  public static int[] parseSSN(String ssn) {
   int[] result = Arrays.stream(ssn.split("-"))
        .map(Integer::parseInt)
        .mapToInt((i) -> i)
        .toArray();
   return result;
  }
}
