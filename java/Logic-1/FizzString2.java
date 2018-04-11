/*
 *  Logic-1 --> fizzString2
 *
 *    Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
 *    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is
 *    divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod"
 *    operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when
 *    one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
 *
 *  Tests:
 *    fizzString2(1) ? "1!"
 *    fizzString2(2) ? "2!"
 *    fizzString2(3) ? "Fizz!"
 *    fizzString2(4) ? "4!"
 *    fizzString2(5) ? "Buzz!"
 *    fizzString2(6) ? "Fizz!"
 *    fizzString2(7) ? "7!"
 *    fizzString2(8) ? "8!"
 *    fizzString2(9) ? "Fizz!"
 *    fizzString2(15) ? "FizzBuzz!"
 *    fizzString2(16) ? "16!"
 *    fizzString2(18) ? "Fizz!"
 *    fizzString2(19) ? "19!"
 *    fizzString2(21) ? "Fizz!"
 *    fizzString2(44) ? "44!"
 *    fizzString2(45) ? "FizzBuzz!"
 *    fizzString2(100) ? "Buzz!"
 *    other tests
 */
public class FizzString2 {
  public String fizzString2(int n) {
    boolean div3 = (n % 3 == 0) ? true : false;
    boolean div5 = (n % 5 == 00) ? true : false;
    if (div3 && div5) return "FizzBuzz!";
    if (div3) return "Fizz!";
    if (div5) return "Buzz!";
    return n + "!";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
