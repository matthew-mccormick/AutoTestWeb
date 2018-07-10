package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import com.sun.javafx.runtime.SystemProperties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import HomePage.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import DataProviders.accounts;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assert_;

public class loginExistingUser extends BaseUITest
{
    @TestCaseId("RegNew1")
    @Test(description = "Registering a new user at Automation Practice", dataProvider = "existingUsers", dataProviderClass = DataProviders.accounts.class)
    public void loginAsExistingUser(String email, String password)
    {
        LandingPage landingPage = LandingPage
                .open();
        AccountPage accountPage = landingPage
                .clickSignIn()
                .sendEmailText(email)
                .sendPasswordText(password)
                .clickLoginButton();
        assertThat(accountPage.getLoginSuccessText()).isEqualTo("my account");
    }
}
