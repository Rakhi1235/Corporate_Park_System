package Demo01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Parking {

	public static void main(String[] args) throws InterruptedException {
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
		
			
			 //Parking page//click
		     driver.findElement(By.xpath("(//div[@role=\"button\"])[2]")).click(); 
		       
		    //parking dropdwon// 
		        
		        WebElement parkingText = driver.findElement(By.xpath("//*[normalize-space()='Available Parking']"));

		        parkingText.click();
		        
		        driver.findElement(By.xpath("//div[@class='MuiBox-root css-uxqby9']")).click();
		        
		        WebElement payAndParkText = driver.findElement(By.xpath("//*[normalize-space()='Pay & Park']"));

		        payAndParkText.click();
		        
		        driver.findElement(By.xpath("//*[normalize-space(text())='Parking Charges']")).click();
		        
		     // Click on the "Add" parking charges  button
		        driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
		        
		     // Click on the vehicle type dropdown
		        WebElement vehicleDropdown = driver.findElement(By.xpath("(//div[@id='vehicle_type'])[1]"));
		        vehicleDropdown.click();

		        // Wait (if necessary) for the dropdown options to be visible
		        Thread.sleep(1000); // Optional: Use WebDriverWait in real scenarios

		        // Select the "Car" option
		        WebElement optionCar = driver.findElement(By.xpath("//li[normalize-space()='Car']"));
		        optionCar.click();
		       
		     // Click on the Time dropdown
		        WebElement timeDropdown = driver.findElement(By.xpath("(//div[@id='time'])[1]"));
		        timeDropdown.click();

		        // Wait for options to be visible (use WebDriverWait ideally)
		        Thread.sleep(1000); // Optional: better with explicit wait

		        // Select the "Hourely" option
		        WebElement optionHourly = driver.findElement(By.xpath("//li[normalize-space()='Hourly']"));
		        optionHourly.click();

		        // Wait briefly to allow selection to reflect (or use WebDriverWait)
		        Thread.sleep(500); // Optional
		        
		       //charges fields//
		        driver.findElement(By.xpath("//input[@id='charges']")).sendKeys("80");
		        
		        //Apply
		        WebElement addButton = driver.findElement(By.xpath("//button[@type='submit']"));
		        addButton.click();
		         
		         //Cancel
		        // WebElement Cancelbutton = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		       //  Cancelbutton.click();
		        
		        
		       // Click on the Add pass  charges
		     // Click the 'Add' button to open the form/modal
		        WebElement addButton2 = driver.findElement(By.xpath("//button[text()='Add']"));
               // Click the button
		        addButton2.click();
		        
		       // Click on the vehicle type dropdown//
		        WebElement vehicleDropdown3 = driver.findElement(By.xpath("(//div[@id='vehicle_type'])[1]"));
		        vehicleDropdown3.click();

		        // Wait (if necessary) for the dropdown options to be visible
		        Thread.sleep(1000); // Optional: Use WebDriverWait in real scenarios

		        // Select the "Car" option
		        WebElement optionCar2 = driver.findElement(By.xpath("//li[normalize-space()='Car']"));
		        optionCar2.click();
		       
		     // Click on the Time dropdown
		        WebElement timeDropdown4 = driver.findElement(By.xpath("(//div[@id='time'])[1]"));
		        timeDropdown4.click();

		        // Wait for options to be visible (use WebDriverWait ideally)
		        Thread.sleep(1000); // Optional: better with explicit wait

		        // Select the "Hourely" option
		        WebElement optionHourly5 = driver.findElement(By.xpath("//li[normalize-space()='Hourly']"));
		        optionHourly5.click();

		        // Wait briefly to allow selection to reflect (or use WebDriverWait)
		        Thread.sleep(1000); // Optional
		        
		       //charges fields//
		        driver.findElement(By.xpath("//input[@id='charges']")).sendKeys("100");
		        
		        //Apply
		        WebElement addButton6 = driver.findElement(By.xpath("//button[@type='submit']"));
		        addButton6.click();
		         
		        WebElement IssuePassButton = driver.findElement(By.xpath("//p[normalize-space()='Issued Pass']"));
		        IssuePassButton.click();
		        
		        driver.findElement(By.xpath("//button[normalize-space()='Parking Charges']")).click();
		        
		     // Click on the "Add" parking charges  button
		        driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
		        
		     // Click on the vehicle type dropdown
		        WebElement vehicleDropdown6 = driver.findElement(By.xpath("(//div[@id='vehicle_type'])[1]"));
		        vehicleDropdown6.click();
		        
		        // Wait (if necessary) for the dropdown options to be visible
		        Thread.sleep(1000); // Optional: Use WebDriverWait in real scenarios

		        // Select the "Car" option
		        WebElement optionBike = driver.findElement(By.xpath("//li[normalize-space(text())='Bike']"));
		        optionBike.click();
		       
		     // Click on the Time dropdown
		        WebElement timeDropdown8 = driver.findElement(By.xpath("(//div[@id='time'])[1]"));
		        timeDropdown8.click();

		        // Wait for options to be visible (use WebDriverWait ideally)
		        Thread.sleep(1000); // Optional: better with explicit wait

		        // Select the "Hourely" option
		        WebElement optionPerday = driver.findElement(By.xpath("//li[normalize-space()='Per Day']"));
		        optionPerday.click();

		        // Wait briefly to allow selection to reflect (or use WebDriverWait)
		        Thread.sleep(500); // Optional
		        
		       //charges fields//
		        driver.findElement(By.xpath("//input[@id='charges']")).sendKeys("110");
		        
		        //Apply
		        WebElement addButton3 = driver.findElement(By.xpath("//button[@type='submit']"));
		        addButton3.click();
		         
		      //  Click the 'Add' button to open the form/modal
		        WebElement addButton4 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-bj1ehx']//button[@type='button'][normalize-space()='Add']"));
               // Click the button
		        addButton4.click();
		        
		       // Click on the vehicle type dropdown//
		        WebElement vehicleDropdown7 = driver.findElement(By.xpath("(//div[@id='vehicle_type'])[1]"));
		        vehicleDropdown7.click();

		        // Wait (if necessary) for the dropdown options to be visible
		        Thread.sleep(1000); // Optional: Use WebDriverWait in real scenarios

		        // Select the "Car" option
		        WebElement optionVolvo = driver.findElement(By.xpath("//li[normalize-space()='Volvo']"));
		        optionVolvo.click();
		       
		     // Click on the Time dropdown
		        WebElement timeDropdown9 = driver.findElement(By.xpath("(//div[@id='time'])[1]"));
		        timeDropdown9.click();

		        // Wait for options to be visible (use WebDriverWait ideally)
		        Thread.sleep(1000); // Optional: better with explicit wait

		        // Select the "Hourely" option
		        WebElement optionAnnually = driver.findElement(By.xpath("//li[normalize-space()='Annually']"));
		        optionAnnually.click();

		        // Wait briefly to allow selection to reflect (or use WebDriverWait)
		        Thread.sleep(1000); // Optional
		        
		       //charges fields//
		        driver.findElement(By.xpath("//input[@id='charges']")).sendKeys("200");
		        
		        //Apply
		        WebElement addButton9 = driver.findElement(By.xpath("//button[@type='submit']"));
		        addButton9.click();
		         
		        
		        
		        
		        

}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	

