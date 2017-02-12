package TestSignInUser;
import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by sarowar on 1/16/17.
 */
public class TestSignIn extends CommonMethods {
    @Test(priority = 1)
    public void SignInByBalankCredentials() throws InterruptedException {
        ReutersSignUpPage();
        Login("","" );
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH("html/body/div[1]/div/div[1]/div[1]"));
    }

    @Test(priority = 2)
    public void SignInByBlankPassword() throws InterruptedException{
        ReutersSignUpPage();
        Login(ReuterUserName,"" );
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH("html/body/div[1]/div/div[1]/div[1]"));

    }

    @Test(priority = 3)
    public void SignInByBlankUsername() throws InterruptedException{
        ReutersSignUpPage();
        Login("", ReuterPassword);
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH("html/body/div[1]/div/div[1]/div[1]"));

    }

    @Test(priority = 4)
    public void SignInByInCorrectUsername() throws InterruptedException{
        ReutersSignUpPage();
        Login("incorrect@email.com", ReuterPassword);
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH("html/body/div[1]/div/div[1]/div[1]"));

    }

    @Test(priority = 5)
    public void SignInByInCorrectPassword() throws InterruptedException{
        ReutersSignUpPage();
        Login(ReuterUserName, "IncorrectPassword");
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH("html/body/div[1]/div/div[1]/div[1]"));

    }

    @Test(priority = 6)
    public void SignInByCorrectCredentials() throws InterruptedException{
        ReutersSignUpPage();
        Login(ReuterUserName, ReuterPassword);
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH(".//*[@id='user']/div[1]"));
        ReuterLogout();

    }
}
