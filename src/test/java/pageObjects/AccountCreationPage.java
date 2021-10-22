package pageObjects;

import elementMapper.AccountCreationPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AccountCreationPage extends AccountCreationPageElementMapper {

    public AccountCreationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencher campo de nome")
    public void fillCustomerFirstname(){
        customer_firstname.sendKeys("Paul");
    }
    @Step("Preencher campo de sobrenome")
    public void fillCustomerLastname(){
        customer_lastname.sendKeys("Yung");
    }
    @Step("Preencher campo de senha")
    public void fillPasswd(){
        passwd.sendKeys("12345");
    }
    @Step("Preencher campo de endereço")
    public void fillAddress1(){
        address1.sendKeys("Outer Rd");
    }
    @Step("Preencher campo de cidade")
    public void fillCity(){
        city.sendKeys("Eureka");
    }
    @Step("Preencher campo de estado")
    public void fillId_state(){
        id_state.sendKeys("missouri");
    }
    @Step("Preencher campo de postal")
    public void fillPostcode(){
        postcode.sendKeys("63025");
    }
    @Step("Preencher campo de telefone")
    public void fillPhone_mobile(){
        phone_mobile.sendKeys("999999999");
    }
    @Step("Clicar no botão de gerar novo cadastro")
    public void clickBtnSubmitAccount(){
        submitAccount.click();
    }

}
