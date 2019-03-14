package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This class is for test porpouse
   * @param someone name for someone human ben
   * @return String with the human ben
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
