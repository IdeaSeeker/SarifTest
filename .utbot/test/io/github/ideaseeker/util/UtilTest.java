package io.github.ideaseeker.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest {
    ///region Test suites for executable io.github.ideaseeker.util.Util.bubbleSort
    
    ///region SUCCESSFUL EXECUTIONS for method bubbleSort(int[])
    
    /**
    <pre>
    Test does not iterate {@code for(int i = 0; i < bound; ++i) }, returns from: {@code return array; }
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: -> return array")
    public void testBubbleSort_ReturnArray() {
        int[] intArray = {-255};
        
        int[] actual = Util.bubbleSort(intArray);
        
        assertArrayEquals(intArray, actual);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test next does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): True }
 * Test afterwards returns from: {@code return array; }
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: array[i] > array[i + 1] : True -> return array")
    public void testBubbleSort_IOfArrayGreaterThanI1OfArray() {
        int[] intArray = {3, 2};
        
        int[] actual = Util.bubbleSort(intArray);
        
        assertArrayEquals(intArray, actual);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test then does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 * Test next returns from: {@code return array; }
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: array[i] > array[i + 1] : False -> return array")
    public void testBubbleSort_IOfArrayLessOrEqualI1OfArray() {
        int[] intArray = {-250, -250};
        
        int[] actual = Util.bubbleSort(intArray);
        
        assertArrayEquals(intArray, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method bubbleSort(int[])
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: int bound = array.length - 1;
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: bound = array.length - 1 : True -> ThrowNullPointerException")
    public void testBubbleSort_ThrowNullPointerException() {
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.NullPointerException */
        Util.bubbleSort(null);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } once. 
 * Test afterwards does not iterate {@code for(int j = i + 1; j < bound; ++j) }, iterates the loop {@code for(int i = 0; i < bound; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): True }Test 
 * throws ArithmeticException in: int temp = 1 / array[1];
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_ThrowArithmeticException() {
        int[] intArray = {1, 0};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test iterates the loop {@code for(int j = i + 1; j < bound; ++j) } once,
 *         inside this loop, the test executes conditions:
 *     {@code (array[i] > array[j]): True }
 * Test later iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 *     {@code (array[i] > array[i + 1]): True }
 * throws ArithmeticException in: int temp = 1 / array[1];
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_IOfArrayGreaterThanJOfArray() {
        int[] intArray = {0, -255, -1};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);
        
        int finalIntArray0 = intArray[0];
        int finalIntArray1 = intArray[1];
        
        assertEquals(-255, finalIntArray0);
        
        assertEquals(0, finalIntArray1);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test iterates the loop {@code for(int j = i + 1; j < bound; ++j) } once,
 *         inside this loop, the test executes conditions:
 *     {@code (array[i] > array[j]): False }
 * Test later iterates the loop {@code for(int i = 0; i < bound; ++i) } twice,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 *     {@code (array[i] > array[i + 1]): True }
 * throws ArithmeticException in: int temp = 1 / array[1];
 * </pre>
     */
    @Test
    @DisplayName("bubbleSort: temp = 1 / array[1] : True -> ThrowArithmeticException")
    public void testBubbleSort_IOfArrayLessOrEqualJOfArray() {
        int[] intArray = {0, 0, -1};
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.bubbleSort
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        Util.bubbleSort(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.util.Util.multiply
    
    ///region SUCCESSFUL EXECUTIONS for method multiply(int, int)
    
    /**
    <pre>
    Test invokes:
 *     Math::multiplyExact once
 * returns from: {@code return Math.multiplyExact(x, y); }
 * </pre>
     */
    @Test
    @DisplayName("multiply: MathMultiplyExact -> return Math.multiplyExact(x, y)")
    public void testMultiply_MathMultiplyExact() {
        int actual = Util.multiply(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.util.Util.square
    
    ///region SUCCESSFUL EXECUTIONS for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::multiply once
 * returns from: {@code return multiply(a, a); }
 * </pre>
     */
    @Test
    @DisplayName("square: UtilMultiply -> return multiply(a, a)")
    public void testSquare_UtilMultiply() {
        int actual = Util.square(-256);
        
        assertEquals(65536, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Util::multiply once
 * 
 * throws ArithmeticException in: return multiply(a, a);
 * </pre>
     */
    @Test
    @DisplayName("square: return multiply(a, a) : True -> ThrowArithmeticException")
    public void testSquare_UtilMultiply_1() {
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.square
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Util.square(234925690);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.util.Util.f
    
    ///region SUCCESSFUL EXECUTIONS for method f(int)
    
    /**
    <pre>
    Test returns from: {@code return 1 / a; }
 * </pre>
     */
    @Test
    @DisplayName("f: -> return 1 / a")
    public void testF_Return1DivideA() {
        Util util = new Util();
        
        int actual = util.f(1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method f(int)
    
    /**
    <pre>
    Test 
 * throws ArithmeticException in: return 1 / a;
 * </pre>
     */
    @Test
    @DisplayName("f: return 1 / a : True -> ThrowArithmeticException")
    public void testF_ThrowArithmeticException() {
        Util util = new Util();
        
        /* This test fails because executable under testing io.github.ideaseeker.util.Util.f
        produces Runtime exception java.lang.ArithmeticException: / by zero */
        util.f(0);
    }
    ///endregion
    
    ///endregion
    
}
