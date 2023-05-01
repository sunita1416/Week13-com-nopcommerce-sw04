package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Bookspage extends Utility {
    By booksTab = By.xpath("//h1[contains(text(),'Books')]");

    public String getBooksTab(){
        return getTextFromElement(booksTab);
    }

}
