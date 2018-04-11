/*
 *  String-1 --> middleThree
 *
 *    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 *    The string length will be at least 3.
 *
 *  Tests:
 *    middleThree("Candy") ? "and"
 *    middleThree("and") ? "and"
 *    middleThree("solving") ? "lvi"
 *    middleThree("Hi yet Hi") ? "yet"
 *    middleThree("java yet java") ? "yet"
 *    middleThree("Chocolate") ? "col"
 *    middleThree("XabcxyzabcX") ? "xyz"
 *    other tests
 */
public class MiddleThree {
  public String middleThree(String str) {
    int mid = str.length() / 2;
    return str.substring(mid - 1, mid + 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
