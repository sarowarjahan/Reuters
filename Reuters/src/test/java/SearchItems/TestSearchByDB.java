package SearchItems;

import Base.CommonAPI;
import PageFactorySearch.NewsSearch;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ConnectDB;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sarowar on 1/27/17.
 */
public class TestSearchByDB extends CommonMethods {

    @Test
    public void searchUsingDB()throws Exception,InterruptedException{
        ReutersSearchUrl();
        //initialize Search page factory
        NewsSearch search = PageFactory.initElements(driver, NewsSearch.class);
        //Read Data From Database
        ConnectDB db = new ConnectDB();
        List<String> st = new ArrayList<String>();
        st = db.SelectDataFromTable("news", "news_keyword");

        for(String data:st) {
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
        }

    }
}
