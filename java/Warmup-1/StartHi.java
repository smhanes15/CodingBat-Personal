/*
 *  Warmup-1 --> startHi
 *
 *    Given a string, return true if the string starts with "hi" and false otherwise.
 *
 *  Tests:
 *    startHi("hi there") ? true
 *    startHi("hi") ? true
 *    startHi("hello hi") ? false
 *    startHi("he") ? false
 *    startHi("h") ? false
 *    startHi("") ? false
 *    startHi("ho hi") ? false
 *    startHi("hi ho") ? true
 */
public class StartHi {
  public boolean startHi(String str) {
    return ((str.length() > 1) && (str.substring(0, 2).equals("hi"))) ? true : false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
