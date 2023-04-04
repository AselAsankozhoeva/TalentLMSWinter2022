import com.digital.asserts.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonkeyTroubleTest {
    @Test
    public void monkeyTroubleTest(){
        Assert.assertEquals(MonkeyTrouble.monkeyTrouble(true, true), true);
        Assert.assertEquals(MonkeyTrouble.monkeyTrouble(false, false), true);
        Assert.assertEquals(MonkeyTrouble.monkeyTrouble(true, false), false);
    }
}
