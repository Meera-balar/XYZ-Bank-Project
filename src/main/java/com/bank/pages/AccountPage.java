package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    //verify "Logout" Tab displayed.
    By logoutText = By.xpath("//button[contains(text(),'Logout')]");

    public String checkLogoutTabDisplay() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(logoutText);
    }

    //click on "Logout"
    By clickLogOut = By.xpath("//button[contains(text(),'Logout')]");

    public void clickOnLogoutTab() {
        clickOnElement(clickLogOut);
    }
    //click on "Deposit" Tab
    By clickDeposit = By.xpath("//div[@class='borderM box padT20 ng-scope']//button[2]");
    public void clickOnDepositTab(){
        mouseHoverToElementAndClick(clickDeposit);
    }
    //Enter amount 100
    By enterAmountField = By.xpath("//input[@placeholder='amount']");
    public void enterAmountToDeposit(String text){
        sendTextToElement(enterAmountField,text);
    }
    //click on "Deposit" Button
    By clickDepositButton = By.xpath("//button[text()='Deposit']");
    public void clickOnDepositButton(){
        clickOnElement(clickDepositButton);
    }
    //verify message "Deposit Successful"
    By depositSuccessMessage = By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String getDepositSuccessfulMessage(){
        return getTextFromElement(depositSuccessMessage);
    }

    //click on "Withdraw" Tab
    By clickWithdraw = By.xpath("//div[@class='borderM box padT20 ng-scope']//button[3]");
    public void clickOnWithdrawTab(){
        mouseHoverToElementAndClick(clickWithdraw);
    }

    //Enter amount 50
    By enterAmountField2 = By.xpath("//input[@placeholder='amount']");
    public void enterAmountToWithdraw(String text){
        sendTextToElement(enterAmountField2,text);
    }
    //click on "Withdraw" button
    By clickWithdrawButton = By.xpath("//button[text()='Withdraw']");
    public void clickOnWithdrawButton(){
        clickOnElement(clickWithdrawButton);
    }

    //verify message "Transaction Successful"
    By transactionSuccessMessage = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String getTransactionSuccessfulMessage(){
        return getTextFromElement(transactionSuccessMessage);
    }

}
