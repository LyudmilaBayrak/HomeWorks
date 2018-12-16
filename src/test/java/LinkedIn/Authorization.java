package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Authorization {
    @Test
    public void SuccessfulLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.linkedin.com");

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-email")));
        login.sendKeys("lyusiena83@gmail.com");

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-password")));
        password.sendKeys("password");

        WebElement buttonlogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-submit")));
        buttonlogin.submit();

        WebElement topMenu = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#extended-nav")));
        Assert.assertTrue(topMenu.isDisplayed());

        driver.close();
    }
}
