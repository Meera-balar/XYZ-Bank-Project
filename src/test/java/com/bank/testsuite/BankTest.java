package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();
    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName("Hermoine");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostcode("CV0 0OL");
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertTrue(addCustomerPage.getPopupMessage().contains("Customer added successfully"),"Customer not added successfully");
        addCustomerPage.clickOnOkButtonOfPopUp();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.searchCustomerName("Hermoine Granger");
        openAccountPage.selectCurrencyPound("Pound");
        openAccountPage.clickOnProcessButton();
        Assert.assertTrue(openAccountPage.getPopupMessage().contains("Account created successfully"),"Customer not added successfully");
        openAccountPage.clickOnOkButtonOfPopUp();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLogInTab();
        customersPage.searchCustomer("Hermoine Granger");
        customersPage.clickOnLoginButton();
        Assert.assertEquals(accountPage.checkLogoutTabDisplay(),"Logout","Customer not login successfully");
        accountPage.clickOnLogoutTab();
        Assert.assertTrue(customersPage.verifyYourNameText().contains("Your Name"),"Customer not logout successfully");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLogInTab();
        customersPage.searchCustomer("Hermoine Granger");
        customersPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmountToDeposit("100");
        accountPage.clickOnDepositButton();
        Assert.assertEquals(accountPage.getDepositSuccessfulMessage(),"Deposit Successful", "Deposit not successfully done");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLogInTab();
        customersPage.searchCustomer("Hermoine Granger");
        customersPage.clickOnLoginButton();
        accountPage.clickOnWithdrawTab();
        accountPage.enterAmountToWithdraw("50");
        accountPage.clickOnWithdrawButton();
        Assert.assertEquals(accountPage.getTransactionSuccessfulMessage(),"Transaction successful","Transaction not successfully done");
    }
}
