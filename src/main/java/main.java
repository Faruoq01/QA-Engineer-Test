import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args){

        // set chromium path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Employee\\src\\main\\resources\\chromedriver.exe");

        // Launch chrome
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to create page on a local host
        driver.get("http://127.0.0.1:8000/emp");

        // find the id text element input by its name
        WebElement id = driver.findElement(By.name("id"));
        id.sendKeys("11");

        // find employee name text element input by its name
        WebElement employeeName = driver.findElement(By.name("name"));
        employeeName.sendKeys("Faruk");

        // find employee email text element input by its name
        WebElement employeeEmail = driver.findElement(By.name("email"));
        employeeEmail.sendKeys("farukumar41@gmail.com");

        // find employee name text element input by its name
        WebElement phone = driver.findElement(By.name("Phone_Number"));
        phone.sendKeys("07067462329");

        // submit the form from any of the element
        id.submit();
    }
}
