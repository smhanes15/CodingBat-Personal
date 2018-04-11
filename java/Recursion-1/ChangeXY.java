/*
 *  Recursion-1 --> changeXY
 *
 *    Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have
 *    been changed to 'y' chars.
 *
 *  Tests:
 *    changeXY("codex") ? "codey"
 *    changeXY("xxhixx") ? "yyhiyy"
 *    changeXY("xhixhix") ? "yhiyhiy"
 *    changeXY("hiy") ? "hiy"
 *    changeXY("h") ? "h"
 *    changeXY("x") ? "y"
 *    changeXY("") ? ""
 *    changeXY("xxx") ? "yyy"
 *    changeXY("yyhxyi") ? "yyhyyi"
 *    changeXY("hihi") ? "hihi"
 *    other tests
 */
public class ChangeXY {
  public String changeXY(String str) {
    if (str.indexOf('x') > -1) {
      return changeXY(
          str.substring(0, str.indexOf('x')) + "y" + str.substring(str.indexOf('x') + 1));
    }
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
