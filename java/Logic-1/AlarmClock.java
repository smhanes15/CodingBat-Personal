/*
 *  Logic-1 --> alarmClock
 *
 *    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
 *    on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
 *    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on
 *    vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
 *
 *  Tests:
 *    alarmClock(1, false) ? "7:00"
 *    alarmClock(5, false) ? "7:00"
 *    alarmClock(0, false) ? "10:00"
 *    alarmClock(6, false) ? "10:00"
 *    alarmClock(0, true) ? "off"
 *    alarmClock(6, true) ? "off"
 *    alarmClock(1, true) ? "10:00"
 *    alarmClock(3, true) ? "10:00"
 *    alarmClock(5, true) ? "10:00"
 *    other tests
 */
public class AlarmClock {
  public String alarmClock(int day, boolean vacation) {
    if ((day == 0 || day == 6) && vacation) return "off";
    if ((day != 0 && day != 6) && vacation) return "10:00";
    if (day == 0 || day == 6) return "10:00";
    return "7:00";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
