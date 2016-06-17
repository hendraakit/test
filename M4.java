package M4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/welcome.html");
		WebElement element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000450914890"));
		element.click();
		WebElement title = driver.findElement(By.xpath("/html/body"));
		String x = title.getText();
		if(x.indexOf("loose")>=0)
		 {System.out.println("Pass");}
		 else{System.out.println("Bug still occurs");}
		 


	}

}
