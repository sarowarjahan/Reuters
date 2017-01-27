package TestMarketTab;

import PageFactoryHome.MarketTabInfo;
import Base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/15/17.
 */
public class TestTabs extends CommonAPI {

    @Test(priority = 1)
    public void testStockTabsData(){
        MarketTabInfo tabinfo = new MarketTabInfo(driver);
        tabinfo.tabStocks.click();
    }

    @Test(priority = 2)
    public void testBondTabsData(){
        MarketTabInfo tabinfo = new MarketTabInfo(driver);
        tabinfo.tabBonds.click();
    }

    @Test(priority = 3)
    public void testCurrenciesTabsData(){
        MarketTabInfo tabinfo = new MarketTabInfo(driver);
        tabinfo.tabCurrencies.click();
    }

    @Test(priority = 4)
    public void testCommoTabsData(){
        MarketTabInfo tabinfo = new MarketTabInfo(driver);
        tabinfo.tabCommo.click();
    }

}
