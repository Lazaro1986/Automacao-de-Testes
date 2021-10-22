package pageObjects;

import elementMapper.CartOrderSummaryPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartOrderSummaryPage extends CartOrderSummaryPageElementMapper {

    public CartOrderSummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar no botão de confirmar compra")
    public void clickBtnConfirmOrder(){
        confirmOrder.click();
    }
}
