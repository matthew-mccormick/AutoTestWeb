package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import com.sun.javafx.runtime.SystemProperties;
import org.testng.annotations.Test;
import HomePage.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assert_;

public class loginExistingUser extends BaseUITest
{
    @TestCaseId("RegNew1")
    @Test(description = "Registering a new user at Automation Practice")
    public void loginAsExistingUser()
    {
        LandingPage landingPage = LandingPage
                .open();
        AccountPage accountPage = landingPage
                .clickSignIn()
                .sendEmailText("Testing123@testmail.com")
                .sendPasswordText("s3cur3P4ssw0rd")
                .clickLoginButton();
        assertThat(accountPage.getLoginSuccessText()).isEqualTo("my account");
    }
}
