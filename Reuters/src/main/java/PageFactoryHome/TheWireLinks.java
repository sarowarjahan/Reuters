package PageFactoryHome;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sarowar on 1/16/17.
 */
public class TheWireLinks extends CommonAPI {

    public List<WebElement> getALlWireLinks() {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(".article-heading>a"));
        return list;
    }

    public void ClickOnDetailLink(List<WebElement> links)throws InterruptedException{
        for(int i=1; i<links.size(); i++){
            clickByXpath(".//*[@id='mCSB_1_container']/article["+i+"]/h3/a");
            navigateBack();
        }
    }

}
