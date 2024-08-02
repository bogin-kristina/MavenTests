package unitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

public class UnitTestTickets {
    @Test
    public void calculatePrice_infant_freeTicket(){
        CalculateTicket infant = new CalculateTicket(400, 1);
        double price = infant.getPrice();
        Assert.assertEquals(price, 0.0);
    }

    @Test
    public void calculatePrice_child_50percentDiscountTicket(){
        CalculateTicket child = new CalculateTicket(400, 8);
        double price = child.getPrice();
        Assert.assertEquals(price, 200.0);
    }

    @Test
    public void calculatePrice_adult_fullPriceTicket(){
        CalculateTicket child = new CalculateTicket(400, 48);
        double price = child.getPrice();
        Assert.assertEquals(price, 400.0);
    }

    @Test
    public void calculatePrice_senior_20percentDiscountTicket(){
        CalculateTicket child = new CalculateTicket(400, 73);
        double price = child.getPrice();
        Assert.assertEquals(price, 320.0);
    }

    
}





