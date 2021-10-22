package pageObjects;

import elementMapper.CategoryPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Ir para a página do produto")
    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

}