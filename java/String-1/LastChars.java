/*
 *  String-1 --> lastChars
 *
 *    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so
 *    "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 *
 *  Tests:
 *    lastChars("last", "chars") ? "ls"
 *    lastChars("yo", "java") ? "ya"
 *    lastChars("hi", "") ? "h@"
 *    lastChars("", "hello") ? "@o"
 *    lastChars("", "") ? "@@"
 *    lastChars("kitten", "hi") ? "ki"
 *    lastChars("k", "zip") ? "kp"
 *    lastChars("kitten", "") ? "k@"
 *    lastChars("kitten", "zip") ? "kp"
 *    other tests
 */
public class LastChars {
  public String lastChars(String a, String b) {
    int f = a.length();
    int s = b.length();
    String str = "";
    if (f > 0) str += a.substring(0, 1);
    else str += "@";
    if (s > 0) str += b.substring(s - 1);
    else str += "@";
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
