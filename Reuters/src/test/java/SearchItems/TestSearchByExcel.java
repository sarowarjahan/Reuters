package SearchItems;

import Base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import dataToSearch.ItemToBeSearched;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by sarowar on 1/16/17.
 */
public class TestSearchByExcel extends CommonMethods {

    @Test
    public void search()throws IOException,InterruptedException{
        ReutersSearchUrl();
        //Create instance of Excel file reader class
        ItemToBeSearched itemsToBeSearched = new ItemToBeSearched();
        //Page Factory class init
        PageFactorySearch.NewsSearch search = PageFactory.initElements(driver, PageFactorySearch.NewsSearch.class);
        //Read data from Excel File.
        String [] value = itemsToBeSearched.getData();
        //Running for each loop
        for(int i=1; i<value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }

}
