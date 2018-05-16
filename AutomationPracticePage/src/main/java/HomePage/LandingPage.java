package HomePage;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
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
    private  WebElement SignInButton;

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
    @Step("Get Header Page")
    public HeaderBarPage getHeaderBarPage()
    {
        return PageFactory.newInstance(HeaderBarPage.class);
    }
}
