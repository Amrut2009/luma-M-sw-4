package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketsPage extends Utility {
    By sortByFilter = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By allProductTitle = By.xpath("//strong[@class = 'product name product-item-name']");
    By allProductPrice = By.xpath("//span[@class = 'normal-price']//span[@class = 'price']");


    public void sortByFilter(String value) {
        selectByValueFromDropDown(sortByFilter, value);
    }

    public List<WebElement> getAllProductTitleOnPage() {
        List<WebElement> products = driver.findElements(allProductTitle);
        return products;
    }

    public List<WebElement> getAllProductPriceOnPage() {
        List<WebElement> products = driver.findElements(allProductPrice);
        return products;
    }
}