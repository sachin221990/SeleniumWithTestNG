package TestNGBasics;

import org.testng.annotations.*;

public class prioritiesInTestNG {

    @BeforeMethod
    public void method8(){
        System.out.println("prioritiesInTestNG_Method8_Before_Method");
        //Click on flight type
    }

    @AfterMethod
    public void method9(){
        System.out.println("prioritiesInTestNG_Method9_After_Method");
        //Click on flight type
    }

    @BeforeClass
    public void method10(){
        System.out.println("prioritiesInTestNG_Method10_Before_Class");
        //Click on flight type
    }

    @AfterClass
    public void method11(){
        System.out.println("prioritiesInTestNG_Method11_After_Class");
        //Click on flight type
    }

    @BeforeTest
    public void method12(){
        System.out.println("prioritiesInTestNG_Method12_Before_Test");
        //Click on flight type
    }

    @AfterTest
    public void method13(){
        System.out.println("prioritiesInTestNG_Method13_After_Test");
        //Click on flight type
    }

    @Test()
    public void method1(){
        System.out.println("Test1_Method1");
    }

    @Test(priority = 2)
    public void method2(){
        System.out.println("Test1_Method2");
    }

    @Test(priority = -1)
    public void method3(){
        System.out.println("Test1_Method3");
    }
}
