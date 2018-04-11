/*
 *  Array-2 --> evenOdd
 *
 *    Return an array that contains the exact same numbers as the given array, but rearranged so that all
 *    the even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
 *    You may modify and return the given array, or make a new array.
 *
 *  Tests:
 *    evenOdd([1, 0, 1, 0, 0, 1, 1]) ? [0, 0, 0, 1, 1, 1, 1]
 *    evenOdd([3, 3, 2]) ? [2, 3, 3]
 *    evenOdd([2, 2, 2]) ? [2, 2, 2]
 *    evenOdd([3, 2, 2]) ? [2, 2, 3]
 *    evenOdd([1, 1, 0, 1, 0]) ? [0, 0, 1, 1, 1]
 *    evenOdd([1]) ? [1]
 *    evenOdd([1, 2]) ? [2, 1]
 *    evenOdd([2, 1]) ? [2, 1]
 *    evenOdd([]) ? []
 *    other tests
 */
public class EvenOdd {
  public int[] evenOdd(int[] nums) {
    int[] newNums = new int[nums.length];
    int odd = nums.length - 1;
    int even = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] % 2 == 0) {
        newNums[even] = nums[x];
        even++;
      } else {
        newNums[odd] = nums[x];
        odd--;
      }
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
