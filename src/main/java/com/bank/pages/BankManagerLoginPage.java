package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    //click On "Add Customer" Tab
    By clickAddCustomer = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    public void clickOnAddCustomer() {
        try {
            Thread.sleep(500);
            mouseHoverToElementAndClick(clickAddCustomer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //	click On "Open Account" Tab
    By clickOpenAccount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");
    public void clickOnOpenAccount() {
        try {
            Thread.sleep(200);
            mouseHoverToElementAndClick(clickOpenAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
