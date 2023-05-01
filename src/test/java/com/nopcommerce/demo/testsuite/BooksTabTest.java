package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Bookspage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    Bookspage booksPage = new Bookspage();

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickBooksTab();
        String expectedMessage = "Books";
        String actualMessage = booksPage.getBooksTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
