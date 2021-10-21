package pageObjects;

import elementMapper.CartOrderSummaryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartOrderSummaryPage extends CartOrderSummaryPageElementMapper {

    public CartOrderSummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnConfirmOrder(){
        confirmOrder.click();
    }
}
