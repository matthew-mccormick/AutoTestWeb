package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import com.sun.javafx.runtime.SystemProperties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import HomePage.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assert_;

public class loginExistingUser extends BaseUITest
{
    @DataProvider(name = "Existing Users")
    public static Object[][] existingUsers()
    {
        return new Object[][]{{"Testing123@testmail.com", "s3cur3P4ssw0rd"},{"Testing321@testmail.com","v3rys3cur3P4ssw0rd@"}};
    }
    @TestCaseId("RegNew1")
    @Test(description = "Registering a new user at Automation Practice", dataProvider = "Existing Users")
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
