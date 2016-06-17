package M2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/menu.html");		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[19]/div/p"));
		String x = title.getText();
		System.out.println(x);
		 if(x.indexOf(".")>=0)
		 {System.out.println("Bug still occurs");}
		 else{System.out.println("pass");}
		 


	}

}
