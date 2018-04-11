/*
 *  Warmup-2 --> stringSplosion
 *
 *    Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 *  Tests:
 *    stringSplosion("Code") ? "CCoCodCode"
 *    stringSplosion("abc") ? "aababc"
 *    stringSplosion("ab") ? "aab"
 *    stringSplosion("x") ? "x"
 *    stringSplosion("fade") ? "ffafadfade"
 *    stringSplosion("There") ? "TThTheTherThere"
 *    stringSplosion("Kitten") ? "KKiKitKittKitteKitten"
 *    stringSplosion("Bye") ? "BByBye"
 *    stringSplosion("Good") ? "GGoGooGood"
 *    stringSplosion("Bad") ? "BBaBad"
 */
public class StringSplosion {
  public String stringSplosion(String str) {
    String result = "";
    for (int x = str.length(); x > 0; x--) {
      result = str.substring(0, x) + result;
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
