package lindsay.devon.Calculator2;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by devon on 10/2/16.
 */
public class CalculatorTest {

    @Test
    public void addTest() {
    Calculator cal = new Calculator();
    int expected = 4;
    int actual = cal.add(2,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest() {
        Calculator cal = new Calculator();
        int expected = 2;
        int actual = cal.subtract(4,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest() {
        Calculator cal = new Calculator();
        int expected = 4;
        int actual = cal.multiply(2,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void divideTest() throws Exception {
        Calculator cal = new Calculator();
        int expected = 2;
        int actual = cal.divide(4,2);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = DivisionByZeroException.class)
    public void divideByZeroTest() throws DivisionByZeroException {
        Calculator cal = new Calculator();
        int actual = cal.divide(4,0);
    }

    @Test
    public void squareRootTest() throws ComplexNumberException {
        Calculator cal = new Calculator();
        double expected = 2.0;
        try {
        double actual = cal.squareRoot(4);
            Assert.assertEquals("This should be 2",expected,actual,1);
        } catch (ComplexNumberException e) {
            System.out.println("A negative number cannot have a square root");
        }

    }

    @Test(expected = ComplexNumberException.class)
    public void squareRootComplexTest() throws ComplexNumberException {
        Calculator cal = new Calculator();
        double expected = 2.0;
        double actual = cal.squareRoot(-4);
        Assert.assertEquals("This should be 2",expected,actual,1);


    }

}
