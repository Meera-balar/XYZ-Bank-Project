package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    //search customer that you created
    By searchCustomer = By.id("userSelect");
    public void searchCustomer(String text){
        selectByVisibleTextFromDropDown(searchCustomer,text);
    }
    //click on "Login" Button
    By clickLogIn = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLoginButton(){
        mouseHoverToElementAndClick(clickLogIn);
    }
    //verify "Your Name" text displayed
    By nameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameText(){
        return getTextFromElement(nameText);
    }
}
