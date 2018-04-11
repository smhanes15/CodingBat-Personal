/*
 *  Functional-1 --> copies3
 *
 *    Given a list of strings, return a list where each string is replaced by 3 copies of the string
 *    concatenated together.
 *
 *  Tests:
 *    copies3(["a", "bb", "ccc"]) ? ["aaa", "bbbbbb", "ccccccccc"]
 *    copies3(["24", "a", ""]) ? ["242424", "aaa", ""]
 *    copies3(["hello", "there"]) ? ["hellohellohello", "theretherethere"]
 *    copies3(["no"]) ? ["nonono"]
 *    copies3([]) ? []
 *    copies3(["this", "and", "that", "and"]) ? ["thisthisthis", "andandand", "thatthatthat", "andandand"]
 *    other tests
 */
public class Copies3 {
  public List<String> copies3(List<String> strings) {
    strings.replaceAll(s -> s + s + s);
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
