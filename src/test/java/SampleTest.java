import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTest {

    @BeforeClass
    public void demoBeforeClass() {
        System.out.println("Demo BeforeClass");
    }

    @BeforeMethod
    public void demoBefore() {
        System.out.println("Demo Before");
    }

    @Test(groups = "groups 1")
    public void demoTest1() {
        System.out.println("Demo Test1");
    }

    @Test(groups = "groups 1")
    public void demoTest2() {
        System.out.println("Demo Test2");
        Assert.assertEquals("100", "101");
    }

    @AfterMethod
    public void demoAfter() {
        System.out.println("Demo After");
    }

    @AfterClass
    public void demoAfterClass() {
        System.out.println("Demo After Class");
    }

    @BeforeTest
    public void demoBeforeTest() {
        System.out.println("Demo Before Test");
    }

    @AfterTest
    public void demoAfterTest() {
        System.out.println("Demo After Test");
    }

    @BeforeSuite
    public void demoBeforeSuite() {
        System.out.println("Demo Before Suite");
    }

    @AfterSuite
    public void demoAfterSuite() {
        System.out.println("Demo After Suite");
    }

    @BeforeGroups(groups = "groups 1")
    public void demoBeforeGroup() {
        System.out.println("Demo Before Group");
    }

    @AfterGroups(groups = "group 1")
    public void demoAfterGroup() {
        System.out.println("Demo After Group");
    }

    @BeforeGroups(groups = "groups 2")
    public void demoBeforeGroup2() {
        System.out.println("Demo Before Group2");
    }

    @AfterGroups(groups = "group 2")
    public void demoAfterGroup2() {
        System.out.println("Demo After Group2");
    }
}
