package C11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;


public class C11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/check-out.html");	
		driver.findElement(By.id("email")).sendKeys("asdasd@gmail.com");
		driver.findElement(By.id("name")).sendKeys("asdasd");
		driver.findElement(By.id("address")).sendKeys("asdasd");
		
		
		Select a =new Select(driver.findElement(By.id("card_type")));
		a.selectByIndex(3);
		
				
		driver.findElement(By.id("address")).sendKeys("asdasd");
		driver.findElement(By.id("card_number")).sendKeys("132456");
		driver.findElement(By.id("cardholder_name")).sendKeys("adssadasd");
		driver.findElement(By.id("verification_code")).sendKeys("adssadasd");
		
		WebElement z = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div/form/div/button"));
		z.click();
		
		WebElement y = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000453230000"));
		String x = y.getText() ;		
		 if(x.indexOf("Green")>=0)
		 {System.out.println("Bug still occurs");}
		 else{System.out.println("pass");}
		 


	}

}
