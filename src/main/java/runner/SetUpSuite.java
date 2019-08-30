package runner;

import org.testng.annotations.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class SetUpSuite {

    @BeforeMethod(alwaysRun = true)
   public void setUpSession(Method m){
        Test t = m.getAnnotation(Test.class);
        for (int i = 0; i < t.groups().length; i++) {
            System.out.println(t.groups()[i]);
        }

   }

   @AfterClass(alwaysRun = true)
   public void tearDownSession(){
        System.out.println("Test done");

   }


}
