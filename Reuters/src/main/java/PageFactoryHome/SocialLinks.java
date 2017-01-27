package PageFactoryHome;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/16/17.
 */
public class SocialLinks extends CommonAPI {
    WebDriver pageObjectDriver;

    @FindBy(css=".follow-header-button.follow-header-twitter")
    public WebElement twitterLink;

    @FindBy(css=".follow-header-button.follow-header-facebook")
    public WebElement facebookLink;

    @FindBy(css=".follow-header-button.follow-header-linkedin")
    public WebElement linkedinLink;

    public SocialLinks(WebDriver driver){
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver,this);

    }


}
