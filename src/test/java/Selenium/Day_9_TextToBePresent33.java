package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day_9_TextToBePresent33 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get( "https://css-tricks.com/examples/DynamicPage/#index.php" );

        System.out.println(driver.findElement(By.id("guts")).getText());

        driver.findElement(By.cssSelector("[href=\"about.php\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("guts"), "About")); // implicit wait cannot check invisibility

        System.out.println(driver.findElement(By.id("guts")).getText());

        driver.quit();

//        public void getscreenshot() throws Exception
//        {
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            //The below method will save the screen shot in d drive with name "screenshot.png"
//            FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
//        }
    }
}
