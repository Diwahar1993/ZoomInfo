package Learnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SampleSelenium {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.example.com");

        //WebElement element = fluentWaitForElement(driver, By.id("someElementId"), Duration.ofSeconds(30));

        driver.quit();
    }
}
