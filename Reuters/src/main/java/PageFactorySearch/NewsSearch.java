package PageFactorySearch;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/14/17.
 */
public class NewsSearch extends CommonAPI {
    WebDriver pageObjectDriver;


    @FindBy(how = How.XPATH, using = ".//*[@id='newsSearchField']")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using = ".//*[@id='newsSearch']/form/input[4]")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput() {
        searchInput.clear();
    }

    public NewsSearch(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);
    }

}
