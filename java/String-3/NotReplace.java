/*
 *  String-3 --> notReplace
 *
 *    Given a string, return a string where every appearance of the lowercase word "is" has been replaced
 *    with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for
 *    example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a
 *    letter.)
 *
 *  Tests:
 *    notReplace("is test") ? "is not test"
 *    notReplace("is-is") ? "is not-is not"
 *    notReplace("This is right") ? "This is not right"
 *    notReplace("This is isabell") ? "This is not isabell"
 *    notReplace("") ? ""
 *    notReplace("is") ? "is not"
 *    notReplace("isis") ? "isis"
 *    notReplace("Dis is bliss is") ? "Dis is not bliss is not"
 *    notReplace("is his") ? "is not his"
 *    notReplace("xis yis") ? "xis yis"
 *    notReplace("AAAis is") ? "AAAis is not"
 *    other tests
 */
public class NotReplace {
  public String notReplace(String str) {
    return str.replaceAll("(\\b)(is)(\\b)", "is not");
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
