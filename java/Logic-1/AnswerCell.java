/*
 *  Logic-1 --> answerCell
 *
 *    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the
 *    morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not
 *    answer.
 *
 *  Tests:
 *    answerCell(false, false, false) ? true
 *    answerCell(false, false, true) ? false
 *    answerCell(true, false, false) ? false
 *    answerCell(true, true, false) ? true
 *    answerCell(false, true, false) ? true
 *    answerCell(true, true, true) ? false
 *    other tests
 */
public class AnswerCell {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) return false;
    if (isMom) return true;
    if (!isMorning) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
