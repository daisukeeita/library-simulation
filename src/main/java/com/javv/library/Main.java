package com.javv.library;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    Account account = new Account("acolyptos", "1234", "Kanda", "Yuu");
    System.out.println(account.toString());
  }
}
