package TestTopNews;

import PageFactoryHome.TopNews;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by sarowar on 1/16/17.
 */
public class TestTopNews extends TopNews {

    @Test
    public void CanGoTopNewsDestailsPage() throws InterruptedException{

        List<WebElement> allTopNewsLInk = getAllTopNews();
        ClickOnTopNewsLink(allTopNewsLInk);
    }
}
