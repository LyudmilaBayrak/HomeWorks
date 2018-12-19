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

import java.util.List;


public class SearchJob {
    @Test
    public void Test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.linkedin.com");

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-email")));
        login.sendKeys("lyusiena83@gmail.com");
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-password")));
        password.sendKeys("password");
        WebElement buttonLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-submit")));
        buttonLogin.submit();

        driver.findElement(By.cssSelector("#jobs-tab-icon")).click();
        driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]")).click();
        driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]")).sendKeys("QA");
        driver.findElement(By.cssSelector("button.jobs-search-box__submit-button")).click();

        Thread.sleep(5000);
        List<WebElement> webElements = driver.findElements(By.cssSelector("ul.jobs-search-results__list li.occludable-update"));
        Assert.assertTrue(webElements.size() > 0);

        driver.close();
    }
}
