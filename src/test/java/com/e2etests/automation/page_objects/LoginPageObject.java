package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;



public class LoginPageObject {
	public ConfigFileReader confilerdr;
	
//recherche des elements
	@FindBy(how=How.ID,using="user-name")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="password")
	public static WebElement passeword;
	
	@FindBy(how=How.ID,using="login-button")
	public static WebElement login;
	
	@FindBy(how=How.XPATH,using="//span[@class='title']")
	public static WebElement title;
	
    @FindBy(how=How.XPATH,using="//div[@id='login_button_container']//form//h3")
	public static WebElement msgderreur;
	
	//login test
	
	@FindBy(how=How.ID,using="react-burger-menu-btn")
	public static WebElement menu;
	
	@FindBy(how=How.ID,using="logout_sidebar_link")
	public static WebElement logout;
	
	@FindBy(how=How.XPATH,using="//div[@ class='login_logo']")
	public static WebElement pagedauthentification;
		
		
	//methodes
	public LoginPageObject(){
		PageFactory.initElements(Setup.getDriver(),this);
		confilerdr = new ConfigFileReader();
			}
	
	public void connectToApplication() {
		Setup.getDriver().get(confilerdr.getProperties("url"));
		
	}
	public void saisiUserName(String usr) {
		username.sendKeys(usr);
		
	}
	public void saisiPasseword(String pwd) {
	passeword.sendKeys(pwd);
}
	public void clicBoutton() {
		login.click();
	}
	public void clicMenu() {
		menu.click();
	}
	
	public void logOut() {
	logout.click();		 
	}
	public String verificationurl(){
	return Setup.getDriver().getCurrentUrl();
	
			}
	public void FillUsername() {
		username.sendKeys(confilerdr.getProperties("username"));
		
	}
	public void FillPassword() {
		passeword.sendKeys(confilerdr.getProperties("password"));
		
	}
	
	
	}