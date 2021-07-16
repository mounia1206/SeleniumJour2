package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//creer une instance du navigateur Chrome
		//ChromeDriver driver1= new ChromeDriver();driver 1 de type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");//sert à
		driver.manage().window().maximize();//maximiser l'affichage de la fenetre, chainage de méthode
		driver.getPageSource();//ramener le code source
		String codeSource=driver.getPageSource();
		//System.out.println("Le code source est le suivant: "+codeSource);//afficher le code source
		if(codeSource.contains("OrangeHRM")) {//valider le code source contient "OrangeHRM"
			
			System.out.println("Passed ");
			
		}else {
			System.out.println("Failed ");
	} 
		
	}
}
