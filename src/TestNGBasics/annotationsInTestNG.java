package TestNGBasics;

import org.testng.annotations.*;

public class annotationsInTestNG {

    //@BeforeSuite
    //@BeforeTest
    //@BeforeClass
    //@BeforeMethod
    //@Test
    //@AfterMethod
    //@AfterClass
    //@AfterTest
    //@AfterSuite

    @BeforeSuite
    public void method() {
        System.out.println("annotationsInTestNG_method");
        //Browser Initiations
        //OPEN URL
    }

    @BeforeTest
    public void method4(){
        System.out.println("annotationsInTestNG_Method4");
        //Set the size window
    }

    @BeforeClass
    public void method6(){
        System.out.println("annotationsInTestNG_Method6");
        //Click on flight module
    }

    @BeforeMethod
    public void method8(){
        System.out.println("annotationsInTestNG_Method8");
        //Click on flight type
    }

    @Test(groups= {"SmokeTest"})
    public void method2(){
        System.out.println("annotationsInTestNG_Method2");
        //
    }

    @Test
    public void method1(){
        System.out.println("annotationsInTestNG_Method1");
    }

    @AfterMethod
    public void method9(){
        System.out.println("annotationsInTestNG_Method9");
    }

    @AfterClass
    public void method7(){
        System.out.println("annotationsInTestNG_Method7");
    }

    @AfterTest
    public void method5(){
        System.out.println("annotationsInTestNG_Method5");
    }

    @AfterSuite
    public void method3() {
        System.out.println("annotationsInTestNG_method3");
    }
}
