/*
 *  Logic-1 --> fizzString
 *
 *    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return
 *    "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return
 *    the string unchanged. (See also: FizzBuzz Code)
 *
 *  Tests:
 *    fizzString("fig") ? "Fizz"
 *    fizzString("dib") ? "Buzz"
 *    fizzString("fib") ? "FizzBuzz"
 *    fizzString("abc") ? "abc"
 *    fizzString("fooo") ? "Fizz"
 *    fizzString("booo") ? "booo"
 *    fizzString("ooob") ? "Buzz"
 *    fizzString("fooob") ? "FizzBuzz"
 *    fizzString("f") ? "Fizz"
 *    fizzString("b") ? "Buzz"
 *    fizzString("abcb") ? "Buzz"
 *    fizzString("Hello") ? "Hello"
 *    fizzString("Hellob") ? "Buzz"
 *    fizzString("af") ? "af"
 *    fizzString("bf") ? "bf"
 *    fizzString("fb") ? "FizzBuzz"
 *    other tests
 */
public class FizzString {
  public String fizzString(String str) {
    boolean fizz = str.startsWith("f");
    boolean buzz = str.endsWith("b");
    if (fizz && buzz) return "FizzBuzz";
    if (fizz) return "Fizz";
    if (buzz) return "Buzz";
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
