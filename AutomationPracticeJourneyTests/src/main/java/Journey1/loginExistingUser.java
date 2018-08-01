package Journey1;

import com.frameworkium.core.ui.tests.BaseUITest;
import org.testng.annotations.Test;
import HomePage.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import static com.google.common.truth.Truth.assertThat;

public class loginExistingUser extends BaseUITest
{
    @TestCaseId("RegNew1")
    @Test(description = "Registering a new user at Automation Practice", dataProvider = "Existing Users", dataProviderClass = DataProviders.accounts.class)
    public void loginAsExistingUser(String email, String password)
    {
        LandingPage landingPage = LandingPage.open();

        AccountPage accountPage = landingPage
                .clickSignIn()
                .sendEmailText(email)
                .sendPasswordText(password)
                .clickLoginButton();

        assertThat(accountPage.getLoginSuccessText())
                .isEqualTo("my account");
    }
}