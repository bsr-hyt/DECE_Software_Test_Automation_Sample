package com.DECE_Software.pages;

import com.DECE_Software.utilities.BrowserUtils;
import com.DECE_Software.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);

    }
    public void clickOnButton_mtd(String string) {

        //   Driver.get().findElement(By.xpath("//area[@title='"+string+"']")).click();

        /* Burada üstteki click metodu bazı buttonlarda çalışmadığı için
        * aşağıdaki JavaScrypt kodu ile click yaptım*/

        WebElement button = Driver.get().findElement(By.xpath("//area[@title='" + string + "']"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", button);

    }
    public void sloganCheck_mtd(String expectedSlogan) {

        // Sloganlarda </br> konulduğu için alt satıra geçiyor. Bunun için burada getAttribute("innerHTML") kullanılarak verify edildi.
        String actualSlogan = Driver.get().findElement(By.cssSelector(".slogan")).getAttribute("innerHTML");
        System.out.println(actualSlogan);
        Assert.assertEquals(expectedSlogan, actualSlogan);
    }

}
