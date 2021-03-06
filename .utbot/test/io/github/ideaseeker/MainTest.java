package io.github.ideaseeker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    ///region Test suites for executable io.github.ideaseeker.Main.isSorted
    
    ///region SUCCESSFUL EXECUTIONS for method isSorted(int[])
    
    /**
    <pre>
    Test does not iterate {@code for(int i = 0; i < array.length; ++i) }, returns from: {@code return true; }
 * </pre>
     */
    @Test
    @DisplayName("isSorted: -> return true")
    public void testIsSorted_ReturnTrue() {
        Main main = new Main();
        int[] intArray = {};
        
        boolean actual = main.isSorted(intArray);
        
        assertTrue(actual);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < array.length; ++i) } once,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): True }
 * returns from: {@code return false; }</pre>
     */
    @Test
    @DisplayName("isSorted: array[i] > array[i + 1] : True -> return false")
    public void testIsSorted_IOfArrayGreaterThanI1OfArray() {
        Main main = new Main();
        int[] intArray = {
            -253, -254, -255, -255, -255, -255, -255, -255,
            -255
        };
        
        boolean actual = main.isSorted(intArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method isSorted(int[])
    
    /**
    <pre>
    Test 
 * throws NullPointerException in: for(int i = 0; i < array.length; ++i)
 * </pre>
     */
    @Test
    @DisplayName("isSorted: for(int i = 0 i < array.length ++i) -> ThrowNullPointerException")
    public void testIsSorted_ThrowNullPointerException() {
        Main main = new Main();
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.isSorted
        produces Runtime exception java.lang.NullPointerException */
        main.isSorted(null);
    }
    
    /**
    <pre>
    Test iterates the loop {@code for(int i = 0; i < array.length; ++i) } twice,
 *     inside this loop, the test executes conditions:
 *     {@code (array[i] > array[i + 1]): False }
 * Test throws ArrayIndexOutOfBoundsException in: array[i] > array[i + 1]
 * </pre>
     */
    @Test
    @DisplayName("isSorted: array[i] > array[i + 1] -> ThrowArrayIndexOutOfBoundsException")
    public void testIsSorted_IOfArrayLessOrEqualI1OfArray() {
        Main main = new Main();
        int[] intArray = {-244, -244};
        
        /* This test fails because executable under testing io.github.ideaseeker.Main.isSorted
        produces Runtime exception java.lang.ArrayIndexOutOfBoundsException: 2 */
        main.isSorted(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.Main.multiply
    
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
    public void testMultiply_MathMultiplyExact() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        Class mainClazz = Class.forName("io.github.ideaseeker.Main");
        Class intType = int.class;
        Method multiplyMethod = mainClazz.getDeclaredMethod("multiply", intType, intType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[2];
        multiplyMethodArguments[0] = 0;
        multiplyMethodArguments[1] = 0;
        int actual = ((Integer) multiplyMethod.invoke(null, multiplyMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable io.github.ideaseeker.Main.square
    
    ///region SUCCESSFUL EXECUTIONS for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Main::multiply once
 * returns from: {@code return multiply(number, number); }
 * </pre>
     */
    @Test
    @DisplayName("square: MainMultiply -> return multiply(number, number)")
    public void testSquare_MainMultiply() {
        int actual = Main.square(-256);
        
        assertEquals(65536, actual);
    }
    ///endregion
    
    ///region ERROR SUITE for method square(int)
    
    /**
    <pre>
    Test invokes:
 *     Main::multiply once
 * 
 * throws ArithmeticException in: return multiply(number, number);
 * </pre>
     */
    @Test
    @DisplayName("square: return multiply(number, number) : True -> ThrowArithmeticException")
    public void testSquare_MainMultiply_1() {
        /* This test fails because executable under testing io.github.ideaseeker.Main.square
        produces Runtime exception java.lang.ArithmeticException: integer overflow */
        Main.square(2099406);
    }
    ///endregion
    
    ///endregion
    
}
