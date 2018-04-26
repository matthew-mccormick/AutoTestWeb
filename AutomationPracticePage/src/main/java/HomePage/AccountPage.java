package HomePage;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class AccountPage extends BasePage<AccountPage>
{

        @Visible
        @Name("My Account Header")
        @FindBy(className = "page-heading")
        private static WebElement loginHeaderSuccess;

        @Step("Verify My Account is displayed")
        public String getLoginSuccessText()
        {
            return loginHeaderSuccess.getText().trim().toLowerCase();
        }
}
