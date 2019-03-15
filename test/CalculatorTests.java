import calculator.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTests {
    
    @Test
    public void checkAddition() {
        Calculator calculator = new Calculator();
        
        double result;
        
        result = calculator.add(100, 200);
        assertEquals(300, result, 0.00001);
        
        result = calculator.add(100, -200);
        assertEquals(-100, result, 0.00001);
        
        result = calculator.add(-100, -200);
        assertEquals(-300, result, 0.00001);
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        
        double result;
        
        result = calculator.multiply(100, 200);
        assertEquals(20000, result, 0.00001);
        
        result = calculator.multiply(100, 0);
        assertEquals(0, result, 0.00001);
        
        result = calculator.multiply(5, -6);
        assertEquals(-30, result, 0.00001);
        
        result = calculator.multiply(-5, -6);
        assertEquals(30, result, 0.00001);
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        
        double result;
        
        result = calculator.divide(10, 2);
        assertEquals(5, result, 0.00001);
        
        result = calculator.divide(-10, 2);
        assertEquals(-5, result, 0.00001);
        
        result = calculator.divide(10, -2);
        assertEquals(-5, result, 0.00001);
        
        result = calculator.divide(-10, -2);
        assertEquals(5, result, 0.00001);
        
        result = calculator.divide(0, 2);
        assertEquals(0, result, 0.00001);
       
        result = calculator.divide(10, 0);
        if(Double.isInfinite(result)) {
            assertTrue(true);
        } else {
            fail();
        }
    }
}
