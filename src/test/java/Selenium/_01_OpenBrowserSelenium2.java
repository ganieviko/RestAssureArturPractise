package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_OpenBrowserSelenium2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Artur");
//        driver.findElement(By.cssSelector("button[aria-label='No thanks']")).click();
        driver.findElement(By.cssSelector("div[class='gb_e gb_f']>a[class='gb_d']")).click();
        driver.findElement(By.cssSelector("div[class='header__container']>a")).click();
    }
}
