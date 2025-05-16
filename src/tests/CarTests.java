package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.CartPage;

public class CarTests {
    private WebDriver driver;
    private HomePage home;
    private CartPage cart;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://juice-shop.herokuapp.com/#/");
        home = new HomePage(driver);
        cart = new CartPage(driver);
    }

    @Test
    public void testAddAndRemoveItemFromCart() {
        home.dismissBanners();
        home.addAppleJuiceToCart();
        home.goToCart();

        Assert.assertTrue(cart.isAppleJuicePresent(), "Apple Juice should be in the cart.");

        cart.removeAppleJuice();
        Assert.assertTrue(cart.isBasketEmpty(), "Basket should be empty after removing item.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
