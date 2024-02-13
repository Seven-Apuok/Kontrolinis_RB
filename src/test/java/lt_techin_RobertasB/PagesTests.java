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
        if (driver.getPageSource().contains("Product successfully added to your shopping cart")) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
        mainPage.clickProceed();
    }

    @Test
    public void Sweater() {
        mainPage = new MainPage(driver);
        mainPage.searcImputWindow(nameS);
        mainPage.enterKey();
        mainPage.clickSweater();
        mainPage.clickWishButton();
        mainPage.clickCacel();
        mainPage.clickSize();
        mainPage.clickSizeTipeM();
        mainPage.clickCart();

        String expectedHeading = "Product successfully added to your shopping cart";
        String heading = driver.findElement(By.cssSelector("#myModalLabel")).getText();
        if(expectedHeading.equalsIgnoreCase(heading))
            System.out.println("The expected heading is same as actual heading --- "+heading);
        else
            System.out.println("The expected heading doesn't match the actual heading --- "+heading);

        mainPage.clickProceed();
        if (driver.getCurrentUrl().contains("20%")) {System.out.println("yes");}else {System.out.println("no");}



    }
}