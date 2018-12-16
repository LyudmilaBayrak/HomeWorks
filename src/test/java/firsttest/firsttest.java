package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttest {
    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://google.com");

        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='q']")));
        input.sendKeys("wix");
        input.submit();

        WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#rso h3")));
        firstResult.click();

        WebElement wixLogo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-hook='header-wix-logo']")));
        Assert.assertTrue(wixLogo.isDisplayed());

        driver.close();
    }
}
