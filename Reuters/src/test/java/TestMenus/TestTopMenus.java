package TestMenus;

import PageFactoryHome.TopMenus;
import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/14/17.
 */
public class TestTopMenus extends CommonAPI {


    @Test(priority = 1)
    public void testTopMenuBusiness(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkBusiness.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleBusiness));
    }

    @Test(priority = 2)
    public void testTopMenuMarkets(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkMarkets.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleMarkets));
    }

    @Test(priority = 3)
    public void testTopMenuWorld(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkWorld.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleWorld));
    }

    @Test(priority = 4)
    public void testTopMenuPolitics(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkPolitics.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titlePolitics));
    }

    @Test(priority = 5)
    public void testTopMenuTech(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkTech.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleTech));
    }

    @Test(priority = 6)
    public void testTopMenuCommentary(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkCommentary.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleCommentary));
    }

    @Test(priority = 7)
    public void testTopMenuPictures(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkPictures.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titlePictures));
    }



}
