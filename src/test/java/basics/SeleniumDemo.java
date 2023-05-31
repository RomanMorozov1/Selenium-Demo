package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");


        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new SafariDriver();
       // System.setProperty();


       WebDriver driver=null;

        try {

            driver = new ChromeDriver();
            driver.get("https://www.duotech.io/");


       // driver.wait(10);







//driver.close();
        String expected = "Software SET Automation Engineer program | SET | QA School | Software Testing";
     String actualTitle = driver.getTitle();

//        if (actualTitle.equalsIgnoreCase( expected)){
//            System.out.println("Test Passed");
//
//        }else {
//            System.out.println("Test failed");
//            System.out.println("Expested "+ expected);
//            System.out.println("Actual" + actualTitle);
//        }

        Assert.assertEquals(actualTitle, expected);
        }finally {


        driver.quit();
        }

       // System.out.println("Test Pass");






    }
}
