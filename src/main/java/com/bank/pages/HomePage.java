package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // click On "Bank Manager Login" Tab
    By clickBankMangerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnBankManagerLoginTab(){
        mouseHoverToElementAndClick(clickBankMangerLogin);
    }
    //click on "Customer Login" Tab
    By clickLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogInTab(){
        mouseHoverToElementAndClick(clickLoginTab);
    }

}
