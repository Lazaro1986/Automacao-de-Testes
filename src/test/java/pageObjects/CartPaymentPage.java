package pageObjects;

import elementMapper.CartPaymentPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPaymentPage extends CartPaymentPageElementMapper {

    public CartPaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar na forma de pagamento")
    public void clickBtnPaymentMethod(){
        paymentMethod.click();
    }

    public String getProductNamePayment(){
        return productNamePayment.getText();
    }
}
