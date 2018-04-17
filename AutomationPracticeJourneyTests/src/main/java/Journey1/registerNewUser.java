package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import com.sun.javafx.runtime.SystemProperties;
import org.testng.annotations.Test;
import HomePage.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class registerNewUser extends BaseTest
{
    @TestCaseId("RegNew1")
    @Test(description = "Registering a new user at Automation Practice")
    public void registerNewUser()
    {
        LandingPage landingPage = LandingPage
                .open()
                .clickSignIn();


    }

}
