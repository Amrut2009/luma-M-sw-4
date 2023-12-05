package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomenJacketsPage;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(2000);
        // Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        //Mouse Hover on Tops
        homePage.mouseHoverOnTopSubMenu();
        Thread.sleep(2000);
        // Click on Jackets
        homePage.mouseHoverAndClickJacketSubMenuOfTop();
        Thread.sleep(2000);
        // Select Sort By filter “Product Name”
        womenJacketsPage.sortByFilter("name");
        // Verify the products name display in alphabetical order
        List<WebElement> list = womenJacketsPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l : list) {
            originalList.add(l.getText());
        }
        Collections.sort(originalList);
        System.out.println(originalList);

        womenJacketsPage.sortByFilter("Product Name");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = womenJacketsPage.getAllProductTitleOnPage();
        for (WebElement l : list) {
            sortedList.add(l.getText());
        }
        System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        Thread.sleep(2000);
        // Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        // Mouse Hover on Tops
        homePage.mouseHoverOnTopSubMenu();
        Thread.sleep(2000);
        //Click on Jackets
        homePage.mouseHoverAndClickJacketSubMenuOfTop();
        Thread.sleep(2000);
        //Select Sort By filter “Price”
        womenJacketsPage.getAllProductPriceOnPage();
        List<WebElement> list = womenJacketsPage.getAllProductPriceOnPage();
        ArrayList originalPriceList = new ArrayList();
        for (WebElement l: list) {
            originalPriceList.add(l.getText());
        }
        Collections.sort(originalPriceList);
        System.out.println(originalPriceList);
        // Verify the products price display in Low to High

        womenJacketsPage.sortByFilter("Price");
        Thread.sleep(2000);
        ArrayList sortedPriceList = new ArrayList();
        list = womenJacketsPage.getAllProductPriceOnPage();
        for (WebElement l: list) {
            sortedPriceList.add(l.getText());
        }
        System.out.println(sortedPriceList);
        Assert.assertEquals(originalPriceList, sortedPriceList);
    }

    }

