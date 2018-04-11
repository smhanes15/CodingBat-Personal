/*
 *  Warmup-1 --> mixStart
 *
 *    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix"
 *    .. all count.
 *
 *  Tests:
 *    mixStart("mix snacks") ? true
 *    mixStart("pix snacks") ? true
 *    mixStart("piz snacks") ? false
 *    mixStart("nix") ? true
 *    mixStart("ni") ? false
 *    mixStart("n") ? false
 *    mixStart("") ? false
 */
public class MixStart {
  public boolean mixStart(String str) {
    return (str.indexOf("ix", 1) == 1) ? true : false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
