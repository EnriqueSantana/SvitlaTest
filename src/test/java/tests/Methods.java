package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Methods{
    WebDriver driver;

    public WebDriver getURl (String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTANA\\Documents\\chromedriver.exe");
        driver=new ChromeDriver();
        driver. manage().window().maximize();
        driver.navigate(). to(url);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;
    }
    public void write (String locator, String data){
        driver.findElement(By.xpath(locator)).sendKeys(data);
    }
    public void click (String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByName (String locator){
        driver.findElement(By.name(locator)).click();
    }
    public void closeBrowser(){
        driver.close();
    }
}
