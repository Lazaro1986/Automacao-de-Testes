package pageObjects;

import elementMapper.CartAddressPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartAddressPage extends CartAddressPageElementMapper {

    public CartAddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar no botão de confirmação de endereço")
    public void clickBtnProcessAddress(){
        processAddress.click();
    }

}
