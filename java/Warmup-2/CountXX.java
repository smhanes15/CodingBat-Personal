/*
 *  Warmup-2 --> countXX
 *
 *    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx"
 *    contains 2 "xx".
 *
 *  Tests:
 *    countXX("abcxx") ? 1
 *    countXX("xxx") ? 2
 *    countXX("xxxx") ? 3
 *    countXX("abc") ? 0
 *    countXX("Hello there") ? 0
 *    countXX("Hexxo thxxe") ? 2
 *    countXX("") ? 0
 *    countXX("Kittens") ? 0
 *    countXX("Kittensxxx") ? 2
 */
public class CountXX {
  int countXX(String str) {
    int count = 0;
    for (int x = 0; x < str.length() - 1; x++) {
      if (str.charAt(x) == 'x' && str.charAt(x + 1) == 'x') count++;
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
