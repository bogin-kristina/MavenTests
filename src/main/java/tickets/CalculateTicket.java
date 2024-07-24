package tickets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateTicket {
    private double basePrice;
    private int age;


    public CalculateTicket(double basePrice, int age) {
        this.basePrice = basePrice;
        this.age = age;
    }

    public double getPrice(){
        if(age <= 2){
            return 0;
        }
        else if(age <= 12){
            return 0.5 * basePrice;
        }
        else if(age > 65){
            return 0.8 * basePrice;
        }
        return basePrice;
    }

}