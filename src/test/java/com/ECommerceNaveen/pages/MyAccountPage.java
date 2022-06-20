package com.ECommerceNaveen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccountPage extends BasePage {


    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement searchInput;

    @FindBy (xpath = "//span[@class='input-group-btn']")
    public WebElement searchButton;

    @FindBy (css = "#cart")
    public WebElement cartButton;

    @FindBy (xpath = "//input[@placeholder='Keywords']")
    public WebElement SearchInput1;

    @FindBy (xpath = "//select[@name='category_id']")
    public WebElement dropdown;

    @FindBy (xpath = "//input[@name='sub_category']")
    public WebElement subcategoryCheckbox;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement descriptionCheckbox;

    @FindBy (xpath = "//input[@id='button-search']")
    public WebElement searchButton1;

    @FindBy (xpath = "//div[@class='caption']/h4")
    public List<WebElement> searchResults;

    @FindBy (xpath = "(//button[@data-original-title='Add to Wish List'])[1]")
    public WebElement AddToWishlistButton;

    @FindBy (partialLinkText = "Wish List")
    public WebElement wishListShortCut;


    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left']/a")
    public List <WebElement> wishListItems;




}
