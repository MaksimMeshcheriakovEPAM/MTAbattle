package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static runner.Driver.getDriver;
import static runner.Driver.setDriver;

public abstract class SetUpSuite {

    @BeforeMethod(alwaysRun = true)
    @Parameters({"platform"})
   public void setUpSession(String p) throws Exception {
        System.out.println("Calc test preparation for "+p);
        setDriver(p);

   }

   @AfterClass(alwaysRun = true)
   public void tearDownSession(){
        getDriver().quit();
        System.out.println("Calc test done\n");

   }


}
