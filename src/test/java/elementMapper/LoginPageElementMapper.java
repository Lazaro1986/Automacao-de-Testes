package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    public WebElement email_create;

    @FindBy(css = ".btn[name=SubmitCreate]")
    public WebElement SubmitCreate;

    public WebElement email;

    public WebElement passwd;

    public WebElement SubmitLogin;
}
