package scenarios;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import runner.SetUpSuite;

import java.lang.reflect.Method;

public class CalcTest extends SetUpSuite {

    @Test
    @Parameters({"platform"})
    public void firstTest(String p){

        System.out.println("Test itself for "+p);
    }

}
