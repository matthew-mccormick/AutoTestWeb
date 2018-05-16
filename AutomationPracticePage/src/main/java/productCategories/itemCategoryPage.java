package productCategories;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

import java.util.List;

public class itemCategoryPage extends BasePage<itemCategoryPage>
{
    @Visible
    @Name("Get the list of items on the page")
    @FindBy(className = "product_img_link")
    private List<WebElement> productList;

    //@Visible
    @Name("get the list of items in the journey bar")
    @FindBy(css = "#columns > div.breadcrumb.clearfix > a")
    private List<WebElement> breadCrumbList;

    @Step("click every item on the page")
    public itemCategoryPage cycleThroughAllItems()
    {
        int sizeList = productList.size();
        for (int i=0; i < sizeList; i++ ) {
            productList.get(i).click();
            breadCrumbList.get(2).click();
            //click sub-nav header to go back and cycle through
        }
        return this;
    }
    @Step("click a single item on the page")
    public itemIndividualPage getSingleItem(int indexItem)
    {
        productList.get(indexItem).click();
        return PageFactory.newInstance(itemIndividualPage.class);
    }

}
