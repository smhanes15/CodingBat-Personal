/*
 *  Warmup-1 --> everyNth
 *
 *    Given a non-empty string and an int N, return the string made starting with char 0, and then every
 *    Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 *  Tests:
 *    everyNth("Miracle", 2) ? "Mrce"
 *    everyNth("abcdefg", 2) ? "aceg"
 *    everyNth("abcdefg", 3) ? "adg"
 *    everyNth("Chocolate", 3) ? "Cca"
 *    everyNth("Chocolates", 3) ? "Ccas"
 *    everyNth("Chocolates", 4) ? "Coe"
 *    everyNth("Chocolates", 100) ? "C"
 */
public class EveryNth {
  public String everyNth(String str, int n) {
    String result = "";
    for (int i = 0; i < str.length(); i = i + n) {
      result = result + str.charAt(i);
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
