package Journey1;

import com.frameworkium.core.ui.tests.BaseUITest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import productCategories.itemIndividualPage;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import HomePage.*;

public class addItemsToBasket extends BaseUITest
{
    @TestCaseId("RegNew2")
    @Test(description = "Add a new item to the basket")
    public void addNewItemsToBasket()
    {
        itemIndividualPage itemCategoryPage = LandingPage
                .open()
                .getHeaderBarPage() //go to the header bar page
                .clickTabByText("DRESSES") //click dresses tab
                .goToDressesPage() //go to the dresses page object
                .cycleThroughAllItems() //cycle through all items on the page
                .getSingleItem(0) //get the first item
                .clickAddToCart(); //Add the item to the cart
    }
}
