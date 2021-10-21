package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartOrderSummaryPageElementMapper {

    @FindBy(css = "#cart_navigation .button")
    public WebElement confirmOrder;
}
