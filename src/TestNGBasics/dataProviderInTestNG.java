package TestNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderInTestNG {

    //Dataprovider will be used when we have limited or 10 to 15 datasets
    //We need to read data from excel and use DataProvider when we have more than 100 data sets

    @Test(dataProvider = "testData")
    public void method1(String username, String password){
        System.out.println("Username is: "+username);
        System.out.println("Password is: "+password);
    }

    @Test(invocationCount = 5)
    public void method2(){
        System.out.println("Username is: "+"username");
        System.out.println("Password is: "+"password");
    }

    @DataProvider
    public Object[][] testData() {
        Object[][] myData = new Object[3][2];
        String str="User1";
        // Enter data to row 0 column 0
        myData[0][0] = str;
        // Enter data to row 0 column 1
        myData[0][1] = "Pwd1";
        // Enter data to row 0column 2
        //myData[0][2] = "Test111";
        // Enter data to row 0 column 2
        myData[1][0] = "User2";
        // Enter data to row 0 column 2
        myData[1][1] = "Pwd2";
        // Enter data to row 0 column 2
        //myData[1][2] = "Test111111";
        // return new Object[][] { { "data one" }, { "data two" }, { "data three" } };
        // Enter data to row 0 column 2
        myData[2][0] = "User3";
        // Enter data to row 0 column 2
        myData[2][1] = "Pwd3";
        return myData;
    }
}
