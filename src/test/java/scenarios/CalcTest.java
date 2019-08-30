package scenarios;

import org.testng.annotations.Test;
import runner.SetUpSuite;

public class CalcTest extends SetUpSuite {

    @Test(groups = {"Android","iOS"})
    public void firstTest(){
        System.out.println("Test itself");
    }

}
