package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    Random random = new Random();
    String emailRandom = "guerreirosmisticos"+random.nextInt()+"@kaah.com";

    public void fillEmailCreate(){
        email_create.sendKeys(emailRandom);
    }

    public void clickBtnSubmitCreate(){
        SubmitCreate.click();
    }

}
