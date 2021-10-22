package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    //Criação de cadastro de usuário não cadastrado previamente
    Random random = new Random();
    String emailRandom = "guerreirosmisticos"+random.nextInt()+"@kaah.com";

    @Step("Preencher campo de novo email")
    public void fillEmailCreate(){
        email_create.sendKeys(emailRandom);
    }

    @Step("Clicar no botão para criar novo usuário")
    public void clickBtnSubmitCreate(){
        SubmitCreate.click();
    }

    //Login de usuário já cadastrado
    @Step("Preencher campo de email já cadastrado")
    public void fillEmail(){
        email.sendKeys("acucar@mascavo.com");
    }
    @Step("Preencher campo de senha já cadastrada")
    public void fillPasswd(){
        passwd.sendKeys("12345");
    }
    @Step("Clicar no botão de login de usuário já cadastrado")
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public void loginAlreadyRegistered(){
        fillEmail();
        fillPasswd();
        clickBtnSubmitLogin();
    }


}
