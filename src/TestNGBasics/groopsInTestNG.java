package TestNGBasics;

import org.testng.annotations.Test;

public class groopsInTestNG {

    @Test(groups= {"SmokeTest"})
    public void enterReturnDate(){
        System.out.println("I am able select return date.. Groups");
    }

    @Test
    public void selectRoundTrip(){
        //Assert.assertEquals("20","21");
        System.out.println("I have selected Round Trip... Groups");
    }

    @Test(groups= {"SmokeTest"})
    public void selectModule(){
        //Assert.assertEquals("20","21");
        System.out.println("I have selected Flights Module... Groups");
    }
}
