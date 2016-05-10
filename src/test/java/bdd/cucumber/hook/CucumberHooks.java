package bdd.cucumber.hook;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;

/**
 * Created by Mior on 08/05/2016.
 */
public class CucumberHooks {

    @ManagedPages
    private Pages pages;

    @Before
    public void openBrowser(){
        pages.getDriver().manage().deleteAllCookies();
        pages.getDriver().manage().window().maximize();
    }
}
