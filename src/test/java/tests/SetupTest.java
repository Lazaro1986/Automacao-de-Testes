package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;

import static org.junit.Assert.assertTrue;


@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests {

    @Test
    @Story("Criar um cadastro de usuário")
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
    @Story("Realizar uma compra no site")
    public void testPurchaseValidation(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();
        CartAddressPage cartAddress = new CartAddressPage();
        CartShippingPage cartShipping = new CartShippingPage();
        CartPaymentPage cartPayment = new CartPaymentPage();
        CartOrderSummaryPage cartOrder = new CartOrderSummaryPage();

        home.clickBtnLogin();

        login.loginAlreadyRegistered();

        //clicar na categoria T-Shirts
        home.clickCategoryTShirts();

        //Acessar página do produto
        category.clickProductAddToProductPage();

        //Guardar o nome do produto desejado
        String initialProductName = pdp.getProductNamePDP();

        //Adicionar o produto ao carrinho
        pdp.clickButtonAddToCart();
        pdp.clickButtonModalProceedToCheckout();

        //Proceder com a compra
        cart.clickBtnProceedToCheckout();

        //Clicar no botão PROCESS ADDRESS na página CartAddress
        cartAddress.clickBtnProcessAddress();

        //Clicar no botão PROCEED TO CHECKOUT na página CartShipping
        cartShipping.clickCheckboxTerms(); //clicar na checkbox dos termos
        cartShipping.clickBtnProcessCarrier();

        //Guardar o nome do produto para validação
        String endProductName = cartPayment.getProductNamePayment();
        //escolher forma de pagamento na página Payment
        cartPayment.clickBtnPaymentMethod();

        //Confirmar ordem de compra
        cartOrder.clickBtnConfirmOrder();

        //Validar se o produto comprado está correto
        assertTrue(initialProductName.equals(endProductName));

        //Validar compra no site
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText()
                .contains("ORDER CONFIRMATION"));
        System.out.println("Validou minha compra no site");

    }

}
