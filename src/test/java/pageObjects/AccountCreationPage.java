package pageObjects;

import elementMapper.AccountCreationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AccountCreationPage extends AccountCreationPageElementMapper {

    public AccountCreationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillCustomerFirstname(){
        customer_firstname.sendKeys("Paul");
    }

    public void fillCustomerLastname(){
        customer_lastname.sendKeys("Yung");
    }

    public void fillPasswd(){
        passwd.sendKeys("12345");
    }

    public void fillAddress1(){
        address1.sendKeys("Outer Rd");
    }

    public void fillCity(){
        city.sendKeys("Eureka");
    }

    public void fillId_state(){
        id_state.sendKeys("missouri");
    }

    public void fillPostcode(){
        postcode.sendKeys("63025");
    }

    public void fillPhone_mobile(){
        phone_mobile.sendKeys("999999999");
    }

    public void clickBtnSubmitAccount(){
        submitAccount.click();
    }

}
