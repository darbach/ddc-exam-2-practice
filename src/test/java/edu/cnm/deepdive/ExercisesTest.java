package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
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
  void greatestCommonDivisor(long a, long b, long expected) {
    assertEquals(expected, Exercises.greatestCommonDivisor(a, b));
  }

  @DisplayName("minuteHandRadians")
  @ParameterizedTest(name = "[{index}] Asserting minuteHandRadians({0}) == {1}.")
  @CsvFileSource(resources = "minute-hand-radians.csv", numLinesToSkip = 1)
  void minuteHandRadians(int minutes, float expected) {
    assertEquals(expected, Exercises.minuteHandRadians(minutes), 3);
  }

  @DisplayName("hourHandRadians")
  @ParameterizedTest(name = "[{index}] Asserting hourHandRadians({0}, {1}) == {2}.")
  @CsvFileSource(resources = "hour-hand-radians.csv", numLinesToSkip = 1)
  void hourHandRadians(int hours, float minutes, float expected) {
    assertEquals(expected, Exercises.hourHandRadians(hours, minutes), 3);
  }


  @DisplayName("sliceArray")
  @ParameterizedTest(name = "[{index}] Asserting sliceArray([{0}], {1}, {2}, {3}) == {4}.")
  @CsvFileSource(resources = "slice-array.csv", numLinesToSkip = 1)
  void sliceArray(String input, int beginIndex, int endIndex, int stride, String expected) {
    int[] inputArr = Arrays.stream(input.split("\\s+"))
        .map(Integer::parseInt)
        .mapToInt(i -> i)
        .toArray();
    String actual = Arrays.toString(Exercises.sliceArray(inputArr, beginIndex, endIndex, stride));
    assertEquals(expected, actual);
  }

  @DisplayName("formatSSN")
  @ParameterizedTest(name = "[{index}] Asserting formatSSN([{0}]) == {1}.")
  @CsvFileSource(resources = "format-ssn.csv", numLinesToSkip = 1)
  void formatSSN(String input, String expected) {
    int[] inputArr = Arrays.stream(input.split("\\s+"))
        .map(Integer::parseInt)
        .mapToInt(i -> i)
        .toArray();
    String actual = Exercises.formatSSN(inputArr);
    assertEquals(expected, actual);
  }

  @DisplayName("parseSSN")
  @ParameterizedTest(name = "[{index}] Asserting parseSSN(\"{0}\") == {1}.")
  @CsvFileSource(resources = "parse-ssn.csv", numLinesToSkip = 1)
  void parseSSN(String input, String expected) {
    assertEquals(expected, Arrays.toString(Exercises.parseSSN(input)));
  }
}