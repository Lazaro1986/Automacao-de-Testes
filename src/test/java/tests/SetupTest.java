package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.AccountCreationPage;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.Browser;

import static org.junit.Assert.assertTrue;
import static utils.Browser.getCurrentDriver;
import static utils.Utils.getBaseUrl;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(getCurrentDriver().getCurrentUrl().contains(getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url!!");
    }

    @Test
    public void testCreatAnAccount(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        AccountCreationPage register = new AccountCreationPage();

        home.clickBtnLogin();

        login.fillEmailCreate();
        login.clickBtnSubmitCreate();

        register.fillCustomerFirstname();
        register.fillCustomerLastname();
        register.fillPasswd();
        register.fillAddress1();
        register.fillCity();
        register.fillId_state();
        register.fillPostcode();
        register.fillPhone_mobile();

        System.out.println("Final do form");
        register.clickBtnSubmitAccount();



        //validação final
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText()
                .contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");


    }

    @Test
    public void testPurchaseValidation(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CategoryPage category = new CategoryPage();

        home.clickBtnLogin();

        login.loginAlreadyRegistered();

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText()
                .contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");



        //Pesquisar um produto
        //clicar na categoria T-Shirts
        home.clickCategoryTShirts();

        //validar se ao clicar na categoria T-SHIRTS ocorre o direcionamento correto
        assertTrue(category.isPageTshirts());

        System.out.println("Validou página de categoria T-Shirts");

    }
}
