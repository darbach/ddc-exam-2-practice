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

}
