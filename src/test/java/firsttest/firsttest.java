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

            WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input")));
            input.sendKeys("wix");

            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input")));
            button.submit();

            WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")));
            firstResult.click();

            WebElement wixLogo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > header > nav > div._1I1I5 > a")));
            Assert.assertTrue(wixLogo.isDisplayed());
        }
}
