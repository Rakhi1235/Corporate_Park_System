package Demo_01;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Demo_Chrome_run {

public static void main(String[] args) throws InterruptedException  {
// TODO Auto-generated method stub
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhond\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Wait for 3 seconds

driver.get("https://corporatepark.netlify.app/");

System.out.println(driver.getTitle());


driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anprdemopms@gmail.com");

driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Anpr@4321");


//sign in//
driver.findElement(By.xpath("//button[@type='submit']")).click();

//Detection page//click
driver.findElement(By.xpath("(//div[@role=\"button\"])[1]")).click();
//Detected page//
driver.findElement(By.xpath("//div[@class=\"MuiList-root css-183nexk\"]/a[1]")).click();

//Downlopad Excel//
driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-0\"]/button/p")).click();

//Filter Button//
driver.findElement(By.xpath("//div[@class=\"FilterOuterBox MuiBox-root css-0\"]/p")).click();

//License plate no field
driver.findElement(By.id("licence_plate_number")).sendKeys("MH1278HY7");

    //Start date time//
WebElement startDateTime = driver.findElement(By.xpath("//input[@name='start_datetime']")); startDateTime.click();
startDateTime.clear();startDateTime.sendKeys("10-07-2024 00:00");

    //End date time//
    WebElement endDateTime =driver.findElement(By.xpath("//input[@name='end_datetime']"));endDateTime.click();
    endDateTime.clear();endDateTime.sendKeys("14-05-2025 23:59");
   
   // IN/out//
   
    WebElement inOutDropdown = driver.findElement(By.xpath("//*[@id='in_out']"));
    inOutDropdown.click(); // Opens the dropdown
    //wait option to be visible//
   
    Thread.sleep(1000);
   
    //option//
    WebElement inOption = driver.findElement(By.xpath("//li[text()='In']"));
     inOption.click();
   
   //Vehical type// 
     WebElement vehicleddown = driver.findElement(By.id("vehicle-type"));
	     vehicleddown.click(); // Opens the dropdown
	     
	     
     
   //  System.out.println("Selected car value successfully");
	     
	    //option//
          
	       driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18opomv\"])[2]")).click();
	       driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18opomv\"])[3]")).click();
	       Thread.sleep(1000);
	      
	      WebElement okButton = driver.findElement(By.xpath("//button[normalize-space()='Ok']"));
	      okButton.click();
	     
	      
	      
	  	      
     //Camera//
    WebElement Cameraddown = driver.findElement(By.xpath("//label[@id='camera_name-label']"));
    Cameraddown.click(); // Opens the dropdown  
     
    Thread.sleep(1000);
   
   //Option
    WebElement Cameraoption = driver.findElement(By.xpath("//div[@id='camera_name']"));
    Cameraoption.click();
    WebElement Cameraoption1 = driver.findElement(By.xpath("//li[normalize-space()='camera2']"));
    Cameraoption1.click();
   
    
   //Apply
   // WebElement Applybutton = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
   // Applybutton.click();
    
    //Cancel
    WebElement Cancelbutton = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
    Cancelbutton.click();
   
 
    
    //partially detected//
   driver.findElement(By.xpath("//div[@class=\"MuiList-root css-183nexk\"]/a[2]")).click();
    
   // Download excel//
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[1]/div[2]/div/button/p")).click();
   
   driver.findElement(By.xpath("//div[@class=\"FilterOuterBox MuiBox-root css-0\"]/p")).click();
   
   
 //License plate no field
   driver.findElement(By.id("licence_plate_number")).sendKeys("MH1277787");

       //Start date time//
   WebElement startDateTime4 = driver.findElement(By.xpath("//input[@name='start_datetime']")); startDateTime4.click();
   startDateTime4.clear();startDateTime4.sendKeys("10-07-2024 00:00");

       //End date time//
       WebElement endDateTime5 =driver.findElement(By.xpath("//input[@name='end_datetime']"));endDateTime5.click();
       endDateTime5.clear();endDateTime5.sendKeys("14-05-2025 23:59");
      
      // IN/out//
      
       WebElement inOutDropdown9 = driver.findElement(By.xpath("//*[@id='in_out']"));
       inOutDropdown9.click(); // Opens the dropdown
       //wait option to be visible//
      
       Thread.sleep(1000);
      
       //option//
       WebElement inOption4 = driver.findElement(By.xpath("//li[text()='In']"));
        inOption4.click();
      
      //Vehical type// 
        WebElement vehicleddown7 = driver.findElement(By.id("vehicle-type"));
   	     vehicleddown7.click(); // Opens the dropdown
   	     
   	     
        
      //  System.out.println("Selected car value successfully");
   	     
   	    //option//
             
   	       driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18opomv\"])[2]")).click();
   	       driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18opomv\"])[3]")).click();
   	       Thread.sleep(1000);
   	      
   	      WebElement okButton8 = driver.findElement(By.xpath("//button[normalize-space()='Ok']"));
   	      okButton8.click();
   	     
   	      
   	      
   	  	      
        //Camera//
       WebElement Cameraddown2 = driver.findElement(By.xpath("//label[@id='camera_name-label']"));
       Cameraddown2.click(); // Opens the dropdown  
        
       Thread.sleep(1000);
      
      //Option
       WebElement Cameraoption3 = driver.findElement(By.xpath("//div[@id='camera_name']"));
       Cameraoption3.click();
       WebElement Cameraoption4 = driver.findElement(By.xpath("//li[normalize-space()='camera2']"));
       Cameraoption4.click();
      
       
      //Apply
      // WebElement Applybutton = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
      // Applybutton.click();
       
       //Cancel
       WebElement Cancelbutton5 = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
       Cancelbutton5.click();
      
    
   
   
    
    //Parking page//click
     driver.findElement(By.xpath("(//div[@role=\"button\"])[2]")).click();
       
      
       
    //parking dropdwon//
        
        WebElement parkingText = driver.findElement(By.xpath("//*[normalize-space()='Available Parking']"));

        parkingText.click();
        
        
        
        WebElement payAndParkText = driver.findElement(By.xpath("//*[normalize-space()='Pay & Park']"));

        payAndParkText.click();
        
        driver.findElement(By.xpath("//*[normalize-space(text())='Parking Charges']")).click();
        
     // Click on the "Add" button
        driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
        
        
        
        
        
     
     
     
      //Avaibale parking
     //  driver.findElement(By.xpath("(//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters Mui-selected MuiListItemButton-root MuiListItemButton-gutters Mui-selected css-1n3c6aq'])[1]")).click();
 
      // WebElement availableParkingLink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[2]/p[1]"));
      // availableParkingLink.click();
       
       //driver.switchTo().frame("AvailableparkingFrame");  // Replace "parkingFrame" with the actual iframe ID or name
      // WebElement AvailableparkingLink = driver.findElement(By.xpath("MuiTypography-root MuiTypography-body1 OpenSansBold css-1lwinb4"));
     //  AvailableparkingLink.click();
     //  driver.switchTo().defaultContent();
 

System.out.println("Test");

        driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 OpenSansBold css-1lwinb4\"]")).click();
        System.out.println("Test1");
}

}
