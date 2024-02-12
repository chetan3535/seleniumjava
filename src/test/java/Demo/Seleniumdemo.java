package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Seleniumdemo {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
  

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the website
            driver.get("https://www.amazon.in/");
            Thread.sleep(2000);
            // Find the element to click (for example, a button or a link)
            WebElement elementToEnter = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
            Thread.sleep(2000);
            // Click on the element
            elementToEnter.sendKeys("iphone");

            // Wait for a while to see the effect (you might want to use WebDriverWait in a real scenario)
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
}
