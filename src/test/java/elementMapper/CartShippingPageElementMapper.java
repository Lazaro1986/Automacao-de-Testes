package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartShippingPageElementMapper {

    @FindBy(css = ".checkbox #cgv")
    public WebElement checkTerms;

    public WebElement processCarrier;
}
