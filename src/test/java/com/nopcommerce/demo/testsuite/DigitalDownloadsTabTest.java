package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DigitalDownloadPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownloadsTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    DigitalDownloadPage digitalDownloadPage =  new DigitalDownloadPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        homePage.clickOnDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadPage.getDigitalDownloadsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
