package TestRequestPage;

import PageFactorySubmitRequest.SubmitRequest;
import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/30/17.
 */
public class TestRequestForm extends CommonMethods {
    @Test(priority = 1)
    public void CanIGoToRequestPage() throws InterruptedException {
        ReutersRequestSubmitPage();
       // SubmitRequest subrequest = new SubmitRequest(driver);
        submitForm();
        //sleepFor(2);

    }
}
