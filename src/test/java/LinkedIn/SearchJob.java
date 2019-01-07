package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class SearchJob {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void BeforeMethod() {
        driver = WebDriverStart.init();
        driver.get("https://www.linkedin.com");

        WebElement loginField = driver.findElement(By.cssSelector("#login-email"));
        loginField.sendKeys("lyusiena83@gmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("#login-password"));
        passwordField.sendKeys("password");
        WebElement loginButton = driver.findElement(By.cssSelector("#login-submit"));
        loginButton.submit();
    }

    @AfterMethod
    public void AfterMethod() {
        driver.close();
    }

    @Test
    public void SearchVacation() throws InterruptedException {

        WebElement vacationButton = driver.findElement(By.cssSelector("#jobs-tab-icon"));
        vacationButton.click();

        WebElement vacationSearch = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationSearch.click();

        WebElement vacationField = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationField.sendKeys("QA");

        WebElement SearchField = driver.findElement(By.cssSelector("button.jobs-search-box__submit-button"));
        SearchField.click();
        Thread.sleep(5000);
        List<WebElement> webElements = driver.findElements(By.cssSelector("ul.jobs-search-results__list li.occludable-update"));
        Assert.assertTrue(webElements.size() > 0);

    }


    @Test
    public void Data() throws InterruptedException {

        WebElement vacationButton = driver.findElement(By.cssSelector("#jobs-tab-icon"));
        vacationButton.click();

        WebElement vacationSearch = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationSearch.click();

        WebElement vacationField = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationField.sendKeys("QA");

        WebElement SearchField = driver.findElement(By.cssSelector("button.jobs-search-box__submit-button"));
        SearchField.click();
        WebElement buttonData = driver.findElement(By.cssSelector("h3.search-s-facet__name"));
        buttonData.click();
        WebElement buttonPeriod = driver.findElement(By.cssSelector("p.search-s-facet-value__text"));
        buttonPeriod.click();
        WebElement buttonApply = driver.findElement(By.cssSelector(
                "fieldset.search-s-facet__values.search-s-facet__values--is-floating.search-s-facet__values--f_TP button[data-control-name='filter_pill_apply']"));
        buttonApply.click();

        Thread.sleep(5000);
        List<WebElement> webElements = driver.findElements(By.cssSelector("ul.jobs-search-results__list li.occludable-update"));
        Assert.assertTrue(webElements.size() > 0);
    }

    @Test
    public void position() throws InterruptedException {

        WebElement vacationButton = driver.findElement(By.cssSelector("#jobs-tab-icon"));
        vacationButton.click();

        WebElement vacationSearch = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationSearch.click();

        WebElement vacationField = driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]"));
        vacationField.sendKeys("QA");

        WebElement SearchField = driver.findElement(By.cssSelector("button.jobs-search-box__submit-button"));
        SearchField.click();

        driver.findElement(By.cssSelector("form[aria-label='Должностной уровень'] button")).click();
        WebElement buttonApply = driver.findElement(By.cssSelector("fieldset.search-s-facet__values.search-s-facet__values--is-floating.search-s-facet__values--f_TP button[data-control-name='filter_pill_apply']"));
        buttonApply.click();
    }





}
