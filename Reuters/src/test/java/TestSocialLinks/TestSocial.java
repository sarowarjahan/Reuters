package TestSocialLinks;

import PageFactoryHome.SocialLinks;
import Base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/16/17.
 */
public class TestSocial extends CommonAPI {

    @Test(priority = 1)
    public void CanGoToTwitter(){
        SocialLinks socialLinks = new SocialLinks(driver);
        socialLinks.twitterLink.click();
    }
    @Test(priority = 2)
    public void CanGoToFacebook(){
        SocialLinks socialLinks = new SocialLinks(driver);
        socialLinks.facebookLink.click();
    }
    @Test(priority = 3)
    public void CanGoToLinkdin(){
        SocialLinks socialLinks = new SocialLinks(driver);
        socialLinks.linkedinLink.click();

    }
}
