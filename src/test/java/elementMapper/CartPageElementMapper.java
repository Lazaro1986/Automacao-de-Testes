package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {

    @FindBy(css = ".cart_navigation a[title='Proceed to checkout']")
    public WebElement buttonProceedToCheckout;

}
