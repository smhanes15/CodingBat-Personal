/*
 *  Recursion-1 --> countAbc
 *
 *    Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 *
 *  Tests:
 *    countAbc("abc") ? 1
 *    countAbc("abcxxabc") ? 2
 *    countAbc("abaxxaba") ? 2
 *    countAbc("ababc") ? 2
 *    countAbc("abxbc") ? 0
 *    countAbc("aaabc") ? 1
 *    countAbc("hello") ? 0
 *    countAbc("") ? 0
 *    countAbc("ab") ? 0
 *    countAbc("aba") ? 1
 *    countAbc("aca") ? 0
 *    countAbc("aaa") ? 0
 *    other tests
 */
public class CountAbc {
  public int countAbc(String str) {
    if (str.length() < 3) {
      return 0;
    }
    if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
      return 1 + countAbc(str.substring(2));
    }
    return 0 + countAbc(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
