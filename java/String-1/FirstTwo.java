/*
 *  String-1 --> firstTwo
 *
 *    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If
 *    the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty
 *    string "" yields the empty string "". Note that str.length() returns the length of a string.
 *
 *  Tests:
 *    firstTwo("Hello") ? "He"
 *    firstTwo("abcdefg") ? "ab"
 *    firstTwo("ab") ? "ab"
 *    firstTwo("a") ? "a"
 *    firstTwo("") ? ""
 *    firstTwo("Kitten") ? "Ki"
 *    firstTwo("hi") ? "hi"
 *    firstTwo("hiya") ? "hi"
 *    other tests
 */
public class FirstTwo {
  public String firstTwo(String str) {
    return (str.length() > 1) ? str.substring(0, 2) : str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
