package Frams;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WYSIWYGEditorTest extends BaseTests {

    @Test
    public void testWYSIWYGEditor(){
        var wisiPage = homePage.clickWYSIWYGEditor();
        wisiPage.clearEditArea();
        wisiPage.setEditArea("Hello");
        wisiPage.clickIncreaseButton();
        wisiPage.setEditArea(" World");
        assertEquals (wisiPage.readTextFromEditArea(),"Hello World","incorrect");

    }
}
