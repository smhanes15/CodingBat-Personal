/*
 *  String-3 --> sumNumbers
 *
 *    Given a string, return the sum of the numbers appearing in the string, ignoring all other
 *    characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
 *    tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
 *    an int.)
 *
 *  Tests:
 *    sumNumbers("abc123xyz") ? 123
 *    sumNumbers("aa11b33") ? 44
 *    sumNumbers("7 11") ? 18
 *    sumNumbers("Chocolate") ? 0
 *    sumNumbers("5hoco1a1e") ? 7
 *    sumNumbers("5$$1;;1!!") ? 7
 *    sumNumbers("a1234bb11") ? 1245
 *    sumNumbers("") ? 0
 *    sumNumbers("a22bbb3") ? 25
 *    other tests
 */
public class SumNumbers {
  public int sumNumbers(String str) {
    String[] nums = str.split("[\\D]++");
    if (nums.length == 0) return 0;
    int sum = 0;
    for (String n : nums) {
      if (n.length() > 0) {
        sum += Integer.parseInt(n);
      }
    }
    return sum;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
