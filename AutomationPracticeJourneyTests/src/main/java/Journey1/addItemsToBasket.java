package Journey1;

import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import HomePage.*;

public class addItemsToBasket extends BaseTest {

    @TestCaseId("RegNew2")
    @Test(description = "Add a new item to the basket")

    public void addNewItemsToBasket()
    {
        LandingPage landingPage = LandingPage
                .open()
                .clickTShirtsTab();


    }

}
