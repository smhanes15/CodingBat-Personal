/*
 *  Functional-1 --> addStar
 *
 *    Given a list of strings, return a list where each string has "*" added at its end.
 *
 *  Tests:
 *    addStar(["a", "bb", "ccc"]) ? ["a*", "bb*", "ccc*"]
 *    addStar(["hello", "there"]) ? ["hello*", "there*"]
 *    addStar(["*"]) ? ["**"]
 *    addStar([]) ? []
 *    addStar(["kittens", "and", "chocolate", "and"]) ? ["kittens*", "and*", "chocolate*", "and*"]
 *    addStar(["empty", "string", ""]) ? ["empty*", "string*", "*"]
 *    other tests
 */
public class AddStar {
  public List<String> addStar(List<String> strings) {
    strings.replaceAll(s -> s + "*");
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
