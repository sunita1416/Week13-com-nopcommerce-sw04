package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.GiftCardsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardsTabTest extends BaseTest {
    HomePage homepage = new HomePage();
    GiftCardsPage giftcardspage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homepage.clickOnGiftCards();
        String expectedMessage = "Gift Cards";
        String actualMessage = giftcardspage.getGiftCardsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }
}
