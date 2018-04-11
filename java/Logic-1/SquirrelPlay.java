/*
 *  Logic-1 --> squirrelPlay
 *
 *    The squirrels in Palo Alto spend most of the day playing. In particular, they play if the
 *    temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100
 *    instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play
 *    and false otherwise.
 *
 *  Tests:
 *    squirrelPlay(70, false) ? true
 *    squirrelPlay(95, false) ? false
 *    squirrelPlay(95, true) ? true
 *    squirrelPlay(90, false) ? true
 *    squirrelPlay(90, true) ? true
 *    squirrelPlay(50, false) ? false
 *    squirrelPlay(50, true) ? false
 *    squirrelPlay(100, false) ? false
 *    squirrelPlay(100, true) ? true
 *    squirrelPlay(105, true) ? false
 *    squirrelPlay(59, false) ? false
 *    squirrelPlay(59, true) ? false
 *    squirrelPlay(60, false) ? true
 *    other tests
 */
public class SquirrelPlay {
  public boolean squirrelPlay(int temp, boolean isSummer) {
    if (temp > 59) {
      if (isSummer) {
        if (temp < 101) return true;
      }
      if (temp < 91) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
