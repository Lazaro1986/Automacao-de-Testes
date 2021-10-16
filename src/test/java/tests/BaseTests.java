package tests;

import org.junit.After;
import org.junit.Before;
import utils.Browser;

import static utils.Utils.getBaseUrl;

public class BaseTests {

    @Before
    public void setup(){
        Browser.loadPage(getBaseUrl());
    }

    @After
    public void tearDown(){
        Browser.close();
    }
}
