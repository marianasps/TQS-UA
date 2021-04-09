package ua.tqs;

// Generated by Selenium IDE
// import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeEach;
// import org.junit.Before;
// import org.junit.After;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.MatcherAssert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.seljup.SeleniumJupiter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

@ExtendWith(SeleniumJupiter.class)
public class Ex2Refactored {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp(ChromeDriver driver) {
    // driver = new ChromeDriver();
    this.driver=driver;
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void blazedemo() {
    driver.get("https://blazedemo.com/");
    driver.manage().window().setSize(new Dimension(1233, 1053));
    driver.findElement(By.cssSelector(".jumbotron > .container")).click();
    driver.findElement(By.cssSelector(".jumbotron > .container")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".jumbotron > .container"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h1"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h1"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h1")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("h1"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("fromPort")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("h3")).click();
    driver.findElement(By.cssSelector("h3")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h3"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h3")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("h3"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
    driver.findElement(By.cssSelector("h2")).click();
    driver.findElement(By.cssSelector("h2")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h2"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h2")).click();
    driver.findElement(By.cssSelector("h2")).click();
    driver.findElement(By.cssSelector("h2")).click();
    driver.findElement(By.cssSelector("h2")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h2"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h2")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Your flight from TLV to SFO has been reserved."));
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("sda");
    driver.findElement(By.id("address")).sendKeys("asdasd");
    driver.findElement(By.id("city")).sendKeys("sfds");
    driver.findElement(By.id("state")).sendKeys("adsas");
    driver.findElement(By.id("zipCode")).sendKeys("77");
    {
      WebElement dropdown = driver.findElement(By.id("cardType"));
      dropdown.findElement(By.xpath("//option[. = 'American Express']")).click();
    }
    /* // estava a dar um erro de sintaxe que não consegui resolver, então comentei
    {
      WebElement dropdown = driver.findElement(By.id("cardType"));
      dropdown.findElement(By.xpath("//option[. = 'Diner\'s Club']")).click();
    }
    */
    {
      WebElement dropdown = driver.findElement(By.id("cardType"));
      dropdown.findElement(By.xpath("//option[. = 'American Express']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("cardType"));
      dropdown.findElement(By.xpath("//option[. = 'Visa']")).click();
    }
    driver.findElement(By.id("creditCardNumber")).sendKeys("567890");
    driver.findElement(By.id("nameOnCard")).sendKeys("aaaa");
    driver.findElement(By.cssSelector(".checkbox")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("pre")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h1"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Thank you for your purchase today!"));
    assertThat(driver.getTitle(), is("BlazeDemo Confirmation"));
  }
}
