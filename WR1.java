package WR1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/welcome.html");
		WebElement element = driver.findElement(By.linkText("Our Passion"));
		element.click();
		WebElement title = driver.findElement(By.className("editor_h1"));
		String x = "title";
		 if(x == "title")
		 {System.out.println("Pass");}
		 else{System.out.println("failed");}
		 


	}

}
