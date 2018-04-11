/*
 *  Array-2 --> sameEnds
 *
 *    Return true if the group of N numbers at the start and end of the array are the same. For example,
 *    with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You
 *    may assume that n is in the range 0..nums.length inclusive.
 *
 *  Tests:
 *    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) ? false
 *    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) ? true
 *    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) ? false
 *    sameEnds([1, 2, 5, 2, 1], 1) ? true
 *    sameEnds([1, 2, 5, 2, 1], 2) ? false
 *    sameEnds([1, 2, 5, 2, 1], 0) ? true
 *    sameEnds([1, 2, 5, 2, 1], 5) ? true
 *    sameEnds([1, 1, 1], 0) ? true
 *    sameEnds([1, 1, 1], 1) ? true
 *    sameEnds([1, 1, 1], 2) ? true
 *    sameEnds([1, 1, 1], 3) ? true
 *    sameEnds([1], 1) ? true
 *    sameEnds([], 0) ? true
 *    sameEnds([4, 2, 4, 5], 1) ? false
 *    other tests
 */
public class SameEnds {
  public boolean sameEnds(int[] nums, int len) {
    for (int x = 0; x < len; x++) {
      if (nums[x] != nums[(nums.length - len) + x]) return false;
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
