package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadPage extends Utility {
    By digitalDownloadsTab = By.xpath("//h1[contains(text(),'Digital downloads')]");

    public String getDigitalDownloadsTab(){
        return  getTextFromElement(digitalDownloadsTab);
    }


}
