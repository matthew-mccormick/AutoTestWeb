package productCategories.modal;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class AddToCartModal extends BasePage<AddToCartModal>
{
    //Elements
    @Visible
    @Name("Successfully added to Basket")
    @FindBy(id = "layer-cart")
    private WebElement addToCartSuccessMessage;
    //Methods
    @Step("Verify Product was added to the cart")
    public String addToCartSuccessText()
    {
        return addToCartSuccessMessage.getText().trim().toLowerCase();
    }
}
