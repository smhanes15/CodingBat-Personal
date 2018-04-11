/*
 *  Warmup-1 --> stringE
 *
 *    Return true if the given string contains between 1 and 3 'e' chars.
 *
 *  Tests:
 *    stringE("Hello") ? true
 *    stringE("Heelle") ? true
 *    stringE("Heelele") ? false
 *    stringE("Hll") ? false
 *    stringE("e") ? true
 *    stringE("") ? false
 */
public class StringE {
  public boolean stringE(String str) {
    int cOld = str.length();
    int cNew = str.replace("e", "").length();
    return ((cOld - cNew) >= 1 && (cOld - cNew) <= 3);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
