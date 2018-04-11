/*
 *  String-2 --> repeatFront
 *
 *    Given a string and an int n, return a string made of the first n characters of the string, followed
 *    by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the
 *    length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 *
 *  Tests:
 *    repeatFront("Chocolate", 4) ? "ChocChoChC"
 *    repeatFront("Chocolate", 3) ? "ChoChC"
 *    repeatFront("Ice Cream", 2) ? "IcI"
 *    repeatFront("Ice Cream", 1) ? "I"
 *    repeatFront("Ice Cream", 0) ? ""
 *    repeatFront("xyz", 3) ? "xyzxyx"
 *    repeatFront("", 0) ? ""
 *    repeatFront("Java", 4) ? "JavaJavJaJ"
 *    repeatFront("Java", 1) ? "J"
 *    other tests
 */
public class RepeatFront {
  public String repeatFront(String str, int n) {
    String s = "";
    for (int x = 0; x < n; x++) {
      s += str.substring(0, n - x);
    }
    return s;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
