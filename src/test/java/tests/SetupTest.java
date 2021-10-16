package tests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static utils.Browser.getCurrentDriver;
import static utils.Utils.getBaseUrl;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(getCurrentDriver().getCurrentUrl().contains(getBaseUrl()));
        System.out.print("Abrimos o navegador e carregamos a url!!");
    }
}
