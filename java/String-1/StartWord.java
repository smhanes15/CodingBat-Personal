/*
 *  String-1 --> startWord
 *
 *    Given a string and a second "word" string, we'll say that the word matches the string if it appears
 *    at the front of the string, except its first char does not need to match exactly. On a match, return
 *    the front of the string, or otherwise return the empty string. So, so with the string "hippo" the
 *    word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 *
 *  Tests:
 *    startWord("hippo", "hi") ? "hi"
 *    startWord("hippo", "xip") ? "hip"
 *    startWord("hippo", "i") ? "h"
 *    startWord("hippo", "ix") ? ""
 *    startWord("h", "ix") ? ""
 *    startWord("", "i") ? ""
 *    startWord("hip", "zi") ? "hi"
 *    startWord("hip", "zip") ? "hip"
 *    startWord("hip", "zig") ? ""
 *    startWord("h", "z") ? "h"
 *    startWord("hippo", "xippo") ? "hippo"
 *    startWord("hippo", "xyz") ? ""
 *    startWord("hippo", "hip") ? "hip"
 *    startWord("kitten", "cit") ? "kit"
 *    startWord("kit", "cit") ? "kit"
 *    other tests
 */
public class StartWord {
  public String startWord(String str, String word) {
    if (str.length() == 0) return "";
    if (word.length() == 1) return str.substring(0, 1);
    String newStr = word.substring(0, 1) + str.substring(1);
    if (newStr.indexOf(word) == 0) return str.substring(0, word.length());
    return "";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
