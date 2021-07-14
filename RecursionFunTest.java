// A unit test for RecursionFun 
import static org.junit.Assert.*;
import org.junit.Test;

public class RecursionFunTest {

  private RecursionFun rf = new RecursionFun();

  @Test
  public void testCombinations() {
    // n choices when choosing only 1
    assertEquals(1, rf.combinations(1, 1));
    assertEquals(5, rf.combinations(5, 1));
    assertEquals(178, rf.combinations(178, 1));

    // 1 choice when n==k
    assertEquals(1, rf.combinations(5, 5));
    assertEquals(1, rf.combinations(178, 178));

    // some simple ones
    assertEquals(4, rf.combinations(4, 3));
    assertEquals(3, rf.combinations(3, 2));
    assertEquals(6, rf.combinations(4, 2));
    assertEquals(10, rf.combinations(5, 2));

    // There are 2,598,960 possible poker hands:
    assertEquals(2598960, rf.combinations(52, 5));
  }


  @Test
  public void testFactorial() {
    assertEquals(1, rf.factorial(0));
    assertEquals(1, rf.factorial(1));
    assertEquals(2, rf.factorial(2));
    assertEquals(6, rf.factorial(3));
    assertEquals(24, rf.factorial(4));
  }
  
  @Test
  public void testIsPalindrome() {
    assertTrue(rf.isPalindrome("racecar"));
    assertTrue(rf.isPalindrome(""));
    assertTrue(rf.isPalindrome("!"));
    assertTrue(rf.isPalindrome("abba"));
    assertFalse(rf.isPalindrome("aBba"));
    assertFalse(rf.isPalindrome("123"));
  }
  
   @Test
  public void testIntwithcommas() {
    assertEquals("9", rf.intWithCommas(9));
    assertEquals("123", rf.intWithCommas(123));
    assertEquals("1,234", rf.intWithCommas(1234));
    assertEquals("2,147,483,647", rf.intWithCommas(Integer.MAX_VALUE));
    assertEquals("1,007", rf.intWithCommas(1007));
    assertEquals("1,027", rf.intWithCommas(1027));
    assertEquals("1,000", rf.intWithCommas(1000));
    assertEquals("1,023,004,567", rf.intWithCommas(1023004567));
  }


  @Test
  public void testUnderscore() {
    assertEquals("", rf.underScore(""));
    assertEquals("t", rf.underScore("t"));
    assertEquals("tr", rf.underScore("tr"));
    assertEquals("hel_lo", rf.underScore("hello"));
    assertEquals("x_xy_y", rf.underScore("xxyy"));
    assertEquals("a_a_a_a", rf.underScore("aaaa"));
  }

  @Test
  public void testReverseWithLengthThree() {
    int[] a = { 2, 4, 6 };
    rf.reverseArray(a);
    assertEquals(6, a[0]);
    assertEquals(4, a[1]);
    assertEquals(2, a[2]);
    rf.reverseArray(a);
    assertEquals(2, a[0]);
    assertEquals(4, a[1]);
    assertEquals(6, a[2]);
  }

  @Test
  public void testReverse() {
    int[] b = { 2 };
    rf.reverseArray(b);
    assertEquals(2, b[0]);
    rf.reverseArray(b);
    assertEquals(2, b[0]);
    
    int[] a = { 2, 4, 6, 8 };
    rf.reverseArray(a);
    assertEquals(8, a[0]);
    assertEquals(6, a[1]);
    assertEquals(4, a[2]);
    assertEquals(2, a[3]);
    rf.reverseArray(a);
    assertEquals(2, a[0]);
    assertEquals(4, a[1]);
    assertEquals(6, a[2]);
    assertEquals(8, a[3]);
  }

  @Test
  public void testArrayrange() {
    assertEquals(2, rf.arrayRange(new int[] { 1, 2, 3 }));
    assertEquals(2, rf.arrayRange(new int[] { 3, 2, 1 }));
    assertEquals(0, rf.arrayRange(new int[] { 3 }));
    assertEquals(3, rf.arrayRange(new int[] { -3, -2, -5, -4 }));
  }

  @Test
  public void testIsSorted() {
    assertTrue(rf.isSorted(new int[] { 1, 2, 3 }));
    assertTrue(rf.isSorted(new int[] { 2, 2, 2 }));
    assertTrue(rf.isSorted(new int[] { 1 }));
    assertTrue(rf.isSorted(new int[] {}));
    assertFalse(rf.isSorted(new int[] { 2, 1 }));
    assertFalse(rf.isSorted(new int[] { 2, 3, 4, 5, 4 }));
  }

  @Test
  public void testFound() {
    String[] strs = { "Bbb", "Ccc", "Fff", "Ddd", "Hhh", "Aaa" };
    assertTrue(rf.found("Bbb", strs));
    assertTrue(rf.found("Aaa", strs));
    assertTrue(rf.found("Hhh", strs));
    assertFalse(rf.found("Not Here", strs));
  }

}
