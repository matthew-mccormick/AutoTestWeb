package productCategories;

import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import productCategories.modal.AddToCartModal;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class itemIndividualPage extends BasePage<itemIndividualPage>
{
    @Name("add to cart button on individual item page")
    @FindBy(id = "add_to_cart")
    private WebElement addToCartButton;

    @Step("Click Add To Cart Button on the item page")
    public AddToCartModal clickAddToCart()
    {
        addToCartButton.click();
        return PageFactory.newInstance(AddToCartModal.class);
    }
}
