package pageObjects;

import elementMapper.CartShippingPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartShippingPage extends CartShippingPageElementMapper {

    public CartShippingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Aceitar termos de compra")
    public void clickCheckboxTerms(){
        checkTerms.click();
    }
    @Step("Prosseguir compra")
    public void clickBtnProcessCarrier(){
        processCarrier.click();
    }
}
