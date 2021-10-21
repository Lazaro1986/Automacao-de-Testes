package pageObjects;

import elementMapper.CartShippingPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartShippingPage extends CartShippingPageElementMapper {

    public CartShippingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickCheckboxTerms(){
        checkTerms.click();
    }

    public void clickBtnProcessCarrier(){
        processCarrier.click();
    }
}
