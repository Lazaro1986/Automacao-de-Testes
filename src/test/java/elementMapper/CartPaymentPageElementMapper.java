package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPaymentPageElementMapper {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNamePayment;

    @FindBy(css = ".payment_module a[title='Pay by bank wire']")
    public WebElement paymentMethod;


}
