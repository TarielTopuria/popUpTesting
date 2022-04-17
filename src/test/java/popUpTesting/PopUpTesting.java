package popUpTesting;

import base.BaseTests;
import org.junit.Test;
import pages.AlertsPage;

public class PopUpTesting extends BaseTests {
    @Test
    public void jsAlertTest(){
        AlertsPage alertsHandle = homePage.clickAlertPage();
        alertsHandle.clickJsAlert();
        alertsHandle.acceptJsAlert();
    }

    @Test
    public void jsConfirmTest(){
        AlertsPage alertsHandle = homePage.clickAlertPage();
        alertsHandle.clickJsConfirm();
        alertsHandle.acceptJsConfirm();
    }

    @Test
    public void jsDismissTest(){
        AlertsPage alertsHandle = homePage.clickAlertPage();
        alertsHandle.clickJsConfirm();
        alertsHandle.dismissJsConfirm();
    }

    @Test
    public void jsPromptTest(){
        AlertsPage alertsHandle = homePage.clickAlertPage();
        alertsHandle.clickJsPrompt();
        alertsHandle.acceptJsPrompt("Hello I Am Tato Topuria, Automation Tester From Georgia");
    }
}
