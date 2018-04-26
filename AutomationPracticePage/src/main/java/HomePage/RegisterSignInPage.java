package HomePage;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import ru.yandex.qatools.htmlelements.annotations.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

import static com.google.common.truth.Truth.assertThat;

public class RegisterSignInPage extends BasePage<RegisterSignInPage>
{

    //@Visible
    @Name("Email Textbox")
    @FindBy(id = "email")
    private WebElement emailTextField;

    //@Visible
    @Name("Password Textbox")
    @FindBy(id = "passwd")
    private WebElement passwordTextField;

    //@Visible
    @Name("Login Button")
    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @Step("Enter email address")
    public RegisterSignInPage sendEmailText(String email)
    {
        emailTextField.sendKeys(email);
        return PageFactory.newInstance(RegisterSignInPage.class);
    }
    @Step("Enter Password")
    public RegisterSignInPage sendPasswordText(String password)
    {
        passwordTextField.sendKeys(password);
        return PageFactory.newInstance(RegisterSignInPage.class);
    }


    @Step("Click login for existing user")
    public RegisterSignInPage clickLogin()
    {
        loginButton.click();
        return PageFactory.newInstance(RegisterSignInPage.class);
    }

    @Step("go to account page")
    public AccountPage goToAccountPage()
    {
        return PageFactory.newInstance(AccountPage.class);
    }


}
