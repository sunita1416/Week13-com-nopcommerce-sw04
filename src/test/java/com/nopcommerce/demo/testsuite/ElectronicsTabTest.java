package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTabTest extends BaseTest {
    HomePage homepage = new HomePage();
    ElectronicsPage electronicspage = new ElectronicsPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homepage.clickOnElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicspage.getElectronicsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }

}
