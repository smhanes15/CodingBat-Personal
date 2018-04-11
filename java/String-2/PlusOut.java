/*
 *  String-2 --> plusOut
 *
 *    Given a string and a non-empty word string, return a version of the original String where all chars
 *    have been replaced by pluses ("+"), except for appearances of the word string which are preserved
 *    unchanged.
 *
 *  Tests:
 *    plusOut("12xy34", "xy") ? "++xy++"
 *    plusOut("12xy34", "1") ? "1+++++"
 *    plusOut("12xy34xyabcxy", "xy") ? "++xy++xy+++xy"
 *    plusOut("abXYabcXYZ", "ab") ? "ab++ab++++"
 *    plusOut("abXYabcXYZ", "abc") ? "++++abc+++"
 *    plusOut("abXYabcXYZ", "XY") ? "++XY+++XY+"
 *    plusOut("abXYxyzXYZ", "XYZ") ? "+++++++XYZ"
 *    plusOut("--++ab", "++") ? "++++++"
 *    plusOut("aaxxxxbb", "xx") ? "++xxxx++"
 *    plusOut("123123", "3") ? "++3++3"
 *    other tests
 */
public class PlusOut {
  public String plusOut(String str, String word) {
    int s = str.length();
    int w = word.length();
    String newStr = "";
    for (int x = 0; x < s; x++) {
      if (x <= s - w) {
        String tmp = str.substring(x, x + w);
        if (tmp.equals(word)) {
          newStr += word;
          x += w - 1;
        } else {
          newStr += "+";
        }
      } else {
        newStr += "+";
      }
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
