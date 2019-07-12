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

  public String say(int sum) {
    boolean mod3 = sum % 3 == 0 ? true : false;
    boolean mod5 = sum % 5 == 0 ? true : false;
    boolean mod7 = sum % 7 == 0 ? true : false;
    return (mod3)
        ? (mod5 ? (mod7 ? "FizzBuzzWhizz" : "FizzBuzz")
        : mod7?"FizzWhizz":"Fizz")
        : (mod7 ? "Whizz" : sum + "");
  }
}
