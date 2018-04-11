/*
 *  String-1 --> makeAbba
 *
 *    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi"
 *    and "Bye" returns "HiByeByeHi".
 *
 *  Tests:
 *    makeAbba("Hi", "Bye") ? "HiByeByeHi"
 *    makeAbba("Yo", "Alice") ? "YoAliceAliceYo"
 *    makeAbba("What", "Up") ? "WhatUpUpWhat"
 *    makeAbba("aaa", "bbb") ? "aaabbbbbbaaa"
 *    makeAbba("x", "y") ? "xyyx"
 *    makeAbba("x", "") ? "xx"
 *    makeAbba("", "y") ? "yy"
 *    makeAbba("Bo", "Ya") ? "BoYaYaBo"
 *    makeAbba("Ya", "Ya") ? "YaYaYaYa"
 *    other tests
 */
public class MakeAbba {
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
