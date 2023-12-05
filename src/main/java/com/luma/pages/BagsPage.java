package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage  extends Utility {

    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");


    public void mouseHoverAndClickOnOvernightDuffle(){
        mouseHoverToElementAndClick(overnightDuffle);
    }
}
