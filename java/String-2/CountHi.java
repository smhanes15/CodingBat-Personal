/*
 *  String-2 --> countHi
 *
 *    Return the number of times that the string "hi" appears anywhere in the given string.
 *
 *  Tests:
 *    countHi("abc hi ho") ? 1
 *    countHi("ABChi hi") ? 2
 *    countHi("hihi") ? 2
 *    countHi("hiHIhi") ? 2
 *    countHi("") ? 0
 *    countHi("h") ? 0
 *    countHi("hi") ? 1
 *    countHi("Hi is no HI on ahI") ? 0
 *    countHi("hiho not HOHIhi") ? 2
 *    other tests
 */
public class CountHi {
  public int countHi(String str) {
    int numHi = 0;
    for (int x = 0; x < str.length() - 1; x++) {
      if (str.substring(x, x + 2).equals("hi")) {
        numHi++;
      }
    }
    return numHi;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
