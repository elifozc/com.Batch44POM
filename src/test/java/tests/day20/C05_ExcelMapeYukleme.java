package tests.day20;


import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.Map;

public class C05_ExcelMapeYukleme {

    @Test
    public void test01() throws IOException {


        // dosya yolu ve sayfa ismi verilen bie excel sheet'i map olarak kaydeden
        // reusable bir method olusturalim

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        System.out.println(ReusableMethodsExcel.mapOlustur(path,sayfaAdi));

        Map<String,String> ulkelerMap= ReusableMethodsExcel.mapOlustur(path,sayfaAdi);

        //olusturdugumuz map i kullanarak Turkey in bilgilerini yazdırın
        System.out.println(ulkelerMap.get("Turkey"));

        //Listede NetherLands oldugunu test edin
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
        //bu şekilde map de böyle bir key var mı diye test edebilirim











    }

}
