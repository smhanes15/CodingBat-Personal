/*
 *  Warmup-1 --> sleepIn
 *
 *    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on
 *    vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 *
 *  Tests:
 *    sleepIn(false, false) ? true
 *    sleepIn(true, false) ? false
 *    sleepIn(false, true) ? true
 *    sleepIn(true, true) ? true
 */
public class SleepIn {
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return (!weekday || vacation);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
