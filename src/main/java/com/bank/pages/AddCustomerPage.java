package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    //enter FirstName
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    public void enterFirstName(String text){
        sendTextToElement(firstNameField,text);
    }
    //	enter LastName
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    public void enterLastName(String text){
        sendTextToElement(lastNameField,text);
    }
    //	enter PostCode
    By postcodeField = By.xpath("//input[@placeholder='Post Code']");
    public void enterPostcode(String text){
        sendTextToElement(postcodeField,text);
    }
    //	click On "Add Customer" Button
    By clickAddCustomerButton = By.xpath("//button[text()='Add Customer']");
    public void clickOnAddCustomerButton(){
        mouseHoverToElementAndClick(clickAddCustomerButton);
    }
    //	popup display
    //	verify message "Customer added successfully"
    public String getPopupMessage(){
        return getTextFromAlert();
    }
    //	click on "ok" button on popup.
    public void clickOnOkButtonOfPopUp(){
        acceptAlert();
    }

}
