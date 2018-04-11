/*
 *  String-2 --> catDog
 *
 *    Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 *  Tests:
 *    catDog("catdog") ? true
 *    catDog("catcat") ? false
 *    catDog("1cat1cadodog") ? true
 *    catDog("catxxdogxxxdog") ? false
 *    catDog("catxdogxdogxcat") ? true
 *    catDog("catxdogxdogxca") ? false
 *    catDog("dogdogcat") ? false
 *    catDog("dogogcat") ? true
 *    catDog("dog") ? false
 *    catDog("cat") ? false
 *    catDog("ca") ? true
 *    catDog("c") ? true
 *    catDog("") ? true
 *    other tests
 */
public class CatDog {
  public boolean catDog(String str) {
    int catNum = 0;
    int dogNum = 0;
    for (int count = 0; count < str.length() - 2; count++) {
      if (str.substring(count, count + 3).equals("cat")) {
        catNum++;
      }
      if (str.substring(count, count + 3).equals("dog")) {
        dogNum++;
      }
    }
    if (catNum == dogNum) {
      return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
