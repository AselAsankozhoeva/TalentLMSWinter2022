import com.digital.asserts.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParrotTroubleTest {
    @Test
    public void parrot(){
        Assert.assertEquals(ParrotTrouble.parrotTrouble(true,6), true);
        Assert.assertEquals(ParrotTrouble.parrotTrouble(true,7), false);
        Assert.assertEquals(ParrotTrouble.parrotTrouble(false,6), false);
    }
}
