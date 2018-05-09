package HomePage;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

import java.util.List;

import static constants.Navigation.AUTOPRACTICE_URL;

public class LandingPage extends BasePage<LandingPage> {

    //Elements
    @Visible
    @Name("Sign-In Button")
    @FindBy(className = "login")
    private static WebElement SignInButton;

    //@Visible
    @Name("T-Shirts Tab")
    @FindBy(css = "[href*='http://automationpractice.com/index.php?id_category='][href$='&controller=category']") //css = "#block_top_menu > ul > li:nth-child(3) > a" "a[title=T-shirts]"
    private List<WebElement> navBarList;

    //Methods
    @Step("Navigate to the Landing Page")
    public static LandingPage open()
    {
        BaseUITest.getDriver().get(AUTOPRACTICE_URL);
        return PageFactory.newInstance(LandingPage.class);
    }
    @Step("Click Sign In")
    public RegisterSignInPage clickSignIn()
    {
        SignInButton.click();
        return PageFactory.newInstance(RegisterSignInPage.class);
    }
    @Step("click T-Shirts tab")
    public LandingPage clickTabByText(String tabText)
    {
        navBarList.stream().filter(a -> a.getText().equals(tabText))
                .findFirst().get().click();
        return PageFactory.newInstance(LandingPage.class);
    }



}
