/*
 *  String-1 --> endsLy
 *
 *    Given a string, return true if it ends in "ly".
 *
 *  Tests:
 *    endsLy("oddly") ? true
 *    endsLy("y") ? false
 *    endsLy("oddy") ? false
 *    endsLy("oddl") ? false
 *    endsLy("olydd") ? false
 *    endsLy("ly") ? true
 *    endsLy("") ? false
 *    endsLy("falsey") ? false
 *    endsLy("evenly") ? true
 *    other tests
 */
public class EndsLy {
  public boolean endsLy(String str) {
    return (str.indexOf("ly") == str.length() - 2) && str.length() > 1;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
