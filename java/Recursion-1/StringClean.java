/*
 *  Recursion-1 --> stringClean
 *
 *    Given a string, return recursively a "cleaned" string where adjacent chars that are the same have
 *    been reduced to a single char. So "yyzzza" yields "yza".
 *
 *  Tests:
 *    stringClean("yyzzza") ? "yza"
 *    stringClean("abbbcdd") ? "abcd"
 *    stringClean("Hello") ? "Helo"
 *    stringClean("XXabcYY") ? "XabcY"
 *    stringClean("112ab445") ? "12ab45"
 *    stringClean("Hello Bookkeeper") ? "Helo Bokeper"
 *    other tests
 */
public class StringClean {
  public String stringClean(String str) {
    if (str.length() < 2) {
      return str;
    }
    if (str.substring(0, 1).equals(str.substring(1, 2))) {
      return stringClean(str.substring(1));
    }
    return str.substring(0, 1) + stringClean(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
