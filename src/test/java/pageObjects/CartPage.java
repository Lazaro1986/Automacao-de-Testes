package pageObjects;

import elementMapper.CartPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar no botão de prosseguir compra")
    public void clickBtnProceedToCheckout(){
        buttonProceedToCheckout.click();
    }
}
