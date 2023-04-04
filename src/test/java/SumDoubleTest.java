import com.digital.asserts.SumDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTest {
    @Test
    public void sumDoubleTest(){
        Assert.assertEquals(SumDouble.sumDouble(1,2),3);
        Assert.assertEquals(SumDouble.sumDouble(3,2),5);
        Assert.assertEquals(SumDouble.sumDouble(2,2),8);
    }
}
