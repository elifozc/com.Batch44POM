package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {

    @Test
    public void test01() throws IOException {

        //ulkeler excelindeki Sayfa1 ve Sayfa2 deki satir sayilarini
        // ve kullanılan satir sayilarini bulun

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanilanSatirSAyisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println("1. sayfa satır sayısı :" + sayfa1SatirSayisi);
        System.out.println("fiziki kullanılan 1. sayfa satır sayısı :" + sayfa1FizikiKullanilanSatirSAyisi);
        //***************satır sayısı indexle döner*****************

        //********fiziki kullanılan satır sayısı ise sayma sayılarıyla döner*************


        System.out.println("===========================================");

        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanilanSatirSAyisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        System.out.println("2. sayfa satır sayısı :" + sayfa2SatirSayisi);
        System.out.println("fiziki kullanılan 2. sayfa satır sayısı :" + sayfa2FizikiKullanilanSatirSAyisi);

    }

}
