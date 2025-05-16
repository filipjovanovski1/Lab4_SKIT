package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private final By appleJuiceRow = By.xpath("//mat-row[contains(., 'Apple Juice')]");
    private final By removeAppleJuice = By.xpath("//mat-row[contains(., 'Apple Juice')]" +
            "//button[contains(@aria-label, 'Remove')]");
    private final By emptyBasket = By.xpath("//div[contains(text(), 'Your basket is empty')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAppleJuicePresent() {
        return isDisplayed(appleJuiceRow);
    }

    public void removeAppleJuice() {
        click(removeAppleJuice);
    }

    public boolean isBasketEmpty() {
        return isDisplayed(emptyBasket);
    }
}
