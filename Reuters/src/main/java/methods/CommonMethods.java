package methods;

import Base.CommonAPI;
import PageFactorySignIn.Signin;

/**
 * Created by sarowar on 1/21/17.
 */
public class CommonMethods extends CommonAPI {

    boolean LogedIn = false;

    public void Login(String username, String password) throws InterruptedException {

        if(!LogedIn){
            Signin signin = new Signin(driver);
            signin.signInLink.click();
            driver.switchTo().frame(0);
            sleepFor(2);
            //signup.signUpLink.click();
            typeByXpath(".//*[@id='user_email']",username);
            typeByXpath(".//*[@id='user_password']",password);
            clickByXpath(".//*[@id='login-form']/input[6]");
        }

    }



    public void submitForm()throws InterruptedException{

        typeByCss("#request_anonymous_requester_email","sorowar230@gmail.com");
        typeByCss("#request_subject","This is a test Subject");
        typeByCss("#request_description","This is a test Description");
        sleepFor(6);
        upLoadFile("#request-attachments","/Users/sarowar/Desktop/important-link.rtf");
        sleepFor(6);
        clickByXpath(".//*[@id='new_request']/footer/input");
    }

    public void ReuterLogout() throws InterruptedException{

         LogedIn = true;

        if(LogedIn){
            clickByXpath(".//*[@id='user']/div[1]");
            sleepFor(2);
            clickByXpath(".//*[@id='user-menu']/a[4]");
        }
    }

    public void ReutersSearchUrl(){
        driver.get("http://www.reuters.com/search/");
    }

    public void ReutersSignUpPage(){driver.get("https://reuters.zendesk.com/hc/en-us");}
    public void ReutersRequestSubmitPage(){driver.get("https://reuters.zendesk.com/hc/en-us/requests/new");}
}
