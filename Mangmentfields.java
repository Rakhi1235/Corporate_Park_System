package Demo01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mangmentfields {

	private static FluentWait<WebDriver> wait;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Wait for 3 seconds

		driver.get("https://corporatepark.netlify.app/");

		System.out.println(driver.getTitle());


		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anprdemopms@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Anpr@4321");


		//sign in//
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		

		 //Vehicle page//click
		 driver.findElement(By.xpath("//p[normalize-space()='Vehicle Type']")).click();
		//Vehicle type Add button//
		 driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
		 //Vehicle type field//
		 driver.findElement(By.xpath("//input[@id='vehicle_type']")).sendKeys("Hundaie");
		 
		 
		// Click on the vehicle type dropdown//
	        WebElement NoofWheerler = driver.findElement(By.xpath("//div[@id='number_of_wheeler_id']"));
	        NoofWheerler.click();
	        
	         //Select the "Car" option
	       WebElement option2wheerler = driver.findElement(By.xpath("//li[normalize-space()='2 wheeler']"));
	        option2wheerler.click();
		
	        //vehicle Add button//
	       WebElement addButton9 = driver.findElement(By.xpath("//button[@type='submit']"));
	        addButton9.click();
	        
	        //Parking size& type//
	        driver.findElement(By.xpath("//p[normalize-space()='Parking Size & Type']")).click();
			//Vehicle type Add button//
			 driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
			 //Partially detected length field//
			 driver.findElement(By.xpath("//input[@id='length']")).sendKeys("2");//
			 //Partially detected Width field//
			 driver.findElement(By.xpath("//input[@id='width']")).sendKeys("1");
			
			// 1. Click to open the dropdown
			 WebElement vehicleddown = driver.findElement(By.xpath("//div[@id='vehicle_type_id']"));
			 vehicleddown.click();
			 
			 

		        // Select the "Car" option
		        WebElement optionHundai = driver.findElement(By.xpath("//li[normalize-space()='Hundai']"));
		        optionHundai.click();

			 
		    
		      WebElement addButton = driver.findElement(By.xpath("//button[@type='submit']"));
		        addButton.click();
		
		        //Building type//
		        driver.findElement(By.xpath("//p[normalize-space()='Building']")).click();
				//Vehicle type Add button//
				 driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
				 //Partially detected length field//
				 driver.findElement(By.xpath("//input[@id='building_name']")).sendKeys("Perfect60");
				 //Partially detected Width field//
				 driver.findElement(By.xpath("//input[@id='total_parking']")).sendKeys("0");
				 
				 driver.findElement(By.xpath("//input[@id='total_occupied_parking']")).sendKeys("1");
		
				 WebElement addButton3 = driver.findElement(By.xpath("//button[@type='submit']"));
			        addButton3.click();
		
	    
			   
		
			 
		
		
		
	}

}
