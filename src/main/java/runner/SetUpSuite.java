package runner;


import org.testng.annotations.*;

public class SetUpSuite {

    @BeforeClass(groups = {"Android, iOS"}, alwaysRun = true)
   public void setUpSession(ITestAnnotation annotation){
        System.out.println("Group Name is --" + annotation.getGroups()) ;

   }

   public void tearDownSession(){
        System.out.println("Test done");

   }


}
