package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gunpreet/Downloads/chromedriver-mac-x64 8/chromedriver");
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.youtube.com/watch?v=sUSAOaPYbAk");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Actions actions = new Actions(driver);

            WebElement playButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Play (k)']")));
            playButton.click();
            actions.moveToElement(driver.findElement(By.xpath("//div//video[@class='video-stream html5-main-video']"))).perform();
            WebElement pauseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Pause (k)']")));
            pauseButton.click();

            WebElement fullScreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Full screen (f)']")));
            fullScreenButton.click();
            actions.moveToElement(driver.findElement(By.xpath("//div//video[@class='video-stream html5-main-video']"))).perform();

            WebElement exitFullScreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Exit full screen (f)']")));
            exitFullScreenButton.click();
            actions.moveToElement(driver.findElement(By.xpath("//div//video[@class='video-stream html5-main-video']"))).perform();

            WebElement theaterModeButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@title='Theater mode (t)'] | //button[@data-title-no-tooltip='Cinema mode']")));
            theaterModeButton.click();

            Thread.sleep(5000); 
         
            driver.quit();
    }
    
}
