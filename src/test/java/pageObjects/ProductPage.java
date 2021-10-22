package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNamePDP(){
        return productNamePDP.getText();
    }
    @Step("Adicionar produto ao carrinho de compras")
    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }
    @Step("Confirmar produto no Modal para o carrinho de compras")
    public void clickButtonModalProceedToCheckout(){
        buttonModalProceedToCheckout.click();
    }

}
