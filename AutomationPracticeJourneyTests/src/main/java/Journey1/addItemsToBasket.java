package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import HomePage.*;

public class addItemsToBasket extends BaseUITest
{
    @TestCaseId("RegNew2")
    @Test(description = "Add a new item to the basket")
    public void addNewItemsToBasket()
    {
        LandingPage landingPage = LandingPage
                .open()
                .clickTabByText("T-SHIRTS");
    }
}
