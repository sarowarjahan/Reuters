package PageFactoryHome;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/15/17.
 */
public class MarketTabInfo extends CommonAPI {

    WebDriver pageObjectDriver;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='lead_0']/span")
    })
    public static WebElement tabStocks;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='lead_1']/span")
    })
    public static WebElement tabBonds;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='lead_2']/span")
    })
    public static WebElement tabCurrencies;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='lead_3']/span")
    })
    public static WebElement tabCommo;

    public MarketTabInfo(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);

    }
}
