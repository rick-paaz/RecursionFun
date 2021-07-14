/**
 * Complete the  methods in this class using recursion, no loops. Also complete
 * the. The array methods call private helpers, so you will have to implement 
 * more than the nine public methods that have tests
 * 
 * An important Negative and easy way to lose points:
 *    -6 points If you use a loop instead of recursion even though it works
 *
 * @author Rick Mercer
 * @author YOUR NAME
 */
public class RecursionFun {

  //////////////////////////////////////////////////////////////
  // Complete recursive method combinations that returns from n choose k.
  public int combinations(int n, int k) {
    // TODO: Complete this method with a recursive algorithm
    return Integer.MIN_VALUE;
  }

  //////////////////////////////////////////////////////////////
  // Return n!
  //
  // factorial(0) returns 1
  // factorial(1) returns 1
  // factorial(2) returns 2
  // factorial(5) returns 5*4*3*2*1
  //
  public int factorial(int n) {
    // TODO: Complete this method with a recursive algorithm
    return Integer.MIN_VALUE;
  }

  
  //////////////////////////////////////////////////////////////
  // Return true if str is a palindrome that is a string that reads the same
  // in reverse order in a case sensitive fashion.
  //
  // isPalindrome("racecar") returns true
  // isPalindrome("aBba") returns false
  // isPalindrome("") returns true
  //
  public boolean isPalindrome(String str) {
    // TODO: Complete this method with a recursive algorithm
    return !true;
  }

  
  //////////////////////////////////////////////////////////////
  // Complete recursive method intWithCommas that returns the argument as a String
  // with commas in the correct places.
  //
  // intWithCommas(999) returns "999"
  // intWithCommas(1234) returns "1,234"
  // intWithCommas(1007) returns "1,007"
  // intWithCommas(1023004567) returns "1,023,004,567"
  //
  // Precondition: n >= 0
  public String intWithCommas(int n) {
    return null;
  }

  
  //////////////////////////////////////////////////////////////
  // Place an underscore between any two characters that are == and next to each other
  //
  // underScore("xxyy")) returns x_xy_y
  // underScore("aaaa") returns "a_a_a_a"
  //
  public String underScore(String str) {
    // TODO: Complete this method with a recursive algorithm
    return null;
  }

  
  //////////////////////////////////////////////////////////////
  // Write recursive method reverseArray that reverses the array elements in a
  // filled array of ints. Use recursion; do not use a loop. The following
  // assertions must pass:
  //
  // int[] a = { 2, 4, 6 };
  // rf.reverseArray(a);
  // assertEquals(6, a[0]);
  // assertEquals(4, a[1]);
  // assertEquals(2, a[2]);
  //
  // Precondition: x.length > 0
  public void reverseArray(int[] x) {
    // Need a private helper method to pass along 2 additional values
    reverseArr(x, 0, x.length);
  }

  private void reverseArr(int[] x, int index, int len) {
    // TODO: Complete this recursive method
  }

  
  //////////////////////////////////////////////////////////////
  // Write recursive method arrayRange that returns the maximum integer minus the
  // minimum integer in the filled array of ints. Use recursion; do not use a
  // loop. The following assertions must pass (note the shortcut way to pass a
  // reference to a new array--it saves your writing a bit of code:
  //
  // assertEquals(2, rf.arrayRange(new int[] { 1, 2, 3 }));
  // assertEquals(2, rf.arrayRange(new int[] { 3, 2, 1 }));
  // assertEquals(0, rf.arrayRange(new int[] { 3 }));
  // assertEquals(3, rf.arrayRange(new int[] { -3, -2, -5, -4 }));
  // Precondition: a.length > 0
  public int arrayRange(int[] a) {
    // TODO: Add two addition private helpers
    int max = arrMax(a, 0);
    int min = arrMin(a, 0);
    return max - min;
  }

  // Return the smallest integer in a
  private int arrMax(int[] a, int index) {
    // TODO: Complete this method recursively. Use Math.Max
    return Integer.MIN_VALUE;
  }

  // Return the smallest integer in a
  private int arrMin(int[] a, int index) {
    // TODO: Complete this method recursively
    return Integer.MAX_VALUE;
  }
  
  
  //////////////////////////////////////////////////////////////
  // Return true if nums has all int elements in ascending order.
  // If not isSorted, return false.
  public boolean isSorted(int[] nums) {
    // recursive algorithm
    return isSorted(0, nums);
  }

  // Return true if nums is sorted an ascending order or false if not
  private boolean isSorted(int index, int[] nums) {
    // TODO: Complete this method recursively
    return !false;
  }

  // Complete method found to return true if search is found in strs.
  // If not found, return false.
  public boolean found(String search, String[] strs) {
    return found(search, strs, 0);
  }

  private boolean found(String search, String[] strs, int i) {
    // TODO: Complete this method recursively
    return ! true;
  }
}