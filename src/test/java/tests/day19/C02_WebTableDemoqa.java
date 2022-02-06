package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoqa {
    @Test
    public void test01(){

        //Bir Class olusturun D19_WebtablesHomework
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        DemoqaPage demoqaPage=new DemoqaPage();

        //  2. Headers da bulunan department isimlerini yazdirin
        System.out.println("baslık satırı elementi " +demoqaPage.baslikSatiriElementi.getText());

        //ikinci yontem olarak başlıkları bir Listeye koyabilirim
        //basliklarWebelementiListesi burdan da yazdırılabilir


        //  3. sutunun basligini yazdirin
        System.out.println("3.sütun başlığı "+demoqaPage.basliklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("========Tum Body========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("tablodaki data sayısı" + demoqaPage.tumDataWebelementList.size());
        //  6. Tablodaki satir sayisini yazdirin
        //  7. Tablodaki sutun sayisini yazdirin
        //  8. Tablodaki 3.kolonu yazdirin
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin



        Driver.closeDriver();

    }
}
