/*
 *  Warmup-2 --> stringYak
 *
 *    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are
 *    removed, but the "a" can be any char. The "yak" strings will not overlap.
 *
 *  Tests:
 *    stringYak("yakpak") ? "pak"
 *    stringYak("pakyak") ? "pak"
 *    stringYak("yak123ya") ? "123ya"
 *    stringYak("yak") ? ""
 *    stringYak("yakxxxyak") ? "xxx"
 *    stringYak("HiyakHi") ? "HiHi"
 *    stringYak("xxxyakyyyakzzz") ? "xxxyyzzz"
 */
public class StringYak {
  public String stringYak(String str) {
    String result = str;
    for (int x = 0; x < result.length() - 2; x++) {
      if (result.charAt(x) == 'y') {
        if (result.charAt(x + 2) == 'k') {
          result = result.substring(0, x) + result.substring(x + 3);
        }
      }
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
