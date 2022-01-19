package test;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;    
import java.util.List;    
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.*;   



public class choucairtestingEmpleos {
	
	
	 public static void main(String[] args) {  
	                   
	        String Url = "https://www.choucairtesting.com/empleos-testing/";
	          
	        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");          
	        WebDriver driver = new ChromeDriver();
	          
	      
	        String underConsTitle = "TEST";          
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);          
	        driver.get(Url);  
	  
	            
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));              
	        String[] linkTexts = new String[linkElements.size()];              
	        int i = 0;          
	 
	  for (WebElement e : linkElements) {              
	      linkTexts[i] = e.getText();              
	      i++;      
	        }    
 
	  for (String t : linkTexts) {              
	      driver.findElement(By.linkText(t)).click();          
	      if (driver.getTitle().equals(underConsTitle)) {              
	                System.out.println("\"" + t + "\""                
	                        + " Esta en contruccion o no funciona");      
	            } else {      
	                System.out.println("\"" + t + "\""                
	                        + "Esta funcionado");      
	            }    
	  driver.navigate().back();      
	        }    
	  driver.quit();      
	    }    
}