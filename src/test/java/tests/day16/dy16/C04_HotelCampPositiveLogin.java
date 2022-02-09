package tests.day16.dy16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelCampPositiveLogin {

    @Test(groups = "miniRegression")
    public void pozitifLoginTesti(){
        // 1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //		https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //		login butonuna bas

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        //	test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager");

        //	test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }

}
