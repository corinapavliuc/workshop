import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessLoginPage {
    WebDriver driver;
    public  SuccessLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//div[@class='result']")
    private WebElement successLoginText;

    public  String getSuccessLoginText(){
        return  successLoginText.getText();
    }
}
