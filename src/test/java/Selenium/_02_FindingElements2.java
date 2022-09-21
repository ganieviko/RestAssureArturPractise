package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.cssSelector("#collapseOne div[class='panel-body item-list']"));
        for (WebElement element : elements){
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
