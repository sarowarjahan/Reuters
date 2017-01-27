package SearchItems;

import PageFactorySearch.NewsSearch;
import Base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by sarowar on 1/14/17.
 */
public class TestSearchByDataProvider extends CommonMethods {

    //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Obama"} ,
                {"Trump"} ,
                {"Computer"},
        };
    }


    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{
        ReutersSearchUrl();
        NewsSearch reutersSearch = new NewsSearch(driver);
        sleepFor(2);
        //initialize Search page factory
        NewsSearch search = PageFactory.initElements(driver, NewsSearch.class);
        search.searchFor(data);
        sleepFor(2);
        search.clearSearchInput();


    }
}
