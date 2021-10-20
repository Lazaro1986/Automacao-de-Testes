package pageObjects;

import elementMapper.LoginPageElementMapper;
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

    public void fillEmailCreate(){
        email_create.sendKeys(emailRandom);
    }

    public void clickBtnSubmitCreate(){
        SubmitCreate.click();
    }



    //Login de usuário já cadastrado
    public void fillEmail(){
        email.sendKeys("jcslazaro1986@gmail.com");
    }
    public void fillPasswd(){
        passwd.sendKeys("12345");
    }
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public void loginAlreadyRegistered(){
        fillEmail();
        fillPasswd();
        clickBtnSubmitLogin();
    }


}
