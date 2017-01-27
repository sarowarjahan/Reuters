package PageFactoryHome;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sarowar on 1/16/17.
 */
public class TopNews extends CommonAPI {

    public List<WebElement> getAllTopNews(){
        List<WebElement> topNewslist = new ArrayList<WebElement>();
        topNewslist = driver.findElements(By.cssSelector("section.top-module .story-content .story-title>a"));
        return topNewslist;
    }


    public void ClickOnTopNewsLink(List<WebElement> topNewslinks)throws InterruptedException{
        for(int i=1; i<topNewslinks.size(); i++){
            //System.out.println(topNewslinks.size());
            if(i == 1){
                clickByXpath(".//*[@id='topStory']/section/div[2]/h2//a");
                navigateBack();
            }else {

                clickByXpath(".//*[@id='hp-top-news-top']/section/div/article[" + (i - 1) + "]/div/h3/a");
                navigateBack();
            }

        }
    }
}
