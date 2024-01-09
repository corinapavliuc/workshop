import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    ChromeDriver driver;

    public RegistrationPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "gender-male")
    private WebElement genderMale;

    public void choseGenderMale(){
        genderMale.click();
    }
    //firstname
    @FindBy(id= "FirstName")
    private WebElement firstname;

    public void setFirstname(String firstnameValue){
        firstname.sendKeys(firstnameValue);
    }
    //lastname
    @FindBy(id= "LastName")
    private WebElement lastname;

    public void setLastname(String lastnameValue){
        lastname.sendKeys(lastnameValue);
    }
    //Email
    @FindBy(id= "Email")
    private WebElement email;

    public void setEmail(String emailValue){
        email.sendKeys(emailValue);
    }
    //Password
    @FindBy(id= "Password")
    private WebElement password;

    public void setPassword(String passwordValue){
        password.sendKeys(passwordValue);
    }
    //ConfirmPassword
    @FindBy(id= "ConfirmPassword")
    private WebElement confirmPassword;

    public void setConfirmPassword(String confirmPasswordValue){
        confirmPassword.sendKeys(confirmPasswordValue);
    }
    //register-button
    @FindBy(id= "register-button")
    private WebElement registerbutton;

    public void setRegisterbutton(){
        registerbutton.click();
    }
}
