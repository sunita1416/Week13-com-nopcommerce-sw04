package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.JewelryPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    JewelryPage jewelryPage = new JewelryPage();

    @Test
    public void userShouldNavigateToJewelrylPageSuccessfully(){
        homePage.clickOnJewelryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getjewelryTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
