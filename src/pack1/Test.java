package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//creer une instance du navigateur Chrome
		//ChromeDriver driver1= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//sert à
		driver.manage().window().maximize();//maximiser l'affichage de la fenetre
		driver.getTitle();//la methode va tester et retourner string
		String titlePage=driver.getTitle();
		System.out.println("Le tite de la page est: "+titlePage);
		
		//validation
		if(titlePage.equals("OrangeHRM")) {//on a ajouter le 1 pour que le test echoue
			System.out.println("Le test Title est reussi ");
			
		}else {
			System.out.println("Le test Title a echoué ");
	} 
		driver.getCurrentUrl();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("L'URL de la page est: "+currentUrl);
		//validation
		if(currentUrl.equals("https://opensource-demo.orangehrmlive.com/")) {//on a ajouter le 1 pour que le test echoue
			System.out.println("Le test URL est reussi ");
			
		}else {
			System.out.println("Le test URL a echoué ");
	} 
}
}
