package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar botão login")
    public void clickBtnLogin(){
        login.click();
    }

    @Step("Clicar botão de categoria T-shirts")
    public void clickCategoryTShirts(){
        menuTshirts.click();
    }
}
