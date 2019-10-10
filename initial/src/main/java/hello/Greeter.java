package edu.ca.ets

import static java.lang.String.format;

/**
 * Hello World!
 * 
 */

 public class Greeter
 {
    pubic String greet(String name){
      System.out.println("Greet was called with param " + name);
      return format("Greetings %s how are you doing today!", name);
    }

 }