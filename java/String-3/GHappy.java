/*
 *  String-3 --> gHappy
 *
 *    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
 *    left or right. Return true if all the g's in the given string are happy.
 *
 *  Tests:
 *    gHappy("xxggxx") ? true
 *    gHappy("xxgxx") ? false
 *    gHappy("xxggyygxx") ? false
 *    gHappy("g") ? false
 *    gHappy("gg") ? true
 *    gHappy("") ? true
 *    gHappy("xxgggxyz") ? true
 *    gHappy("xxgggxyg") ? false
 *    gHappy("xxgggxygg") ? true
 *    gHappy("mgm") ? false
 *    gHappy("mggm") ? true
 *    gHappy("yyygggxyy") ? true
 *    other tests
 */
public class GHappy {
  public boolean gHappy(String str) {
    if (str.length() == 1 && str.charAt(0) == 'g') return false;
    for (int x = 0; x < str.length(); x++) {
      if (x == str.length() - 1 && str.charAt(x) == 'g') {
        if (str.charAt(x - 1) != 'g') return false;
      }
      if (x > 0 && str.charAt(x) == 'g') {
        if (str.charAt(x - 1) != 'g' && str.charAt(x + 1) != 'g') return false;
      }
      if (x == 0 && str.charAt(x) == 'g') {
        if (str.charAt(x + 1) != 'g') return false;
      }
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
