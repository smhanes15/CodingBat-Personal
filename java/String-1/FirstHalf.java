/*
 *  String-1 --> firstHalf
 *
 *    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 *
 *  Tests:
 *    firstHalf("WooHoo") ? "Woo"
 *    firstHalf("HelloThere") ? "Hello"
 *    firstHalf("abcdef") ? "abc"
 *    firstHalf("ab") ? "a"
 *    firstHalf("") ? ""
 *    firstHalf("0123456789") ? "01234"
 *    firstHalf("kitten") ? "kit"
 *    other tests
 */
public class FirstHalf {
  public String firstHalf(String str) {
    return (str.length() % 2 == 0) ? str.substring(0, str.length() / 2) : str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
