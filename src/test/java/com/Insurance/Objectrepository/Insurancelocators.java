package com.Insurance.Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Insurance.Baseclass.Baseclass;

public class Insurancelocators extends Baseclass{
	
	public Insurancelocators(){
		PageFactory.initElements(Baseclass.driver, this);	
	}
	
	@FindBy(xpath="//span[text()=' Products']")
	private WebElement product;
	
	@FindBy(xpath="//a[text()='Insurance Plans']")
	private WebElement plan;
	
	@FindBy(xpath="//a[text()='Money Back Plans']")
	private WebElement moneyPlan;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-sjeevanumang-745%09512n312v03']")
	private WebElement jeevanPlan;
	
	@FindBy(xpath="//a[text()=' Sales Brochures ']")
	private WebElement sales;
	
	@FindBy(xpath="//a[text()='Pension Plans']")
	private WebElement pensionPlan;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-s-new-pension-plus-867-512l347v01']")
	private WebElement pensionPlus;
	
	@FindBy(xpath="//a[text()=' Policy Document ']")
	private WebElement policyDocument;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-sjeevanakshay-vii-857-512n337v061']")
	private WebElement jeevanAkshay;
	
	@FindBy(xpath="//a[text()=' Sales Brochure ']")
	private WebElement salesBrochure;
	
	@FindBy(xpath="//a[text()='Unit Linked Plans']")
	private WebElement unitPlans;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-s-index-plus-873-512l354v01']")
	private WebElement indexPlus;
	
	@FindBy(xpath=" //a[text()=' Sales Brochures '] ")
	private WebElement sale;

	@FindBy(xpath="//a[text()='Health Plans']")
	private WebElement health;
	
	@FindBy(xpath="//a[text()='Health Claim Forms for Policyholders']")
	private WebElement healthClaim;
	
	

	public WebElement getHealth() {
		return health;
	}

	public WebElement getHealthClaim() {
		return healthClaim;
	}

	

	public WebElement getUnitPlans() {
		return unitPlans;
	}

	public WebElement getIndexPlus() {
		return indexPlus;
	}

	public WebElement getSale() {
		return sale;
	}

	public WebElement getJeevanAkshay() {
		return jeevanAkshay;
	}
	
	public WebElement getSalesBrochure() {
		return salesBrochure;
	}

	

	public WebElement getPensionPlan() {
		return pensionPlan;
	}

	public WebElement getPensionPlus() {
		return pensionPlus;
	}

	public WebElement getPolicyDocument() {
		return policyDocument;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getPlan() {
		return plan;
	}

	public WebElement getMoneyPlan() {
		return moneyPlan;
	}

	public WebElement getJeevanPlan() {
		return jeevanPlan;
	}

	public WebElement getSales() {
		return sales;
	}

}
