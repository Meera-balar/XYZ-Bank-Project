package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    //	Search customer that created in first test
    By searchCustomer = By.id("userSelect");
    public void searchCustomerName(String text){
        clickOnElement(searchCustomer);
        selectByVisibleTextFromDropDown(searchCustomer,text);
    }
    //	Select currency "Pound"
    By currency = By.id("currency");
    public void selectCurrencyPound(String text){
        clickOnElement(currency);
        selectByVisibleTextFromDropDown(currency,text);
    }
    //	click on "process" button
    By clickProcess = By.xpath("//button[contains(text(),'Process')]");
    public void clickOnProcessButton(){
        mouseHoverToElementAndClick(clickProcess);
    }
    //	popup displayed
    //	verify message "Account created successfully"
    public String getPopupMessage(){
        return getTextFromAlert();
    }
    //	click on "ok" button on popup.
    public void clickOnOkButtonOfPopUp(){
        acceptAlert();
    }
}
