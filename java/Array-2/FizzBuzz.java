/*
 *  Array-2 --> fizzBuzz
 *
 *    This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a
 *    first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers
 *    beginning at start and running up to but not including end, so for example start=1 and end=5 gives
 *    the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
 *    except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for
 *    multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of
 *    an int or other type. This version is a little more complicated than the usual version since you
 *    have to allocate and index into an array instead of just printing, and we vary the start/end instead
 *    of just always doing 1..100.
 *
 *  Tests:
 *    fizzBuzz(1, 6) ? ["1", "2", "Fizz", "4", "Buzz"]
 *    fizzBuzz(1, 8) ? ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
 *    fizzBuzz(1, 11) ? ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 *    fizzBuzz(1, 16) ? ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
 *    fizzBuzz(1, 4) ? ["1", "2", "Fizz"]
 *    fizzBuzz(1, 2) ? ["1"]
 *    fizzBuzz(50, 56) ? ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]
 *    fizzBuzz(15, 17) ? ["FizzBuzz", "16"]
 *    fizzBuzz(30, 36) ? ["FizzBuzz", "31", "32", "Fizz", "34", "Buzz"]
 *    fizzBuzz(1000, 1006) ? ["Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"]
 *    fizzBuzz(99, 102) ? ["Fizz", "Buzz", "101"]
 *    fizzBuzz(14, 20) ? ["14", "FizzBuzz", "16", "17", "Fizz", "19"]
 *    other tests
 */
public class FizzBuzz {
  public String[] fizzBuzz(int start, int end) {
    String[] nums = new String[end - start];
    for (int x = 0; x < nums.length; x++) {
      nums[x] = Integer.toString(start);
      if (start % 3 == 0) nums[x] = "Fizz";
      if (start % 5 == 0) nums[x] = "Buzz";
      if (start % 5 == 0 && start % 3 == 0) nums[x] = "FizzBuzz";
      start++;
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
