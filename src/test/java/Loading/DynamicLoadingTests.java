package Loading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

     @Test
    public void testDynamicLoadingEx1(){
       var example1 = homePage.clickDynamicLoading();
       var ex1Page =  example1.clickExample1();
       ex1Page.clickStartButton();
       assertEquals (ex1Page.getLoadedText(),"Hello World!","incorrect statement");
     }


     @Test
    public void testDynamicLoadingEx2 (){
         var example2 = homePage.clickDynamicLoading();
         var ex2Page = example2.clickExample2();
         ex2Page.clickStartButton();
         assertEquals(ex2Page.getVisibleText(),"Hello World!","incorrect text");


     }







}
