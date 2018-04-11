/*
 *  String-1 --> seeColor
 *
 *    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return
 *    the empty string.
 *
 *  Tests:
 *    seeColor("redxx") ? "red"
 *    seeColor("xxred") ? ""
 *    seeColor("blueTimes") ? "blue"
 *    seeColor("NoColor") ? ""
 *    seeColor("red") ? "red"
 *    seeColor("re") ? ""
 *    seeColor("blu") ? ""
 *    seeColor("blue") ? "blue"
 *    seeColor("a") ? ""
 *    seeColor("") ? ""
 *    seeColor("xyzred") ? ""
 *    other tests
 */
public class SeeColor {
  public String seeColor(String str) {
    if (str.indexOf("red") == 0) return "red";
    if (str.indexOf("blue") == 0) return "blue";
    return "";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
