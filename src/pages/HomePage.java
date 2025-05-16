package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By cookieDismiss = By.cssSelector(".cc-btn.cc-dismiss");
    private final By welcomeDismiss = By.cssSelector("button[aria-label='Close Welcome Banner']");
    private final By addAppleJuiceBtn = By.xpath("//mat-card[contains(., 'Apple Juice')]" +
            "//button[@aria-label='Add to Basket']");
    private final By basketBtn = By.cssSelector("button[routerlink='/basket']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void dismissBanners() {
        try {
            click(cookieDismiss);
            click(welcomeDismiss);
        } catch (Exception ignored) {}
    }

    public void addAppleJuiceToCart() {
        click(addAppleJuiceBtn);
    }

    public void goToCart() {
        click(basketBtn);
    }
}
