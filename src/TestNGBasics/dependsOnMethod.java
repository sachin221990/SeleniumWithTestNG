package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod {

    @Test(dependsOnMethods = {"selectRoundTrip","selectModule"})
    public void enterReturnDate(){
        System.out.println("I am able select return date..");
    }
    @Test
    public void selectRoundTrip(){
        //Assert.assertEquals("20","21");
        System.out.println("I have selected Round Trip...");
    }
    @Test(priority = 1)
    public void selectModule(){
        //Assert.assertEquals("20","21");
        System.out.println("I have selected Flights Module...");
    }
}
