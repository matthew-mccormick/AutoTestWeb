package HomePage;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

import static constants.Navigation.AUTOPRACTICE_URL;

public class LandingPage extends BasePage<LandingPage> {

    //Elements
    @Visible
    @Name("Sign-In Button")
    @FindBy(className = "login")
    private static WebElement SignInButton;


    @Visible
    @Name("T-Shirts Tab")
    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    private static WebElement tShirtsTab;

    //Methods

    @Step("Navigate to the Landing Page")
    public static LandingPage open()
    {
        BaseTest.getDriver().get(AUTOPRACTICE_URL);
        return PageFactory.newInstance(LandingPage.class);

    }
    @Step("Click Sign In")
    public RegisterSignInPage clickSignIn()
    {
        SignInButton.click();
        return PageFactory.newInstance(RegisterSignInPage.class);
    }

    @Step("click T-Shirts tab")
    public LandingPage clickTShirtsTab()
    {
        tShirtsTab.click();
        return PageFactory.newInstance(LandingPage.class);
    }



}
