import com.digital.asserts.SleepIn1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleepInTest {
    @Test
    public void sleepInTest(){
       Assert.assertEquals(SleepIn1.sleep(false, false), true);
       Assert.assertEquals(SleepIn1.sleep(true, false), false);
        Assert.assertEquals(SleepIn1.sleep(false, true), true);
    }
}
