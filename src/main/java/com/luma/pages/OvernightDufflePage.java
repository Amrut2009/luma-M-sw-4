package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {
    By welcomeText = By.xpath("//span[@class='base']");
    By quantityField = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//span[normalize-space()='Add to Cart']");
    By productAddedToCartSuccessMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInSuccessMessage = By.xpath("//a[normalize-space()='shopping cart']");


    public String getWelcomeText() {
        getTextFromElement(welcomeText);

        public void sendDataToQuantityField (String quantity){
            sendTextToElement(quantityField,);
        }

        public void clickOnAddToCartButton () {
            clickOnElement(addToCartButton);
        }

        public String getTextFromProductAddedToCartSuccessMessage () {
            return getTextFromElement(productAddedToCartSuccessMessage);
        }

        public void clickOnShoppingCartLinkInSuccessMessage () {
            clickOnElement(shoppingCartLinkInSuccessMessage);

        }
    }
}
