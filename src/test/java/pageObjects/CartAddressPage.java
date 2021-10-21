package pageObjects;

import elementMapper.CartAddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartAddressPage extends CartAddressPageElementMapper {

    public CartAddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnProcessAddress(){
        processAddress.click();
    }

}
