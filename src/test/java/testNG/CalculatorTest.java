package testNG;

import com.digital.asserts.Calculator;
import com.digital.asserts.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.*;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void addTwoNumbersTest(){
        Assert.assertEquals(Calculator.add(2,2),4);
        Assert.assertEquals(Calculator.add(2,2),3);
        Assert.assertEquals(Calculator.add(2,2),5);
        Assert.assertEquals(Calculator.add(2,2),5);
        Assert.assertEquals(Calculator.add(2,2),5);
    }

    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2),4);
        softAssert.assertEquals(Calculator.add(2,2),5);
        softAssert.assertEquals(Calculator.add(2,2),6);
        softAssert.assertEquals(Calculator.add(2,2),7);
        softAssert.assertEquals(Calculator.add(2,2),8);
        softAssert.assertAll();
    }

    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);
    }

    @Test
    public void test123(){
        assertNotNull(null);
    }
}
