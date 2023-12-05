package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By topSubMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketSubMenuOfTop = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu= By.xpath("//span[normalize-space()='Men']");
    By bottomSubManu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantSubMenuOfBottom = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsSubManuOfGear = By.xpath("//span[normalize-space()='Bags']");
   // *************************************************action**************************************************//
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTopSubMenu(){
        mouseHoverToElement(topSubMenu);
    }
    public  void mouseHoverAndClickJacketSubMenuOfTop(){
        mouseHoverToElementAndClick(jacketSubMenuOfTop);
    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottomSubManu(){
        mouseHoverToElement(bottomSubManu);
    }
    public  void mouseHoverAndClickPantSubMenuOfBottom() {
        mouseHoverToElementAndClick(pantSubMenuOfBottom);
    }
    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }
    public  void mouseHoverAndClickBagsSubManuOfGear(){
        mouseHoverToElementAndClick(bagsSubManuOfGear);
    }

}
