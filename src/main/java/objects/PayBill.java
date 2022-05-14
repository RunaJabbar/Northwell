package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class PayBill {
	public PayBill(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "(//a[@class='main-nav__primary-nav-item'])[4]")
	WebElement payBillElement;
	@FindBy(xpath = "//a[@class='button button--inverse']")
	WebElement continueAsGuestElement;
	@FindBy(xpath = "//input[@id='searchForm_Controls_0__Value']")
	WebElement lastNamElement;
	@FindBy(xpath = "//input[@id='searchForm_Controls_1__Value']")
	WebElement accountNumberElement;
	@FindBy(xpath = "//input[@id='searchForm_Controls_2__Value']")
	WebElement dobElement;
	@FindBy(className = "account-search-next-button-text")
	WebElement findMyAccountElement;
	
public void payBill(CommonActions commonActions) {
	commonActions.click(payBillElement);	
}
public void continueAsGuest(CommonActions commonActions) {
	commonActions.click(continueAsGuestElement);
	
}
public void lastName(CommonActions commonActions, String value) {
	commonActions.inputText(lastNamElement, value);	
}
public void accountNumber(CommonActions commonActions, String value) {
	commonActions.inputText(accountNumberElement, value);
	
}
public void dob(CommonActions commonActions, String value) {
	commonActions.inputText(dobElement, value);
	
}
public void findMyAccount(CommonActions commonActions) {
	commonActions.click(findMyAccountElement);
	
}
}