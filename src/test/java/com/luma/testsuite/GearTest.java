package com.luma.testsuite;

import com.luma.pages.BagsPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDufflePage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;


public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage =new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();

    public void userShouldAddProductSuccessFullyToShoppingCart() throws  InterruptedException{
        Thread.sleep(2000);
        //Mouse Hover on gear Menu
        homePage.mouseHoverOnGearMenu();
        // Click on Bags
      homePage.mouseHoverAndClickBagsSubManuOfGear();
        // Click on Product Name ‘Overnight Duffle’
        bagsPage.mouseHoverAndClickOnOvernightDuffle();
        // Verify the text ‘Overnight Duffle’
        bagsPage.mouseHoverAndClickOnOvernightDuffle();
        String expectedMessage = "Overnight Duffle";
        String actualMessage = overnightDufflePage.getWelcomeText().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);

        // Change Qty 3
       // overnightDufflePage.Keys.CONTROL + "a");
       // overnightDufflePage.sendDataToQuantityField("3");
        // Click on ‘Add to Cart’ Button.
       // overnightDufflePage.clickOnElement();
        // Verify the text
        //‘You added Overnight Duffle to your shopping cart.’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);
        //* Click on ‘shopping cart’ Link intoMessage
        overnightDufflePage.getWelcomeText();
        //* Verify the product name ‘Cronus Yoga Pant’

        //* Verify the Qty is ‘3’
        String expectedQuantity = "3";
        String actualQuantity = shoppingCartPage.getQuantity().substring(0, expectedQuantity.length());
        Assert.assertEquals(actualQuantity, expectedQuantity);
        //* Verify the product price ‘$135.00’
        String expectedSubTotal = "$135.00";
        String actualSubTotal = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal.length());
        Assert.assertEquals(actualSubTotal, expectedSubTotal);
        //* Change Qty to ‘5’
        shoppingCartPage.sendDataToQuantityField("5");

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        //* Verify the product price ‘$225.00’
        Thread.sleep(2000);
        String expectedSubTotal1 = "$225.00";
        String actualSubTotal1 = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal1.length());
        Assert.assertEquals(actualSubTotal1, expectedSubTotal1);
    }
    }

