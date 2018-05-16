package HomePage;

import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import productCategories.itemCategoryPage;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

import java.util.List;

public class HeaderBarPage extends BasePage<HeaderBarPage>
{
    //@Visible
    @Name("Header Navigation Tabs")
    @FindBy(css = "[href*='http://automationpractice.com/index.php?id_category='][href$='&controller=category']")
    private List<WebElement> navBarList;

    @Step("click a navigational tab in the header by inputted text")
    public HeaderBarPage clickTabByText(String tabText)
    {
        navBarList.stream().filter(a -> a.getText().equals(tabText))
                .findFirst().get().click();
        return PageFactory.newInstance(HeaderBarPage.class);
    }
    @Step("Go To Dresses Page")
    public itemCategoryPage goToDressesPage()
    {
        return PageFactory.newInstance(itemCategoryPage.class);
    }
}
