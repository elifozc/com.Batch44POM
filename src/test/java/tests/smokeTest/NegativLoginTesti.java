package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativLoginTesti {
    //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //                - yanlisSifre
    //                - yanlisKulllanici
    //                - yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et



    HotelMyCampPage hotelMyCampPage;

    @Test(priority = 1)
    public void yanlisSifreTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

    }

    @Test(priority = 2)
    public void yanlisUsernameTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

    }


    @Test(priority = 3)
    public void yanlisPasswordveUsernameTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

        Driver.closeDriver();
    }


}
