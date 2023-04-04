import com.digital.asserts.Makes10;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Makes10Test {
    @Test
    public void makes(){
        Assert.assertEquals(Makes10.makes10(9,10),true);
        Assert.assertEquals(Makes10.makes10(9,9),false);
        Assert.assertEquals(Makes10.makes10(1,9),true);
    }
}
