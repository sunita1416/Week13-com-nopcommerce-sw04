package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){

        homePage.clickOnRegisterLink();
        registerPage.enterfirstName("Suraj");
        registerPage.enterlastName("Singh");
        registerPage.enteremail("SSP@gmail.com");
        registerPage.enterpassword("Ssp@123");
        registerPage.enterConfirmPassword("Ssp@123");
        registerPage.clickRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getRegisterCompletionMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"Register not completed");

    }
}
