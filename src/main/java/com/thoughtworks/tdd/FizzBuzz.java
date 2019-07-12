package com.thoughtworks.tdd;

public class FizzBuzz {

  private int num;

  public FizzBuzz() {

  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  //  public String say(int sum) {
//    boolean mod3 = sum % 3 == 0 ? true : false;
//    boolean mod5 = sum % 5 == 0 ? true : false;
//    boolean mod7 = sum % 7 == 0 ? true : false;
//    return (mod3)
//        ? (mod5 ? (mod7 ? "FizzBuzzWhizz" : "FizzBuzz")
//        : mod7?"FizzWhizz":"Fizz")
//        : (mod7 ? "Whizz" : sum + "");
//  }
  public String say(int num) {
    String result = "";
    if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
      if (num % 3 == 0) {
        result += "Fizz";
      }
      if (num % 5 == 0) {
        result += "Buzz";
      }
      if (num % 7 == 0) {
        result += "Whizz";
      }
    }
    return result;
  }
}
