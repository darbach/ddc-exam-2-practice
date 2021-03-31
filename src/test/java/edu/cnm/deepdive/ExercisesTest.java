package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ExercisesTest {

  @DisplayName("nextPerfectSquare")
  @ParameterizedTest(name = "[{index}] Asserting nextPerfectSquare({0}) == {1}.")
  @CsvFileSource(resources = "next-perfect-square.csv", numLinesToSkip = 1)
  void nextPerfectSquare(long input, long expected) {
    assertEquals(expected, Exercises.nextPerfectSquare(input));
  }

  @DisplayName("greatestCommonDivisor")
  @ParameterizedTest(name = "[{index}] Asserting greatestCommonDivisor({0}, {1}) == {2}.")
  @CsvFileSource(resources = "greatest-common-divisor.csv", numLinesToSkip = 1)
  void nextPerfectSquare(long a, long b, long expected) {
    assertEquals(expected, Exercises.greatestCommonDivisor(a, b));
  }


}