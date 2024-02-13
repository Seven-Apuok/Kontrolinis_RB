package lt_techin_RobertasB;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class PagesTests extends SetingsTest {
    MainPage mainPage;
    CSVFileReader csv;

    String nameT = "HUMMINGBIRD PRINTED T-SHIRT";
    String nameS = "HUMMINGBIRD PRINTED SWEATER";

    @Test
    public void itemsTSHIRT() {
        mainPage = new MainPage(driver);
        mainPage.searcImputWindow(nameT);
        mainPage.enterKey();
        mainPage.clickTShirt();
        mainPage.clickWishButton();
        mainPage.clickCacel();
        mainPage.clickSize();
        mainPage.clickSizeTipeXL();
        mainPage.clickCart();
if(driver.findElement(By.xpath("/html//h4[@id='myModalLabel']")).equals("Product successfully added to your shopping cart")){
    System.out.println("correct");
}
else {System.out.println("not correct");}
       mainPage.clickProceed();
    }
    @Test
   public void Sweater(){
        mainPage = new MainPage(driver);
        mainPage.searcImputWindow(nameS);
        mainPage.enterKey();
        mainPage.clickSweater();
        mainPage.clickWishButton();
        mainPage.clickCacel();
        mainPage.clickSize();
        mainPage.clickSizeTipeM();
        mainPage.clickCart();
        driver.getPageSource().contains("Product successfully added to your shopping cart");
            mainPage.clickProceed();}

    }
