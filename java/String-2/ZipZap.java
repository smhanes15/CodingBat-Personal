/*
 *  String-2 --> zipZap
 *
 *    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with
 *    'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields
 *    "zpXzp".
 *
 *  Tests:
 *    zipZap("zipXzap") ? "zpXzp"
 *    zipZap("zopzop") ? "zpzp"
 *    zipZap("zzzopzop") ? "zzzpzp"
 *    zipZap("zibzap") ? "zibzp"
 *    zipZap("zip") ? "zp"
 *    zipZap("zi") ? "zi"
 *    zipZap("z") ? "z"
 *    zipZap("") ? ""
 *    zipZap("zzp") ? "zp"
 *    zipZap("abcppp") ? "abcppp"
 *    zipZap("azbcppp") ? "azbcppp"
 *    zipZap("azbcpzpp") ? "azbcpzp"
 *    other tests
 */
public class ZipZap {
  public String zipZap(String str) {
    return str.replaceAll("[z].[p]", "zp");
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
