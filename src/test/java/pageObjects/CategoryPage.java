package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }



    public String getAuthenticationPageTShirts(){
        return nameCategoryTShirts.getText();
    }

    public boolean isPageTshirts() {
        return getAuthenticationPageTShirts().contains("T-SHIRTS");
    }



    //Acessar a página do produto

    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    public String getProductNameCategory() {
        return productNameCategory.getText();
    }


}
