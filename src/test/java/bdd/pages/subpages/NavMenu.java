package bdd.pages.subpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mior.Sufian on 09/05/2016.
 */
public class NavMenu extends PageObject {
    @FindBy(xpath="//div[@id='nl01']/ul[@class='m']/li/a")
    List<WebElementFacade> navButtons;

    public void isLoaded(){
         withTimeoutOf(5, TimeUnit.SECONDS).elementIsDisplayed(By.id("nav"));
    }

    public void clickOnNavButton(String buttonName){
        for (int i=0;i<navButtons.size();i++){
            if (navButtons.get(i).getText().toLowerCase().equals(buttonName.toLowerCase())){
                navButtons.get(i).click();
            }
        }
    }
}
