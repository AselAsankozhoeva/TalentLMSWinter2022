import com.digital.asserts.Diff21;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Diff21Test {
    @Test
    public void diff21(){
        Assert.assertEquals(Diff21.diff21(19),2);
        Assert.assertEquals(Diff21.diff21(10),11);
        Assert.assertEquals(Diff21.diff21(21),0);
    }
}
