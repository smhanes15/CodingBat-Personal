/*
 *  String-3 --> countYZ
 *
 *    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z'
 *    in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the
 *    end of a word if there is not an alphabetic letter immediately following it. (Note:
 *    Character.isLetter(char) tests if a char is an alphabetic letter.)
 *
 *  Tests:
 *    countYZ("fez day") ? 2
 *    countYZ("day fez") ? 2
 *    countYZ("day fyyyz") ? 2
 *    countYZ("day yak") ? 1
 *    countYZ("day:yak") ? 1
 *    countYZ("!!day--yaz!!") ? 2
 *    countYZ("yak zak") ? 0
 *    countYZ("DAY abc XYZ") ? 2
 *    countYZ("aaz yyz my") ? 3
 *    countYZ("y2bz") ? 2
 *    countYZ("zxyx") ? 0
 *    other tests
 */
public class CountYZ {
  public int countYZ(String str) {
    int c = 0;
    str = str.toUpperCase();
    for (int x = 0; x < str.length(); x++) {
      if (!Character.isLetter(str.charAt(x)) && x > 0) {
        if (str.substring(x - 1, x).equals("Y") || str.substring(x - 1, x).equals("Z")) c++;
      }
      if (x == str.length() - 1) {
        if (str.substring(x).equals("Y") || str.substring(x).equals("Z")) c++;
      }
    }
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
