package bdd.pages;

import bdd.pages.subpages.NavMenu;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mior.Sufian on 09/05/2016.
 */
@DefaultUrl("http://www.sportinglife.com")
public class SLHomePage extends PageObject {
    public NavMenu navMenu;

    public void isLoaded(){
        withTimeoutOf(5, TimeUnit.SECONDS).waitForTitle("Horse Racing News | Sports Betting Tips & Live Scores | Sporting Life");
    }

    public void getMetaData(){
        System.out.println(getDriver().findElement(By.xpath("//meta[@name='keywords]")).getAttribute("content"));
    }
}
