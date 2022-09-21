package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_8_Try_Catch5 {
    public static void main(String [] arg){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#start>button")).click();

        String finish = "";

        while (finish.equals("")) {
            try {
                finish = driver.findElement(By.id("finish")).getText();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        System.out.println(finish);

        driver.quit();
    }
}
