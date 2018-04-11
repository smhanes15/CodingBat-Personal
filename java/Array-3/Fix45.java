/*
 *  Array-3 --> fix45
 *
 *    (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the
 *    same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do
 *    not move the 4's, but every other number may move. The array contains the same number of 4's and
 *    5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in
 *    the original array.
 *
 *  Tests:
 *    fix45([5, 4, 9, 4, 9, 5]) ? [9, 4, 5, 4, 5, 9]
 *    fix45([1, 4, 1, 5]) ? [1, 4, 5, 1]
 *    fix45([1, 4, 1, 5, 5, 4, 1]) ? [1, 4, 5, 1, 1, 4, 5]
 *    fix45([4, 9, 4, 9, 5, 5, 4, 9, 5]) ? [4, 5, 4, 5, 9, 9, 4, 5, 9]
 *    fix45([5, 5, 4, 1, 4, 1]) ? [1, 1, 4, 5, 4, 5]
 *    fix45([4, 2, 2, 5]) ? [4, 5, 2, 2]
 *    fix45([4, 2, 4, 2, 5, 5]) ? [4, 5, 4, 5, 2, 2]
 *    fix45([4, 2, 4, 5, 5]) ? [4, 5, 4, 5, 2]
 *    fix45([1, 1, 1]) ? [1, 1, 1]
 *    fix45([4, 5]) ? [4, 5]
 *    fix45([5, 4, 1]) ? [1, 4, 5]
 *    fix45([]) ? []
 *    fix45([5, 4, 5, 4, 1]) ? [1, 4, 5, 4, 5]
 *    fix45([4, 5, 4, 1, 5]) ? [4, 5, 4, 5, 1]
 *    fix45([3, 4, 5]) ? [3, 4, 5]
 *    fix45([4, 1, 5]) ? [4, 5, 1]
 *    fix45([5, 4, 1]) ? [1, 4, 5]
 *    fix45([2, 4, 2, 5]) ? [2, 4, 5, 2]
 *    other tests
 */
public class Fix45 {
  public int[] fix45(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 5 && x == 0 || nums[x] == 5 && nums[x - 1] != 4) {
        int pos = x;
        for (int y = 0; y < nums.length; y++) {
          if (nums[y] == 4 && nums[y + 1] != 5) {
            int temp = nums[y + 1];
            nums[y + 1] = 5;
            nums[pos] = temp;
            y = nums.length;
          }
        }
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
