package PageFactorySubmitRequest;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/30/17.
 */
public class SubmitRequest extends CommonAPI {

    WebDriver pageObjectDriver;

    @FindBy(how = How.CSS, using = ".submit-a-request")
    public static WebElement requestLink;

    //Need Check Here give me null pointer

    public SubmitRequest(WebDriver driver){
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver,this);
    }
}
