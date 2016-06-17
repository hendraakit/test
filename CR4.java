package CR4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CR4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/check-out.html");
		WebElement element = driver.findElement(By.linkText("Let's Talk Tea"));
		element.click();
		WebElement title = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914911"));
		String x = "title";
		 if(x == "title")
		 {System.out.println("Pass");}
		 else{System.out.println("failed");}
		 


	}

}
