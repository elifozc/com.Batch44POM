package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    //Bir page class ı açtığımızda ilk yapmamız gereken şey
    // parametresiz bir constructor oluşturup
    // bu constructor içinde PageFactory ile driver a ilk değer atamasını yapmak olmalıdır

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;






}
