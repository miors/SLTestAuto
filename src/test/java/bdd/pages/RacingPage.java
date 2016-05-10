package bdd.pages;

import bdd.pages.subpages.NavMenu;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mior.Sufian on 09/05/2016.
 */
@At(urls={"#HOST/racing"})
@DefaultUrl("http://www.sportinglife.com/racing")
public class RacingPage extends PageObject{
    public NavMenu navMenu;

    public void isLoaded(){
        withTimeoutOf(5, TimeUnit.SECONDS).waitForTitle("Horse Racing Betting Tips | Racecards, Live Results & News | Sporting Life");
    }
}
