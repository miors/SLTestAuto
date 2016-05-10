package bdd.pages.subpages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mior.Sufian on 09/05/2016.
 */
public class Header extends PageObject{

    public void isLoaded(){
        withTimeoutOf(5, TimeUnit.SECONDS).elementIsDisplayed(By.id("header"));
    }
}
