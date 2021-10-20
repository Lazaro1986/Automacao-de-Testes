package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPageElementMapper {

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    public WebElement customer_lastname;

    public WebElement passwd;

    public WebElement address1;

    public WebElement city;

    public WebElement id_state;

    public WebElement postcode;

    public WebElement phone_mobile;

    public WebElement submitAccount;

}
