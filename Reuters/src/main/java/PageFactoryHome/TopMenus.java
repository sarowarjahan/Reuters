package PageFactoryHome;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/14/17.
 */
public class TopMenus extends CommonAPI {

    WebDriver pageObjectDriver;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-2']/a")
    })
    public static WebElement linkBusiness;
    public static String titleBusiness = "Business";

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-3']/a")
    })
    public static WebElement linkMarkets;
    public static String titleMarkets = "Markets";

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-4']/a")
    })
    public static WebElement linkWorld;
    public static String titleWorld = "World";

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-5']/a")
    })
    public static WebElement linkPolitics;
    public static String titlePolitics = "Politics";

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-6']/a")
    })
    public static WebElement linkTech;
    public static String titleTech = "Tech";

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-7']/a")
    })
    public static WebElement linkCommentary;
    public static String titleCommentary = "Columns";


    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='nav-item-11']/a")
    })
    public static WebElement linkPictures;
    public static String titlePictures = "Pictures";


    public TopMenus(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);

    }

}
