/*
 *  String-2 --> bobThere
 *
 *    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any
 *    char.
 *
 *  Tests:
 *    bobThere("abcbob") ? true
 *    bobThere("b9b") ? true
 *    bobThere("bac") ? false
 *    bobThere("bbb") ? true
 *    bobThere("abcdefb") ? false
 *    bobThere("123abcbcdbabxyz") ? true
 *    bobThere("b12") ? false
 *    bobThere("b1b") ? true
 *    bobThere("b12b1b") ? true
 *    bobThere("bbc") ? false
 *    bobThere("bbb") ? true
 *    bobThere("bb") ? false
 *    bobThere("b") ? false
 *    other tests
 */
public class BobThere {
  public boolean bobThere(String str) {
    return str.matches(".*[b].[b].*");
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
