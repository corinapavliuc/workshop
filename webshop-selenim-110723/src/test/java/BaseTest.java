import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    ChromeDriver driver;
    String Base_URL = "https://demowebshop.tricentis.com/register";


    @Before

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tel-ran.de\\Downloads\\chromedriver-win64\\chromedriver-win64" + "\\chromedriver.exe");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver = new ChromeDriver();
        driver.get(Base_URL);

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}

