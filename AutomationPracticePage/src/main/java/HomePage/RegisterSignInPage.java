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
    //Elements
    @Visible
    @Name("Email Textbox")
    @FindBy(id = "email")
    private WebElement emailTextField;

    @Visible
    @Name("Password Textbox")
    @FindBy(id = "passwd")
    private WebElement passwordTextField;

    @Visible
    @Name("Login Button")
    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;
    //Methods
    @Step("Enter email address")
    public RegisterSignInPage sendEmailText(String email)
    {
        emailTextField.sendKeys(email);
        return this;
    }
    @Step("Enter Password")
    public RegisterSignInPage sendPasswordText(String password)
    {
        passwordTextField.sendKeys(password);
        return this;
    }
    @Step("Click login for existing user")
    public AccountPage clickLoginButton()
    {
        loginButton.click();
        return PageFactory.newInstance(AccountPage.class);
    }
}
