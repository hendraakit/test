package M1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/menu.html");		
		WebElement title = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000451944022"));
		String x = title.getText();
		 if(x.indexOf("[1]")>=0)
		 {System.out.println("Bug still occurs");}
		 else{System.out.println("pass");}
		 


	}

}
