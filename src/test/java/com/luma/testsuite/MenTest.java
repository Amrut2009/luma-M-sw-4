package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MenPantsPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPantsPage menPantsPage = new MenPantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    public void userShouldAddProductSuccessFullyToshoppinCart() throws InterruptedException{
        Thread.sleep(2000);
        // Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottomSubManu();
        //Click on Pants
        homePage.mouseHoverAndClickPantSubMenuOfBottom();
        // Mouse Hover on product name‘Cronus Yoga Pant’and click on size
        menPantsPage.mouseHoverOnCronusYogaPantSize32Selection();
        //Mouse Hover on product name‘Cronus Yoga Pant’and click on colourBlack.
        menPantsPage.mouseHoverOnCronusYogaPantColourBlackSelection();
        // Mouse Hover on product name‘Cronus Yoga Pant’and click on‘Add To Cart’Button.
        menPantsPage.mouseHoverAndClickOnCronusYogaPantAddToCartButton();
        //Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        menPantsPage.getProductAddedMessage();
        String expectedProductAddMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductAddMessage = menPantsPage.getProductAddedMessage().substring(0, expectedProductAddMessage.length());
        Assert.assertEquals(actualProductAddMessage, expectedProductAddMessage);
        //Click on ‘shopping cart’Link into message
        menPantsPage.clickOnShoppingCartLinkInProductAddMessage();
        // Verify the text ‘Shopping Cart.’
        shoppingCartPage.getWelcomeText();
        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);
        //Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.getProductName();
        String expectedProductName = "Cronus Yoga Pan";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);
        //Verify the product size ‘32’
        shoppingCartPage.getProductSize();
        String expectedProductSize = "32";
        String actualProductSize = shoppingCartPage.getProductSize().substring(0, expectedProductSize.length());
        Assert.assertEquals(actualProductSize, expectedProductSize);
        //Verify the product colour ‘Black’
        shoppingCartPage.getProductColour();
        String expectedProductColour = "Black";
        String actualProductColour = shoppingCartPage.getProductColour().substring(0, expectedProductColour.length());
        Assert.assertEquals(actualProductColour, expectedProductColour);
    }
    }

