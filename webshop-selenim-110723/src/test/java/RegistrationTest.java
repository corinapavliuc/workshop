import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class RegistrationTest  extends BaseTest {

    @Test
    public void successRegistration() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.choseGenderMale();

        //assert that text "Your registration completed" is displayed
        //firstname
        registrationPage.setFirstname("Jack");
        //lastname
        registrationPage.setLastname("Jackson");

        //Email
       String uniqueEmail ="user_"+ UUID.randomUUID()+"@example.com";
       registrationPage.setEmail(uniqueEmail);
        //Password
       registrationPage.setPassword("Jack12345!");
       registrationPage.setConfirmPassword("Jack12345!");
       registrationPage.setRegisterbutton();
        //asserEquals
        SuccessLoginPage successLoginPage = new SuccessLoginPage(driver);
        assertEquals("Your registration completed",successLoginPage.getSuccessLoginText());

    }
}