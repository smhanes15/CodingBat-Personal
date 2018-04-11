/*
 *  Warmup-2 --> stringBits
 *
 *    Given a string, return a new string made of every other char starting with the first, so "Hello"
 *    yields "Hlo".
 *
 *  Tests:
 *    stringBits("Hello") ? "Hlo"
 *    stringBits("Hi") ? "H"
 *    stringBits("Heeololeo") ? "Hello"
 *    stringBits("HiHiHi") ? "HHH"
 *    stringBits("") ? ""
 *    stringBits("Greetings") ? "Getns"
 *    stringBits("Chocoate") ? "Coot"
 *    stringBits("pi") ? "p"
 *    stringBits("Hello Kitten") ? "HloKte"
 *    stringBits("hxaxpxpxy") ? "happy"
 */
public class StringBits {
  public String stringBits(String str) {
    String result = "";
    for (int x = 0; x < str.length(); x += 2) {
      result += str.substring(x, x + 1);
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
