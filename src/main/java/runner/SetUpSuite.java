package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class SetUpSuite {

    @BeforeMethod(alwaysRun = true)
    @Parameters({"platform"})
   public void setUpSession(String p){
        System.out.println("Test preparation for "+p);

   }

   @AfterClass(alwaysRun = true)
   public void tearDownSession(){
        System.out.println("Test done\n");

   }


}
