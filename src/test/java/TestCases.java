import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners(ListenerTest.class)

public class TestCases {
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void Login() {
        driver.get("http://demo.guru99.com/V4/");
//        driver.manage().window().maximize();
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        driver.findElement(By.name("btnLogin")).click();
//        System.out.println(result.getTestClass());

    }

    @Test
    public void TestToFail(){
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
//        System.out.println(result.getStatus());
    }

    @AfterMethod
    public void afterMethod(ITestResult r){
        String result = "unknown";
        switch (r.getStatus()){
            case ITestResult.SUCCESS:
                result = "success";
                break;
            case ITestResult.FAILURE:
                result = "failure";
                break;
            case ITestResult.SKIP:
                result = "skipped";
                break;
        }
        System.out.println("Result is " + result);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
