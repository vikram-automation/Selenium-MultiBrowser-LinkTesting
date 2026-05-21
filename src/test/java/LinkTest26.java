import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class LinkTest26 {
    public  static  void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        WebElement aboutel = driver.findElement(By.linkText("About"));
        aboutel.click();
        String expectedurl = "https://qabloglist.ccbp.tech/about";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturl = driver.getCurrentUrl();
        if(expectedurl.equals(currenturl)){
            System.out.println("Navigated to About Page");
            System.out.println(driver.getTitle());
        }else{
            System.out.println("Navigation to About Page Failed");
        }
        WebElement contactel = driver.findElement(By.linkText("Contact"));
        contactel.click();
        String expectedurl2 = "https://qabloglist.ccbp.tech/contact";
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.urlToBe(expectedurl2));
        String currenturl2 = driver.getCurrentUrl();
        if(expectedurl2.equals(currenturl2)){
            System.out.println("Navigated to Contact Page");
            System.out.println(driver.getTitle());
        }else{
            System.out.println("Navigated to Contact Page Failed");
        }
        WebElement homepageel = driver.findElement(By.linkText("Home"));
        homepageel.click();
        String expectedurl3 = "https://qabloglist.ccbp.tech/";
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.urlToBe(expectedurl3));
        String currenturl3 = driver.getCurrentUrl();
        if(expectedurl3.equals(currenturl3)){
            System.out.println("Navigated to Home Page");
            System.out.println(driver.getTitle());
        }else{
            System.out.println("Navigated to Home Page Failed");
        }
        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        WebDriverWait waitDriver2 = new WebDriverWait(driver2, Duration.ofSeconds(10));
        driver2.get("https://qacompany.ccbp.tech/");
        WebElement homeel = driver2.findElement(By.linkText("Home"));
        homeel.click();
        WebElement aboutusel = driver2.findElement(By.partialLinkText("us"));
        aboutusel.click();
        WebElement contactusel = driver2.findElement(By.partialLinkText("Contact"));
        contactusel.click();
        System.out.println(driver2.getTitle());
        driver2.quit();

        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://qatraveldest.ccbp.tech/");
        WebElement beachgatewayel = driver3.findElement(By.tagName("input"));
        beachgatewayel.click();
        WebElement adventuretrekel = driver3.findElement(By.id("adventure"));
        adventuretrekel.click();
        WebElement cityexplorationel = driver3.findElement(By.id("city"));
        cityexplorationel.click();
        WebElement culturalexpel = driver3.findElement(By.id("cultural"));
        culturalexpel.click();
        System.out.println(driver3.getTitle());
        driver3.quit();


    }
}
