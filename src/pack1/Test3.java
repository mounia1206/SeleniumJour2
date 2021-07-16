package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//creer une instance du navigateur Chrome
		//ChromeDriver driver1= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//sert à
		driver.manage().window().maximize();//maximiser l'affichage de la fenetre
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");//pour ecrire du texte identifier dans sendkeys 
		WebElement passWord=driver.findElement(By.name("txtPassword"));
		passWord.sendKeys("admin123");
		WebElement logBtn=driver.findElement(By.id("btnLogin"));
		logBtn.click();
		
		WebElement lienWelcome=driver.findElement(By.id("welcome"));
		lienWelcome.click();
		Thread.sleep(4000);//ralentir selenium
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		
}
}
