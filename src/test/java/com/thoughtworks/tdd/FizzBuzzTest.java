package com.thoughtworks.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  public void should_get_1_when_given_1() {
    int student = 1;
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = "1";
    String output = fizzBuzz.say(student);
    assertEquals(result, output);
  }

  @Test
  public void should_get_Fizz_when_given_3() {
    int student = 3;
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = "Fizz";
    String output = fizzBuzz.say(student);
    assertEquals(result, output);
  }

  @Test
  public void should_get_FizzBuzz_when_given_15() {
    int student = 15;
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = "FizzBuzz";
    String output = fizzBuzz.say(student);
    assertEquals(result, output);
  }

  @Test
  public void should_get_FizzBuzzWhizz_when_given_105() {
    int student = 105;
    String expectedResult = "FizzBuzzWhizz";
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.say(student);
    assertEquals(actualResult,expectedResult);
  }

  @Test
  public void should_get_Buzz_when_given_10() {
    int student = 10;
    String expectedResult = "Buzz";
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.say(student);
    assertEquals(actualResult,expectedResult);
  }
  @Test
  public void should_get_Whizz_when_given_7() {
    int student = 7;
    String expectedResult = "Whizz";
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.say(student);
    assertEquals(actualResult,expectedResult);
  }

  @Test
  public void should_get_FizzWhizz_when_given_21() {
    int student = 21;
    String expectedResult = "FizzWhizz";
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.say(student);
    assertEquals(actualResult,expectedResult);
  }
}