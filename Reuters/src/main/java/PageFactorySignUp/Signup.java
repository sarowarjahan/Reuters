package PageFactorySignUp;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by sarowar on 1/16/17.
 */
public class Signup extends CommonAPI{
    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "html/body/header/div/nav/a[3]")
    public static WebElement signInLink;

    @FindBy(how = How.CSS, using = ".sign_up.question>a")
    public static WebElement signUpLink;

    @FindBy(how = How.CSS, using = ".modal.signin")
    public static WebElement iFrame;

    public Signup(WebDriver driver){
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver,this);
    }
}
