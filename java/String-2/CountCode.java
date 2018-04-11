/*
 *  String-2 --> countCode
 *
 *    Return the number of times that the string "code" appears anywhere in the given string, except we'll
 *    accept any letter for the 'd', so "cope" and "cooe" count.
 *
 *  Tests:
 *    countCode("aaacodebbb") ? 1
 *    countCode("codexxcode") ? 2
 *    countCode("cozexxcope") ? 2
 *    countCode("cozfxxcope") ? 1
 *    countCode("xxcozeyycop") ? 1
 *    countCode("cozcop") ? 0
 *    countCode("abcxyz") ? 0
 *    countCode("code") ? 1
 *    countCode("ode") ? 0
 *    countCode("c") ? 0
 *    countCode("") ? 0
 *    countCode("AAcodeBBcoleCCccoreDD") ? 3
 *    countCode("AAcodeBBcoleCCccorfDD") ? 2
 *    countCode("coAcodeBcoleccoreDD") ? 3
 *    other tests
 */
public class CountCode {
  public int countCode(String str) {
    int c = 0;
    for (int x = 0; x < str.length() - 3; x++) {
      if (str.substring(x, x + 2).equals("co") && str.charAt(x + 3) == 'e') {
        c++;
      }
    }
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
