package com.ECommerceNaveen.pages;

import com.ECommerceNaveen.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.get(), this);
    }

}
