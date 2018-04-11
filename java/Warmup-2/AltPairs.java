/*
 *  Warmup-2 --> altPairs
 *
 *    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields
 *    "kien".
 *
 *  Tests:
 *    altPairs("kitten") ? "kien"
 *    altPairs("Chocolate") ? "Chole"
 *    altPairs("CodingHorror") ? "Congrr"
 *    altPairs("yak") ? "ya"
 *    altPairs("ya") ? "ya"
 *    altPairs("y") ? "y"
 *    altPairs("") ? ""
 *    altPairs("ThisThatTheOther") ? "ThThThth"
 */
public class AltPairs {
  public String altPairs(String str) {
    int len = str.length();
    String result = "";
    for (int x = 0; x < len; x += 4) {
      int end = x + 2;
      if (end > len) {
        end = len;
      }
      result += str.substring(x, end);
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
