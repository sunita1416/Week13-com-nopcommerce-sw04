package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTab = By.xpath("//h1[contains(text(),'Apparel')]");

    public String getApparelTab(){
        return getTextFromElement(apparelTab);

    }

   // private String getTextFromElement(By apparelTab) {

  //  }

}
