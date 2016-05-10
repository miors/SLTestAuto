package bdd.serenity;

import bdd.pages.RacingPage;
import bdd.pages.SLHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Mior.Sufian on 09/05/2016.
 */
public class NavigateToLinkSteps {
    SLHomePage slHomePage;
    RacingPage racingPage;

    @Step
    public void navigatesToTheWebsite(){slHomePage.open();}

    @Step
    public void navigatesToPage(String buttonName) {
        slHomePage.navMenu.clickOnNavButton(buttonName);
        //racingPage = slHomePage.switchToPage(RacingPage.class);
        racingPage.isLoaded();
    }

    @Step
    public void isAbleToViewCorrectTitle(String pageTitle){
        assertThat(racingPage.getTitle().toLowerCase().contains(pageTitle.toLowerCase()));
    }
}
