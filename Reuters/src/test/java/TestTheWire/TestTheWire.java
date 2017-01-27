package TestTheWire;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.testng.annotations.Test;
import PageFactoryHome.TheWireLinks;
import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by sarowar on 1/16/17.
 */
public class TestTheWire extends TheWireLinks {

    @Test
    public void CanGoToWireLink() throws InterruptedException {
        List<WebElement> alllinks = getALlWireLinks();
        ClickOnDetailLink(alllinks);
        /*
        for(int i=1; i<list.size(); i++) {
            //System.out.println(list);
            clickByXpath(".//*[@id='mCSB_1_container']/article[" + i + "]/h3/a");
            navigateBack();
        }
        */
    }
}
