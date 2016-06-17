package C41;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class C41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/menu.html");		
		WebElement X = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000451955160"));
		X.click();
		
		
		
		
		
		
		
		
		WebElement title = driver.findElement(By.xpath("/html/body"));
		String x = title.getText();
		 if(x.indexOf("Green Tea")>=0)
		 {System.out.println("pass");}
		 else{System.out.println("Bug still occurs");}
		 


	}

}
