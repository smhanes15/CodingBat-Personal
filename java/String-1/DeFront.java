/*
 *  String-1 --> deFront
 *
 *    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
 *    and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
 *
 *  Tests:
 *    deFront("Hello") ? "llo"
 *    deFront("java") ? "va"
 *    deFront("away") ? "aay"
 *    deFront("axy") ? "ay"
 *    deFront("abc") ? "abc"
 *    deFront("xby") ? "by"
 *    deFront("ab") ? "ab"
 *    deFront("ax") ? "a"
 *    deFront("axb") ? "ab"
 *    deFront("aaa") ? "aa"
 *    deFront("xbc") ? "bc"
 *    deFront("bbb") ? "bb"
 *    deFront("bazz") ? "zz"
 *    deFront("ba") ? ""
 *    deFront("abxyz") ? "abxyz"
 *    deFront("hi") ? ""
 *    deFront("his") ? "s"
 *    deFront("xz") ? ""
 *    deFront("zzz") ? "z"
 *    other tests
 */
public class DeFront {
  public String deFront(String str) {
    String newStr = str.substring(2);
    if (str.substring(1, 2).equals("b")) newStr = "b" + newStr;
    if (str.substring(0, 1).equals("a")) newStr = "a" + newStr;
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
