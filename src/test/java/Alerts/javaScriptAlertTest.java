package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class javaScriptAlertTest extends BaseTests {

    @Test
    public void testJSAlertButton(){
      var jsAlert = homePage.clickJavascriptAlerts();
      jsAlert.alert_clickForJSAlertButton();
     jsAlert.alert_clickToAccept();
     assertEquals(jsAlert.getResultMsg(),"You successfuly clicked an alert");
    }

    @Test
    public void testJSConfirmButton(){
       var jsAlertPage =  homePage.clickJavascriptAlerts();
        jsAlertPage.alert_clickForJSConfirmButton();
        assertEquals(jsAlertPage.alert_getText(),"I am a JS Confirm");
        jsAlertPage.alert_clickToDismiss();
    }

    @Test
    public void testJSPromptButton(){
        var jsPrompt =homePage.clickJavascriptAlerts();
        jsPrompt.alert_clickPromptButton();
        String text = "Eman Hamza";
        jsPrompt.alert_enterText(text);
        jsPrompt.alert_clickToAccept();
        assertEquals(jsPrompt.getResultMsg(),"You entered: Eman Hamza");

    }

}
