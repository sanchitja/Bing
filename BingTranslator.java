package Bing123.bing;


import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BingTranslator {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter text");
		String MyString = "Friend";  //scan.nextLine();
		System.out.println("Enter input language :");
		String LanguageIn = "English";  //scan.nextLine();

		System.out.println("enter output language :");
		String LanguageOut = "Hindi"; //scan.nextLine();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanchitjain\\Downloads\\chromedriver_win32e\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.bing.com/translator");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@aria-label='Language selection']/../../../div[1]/div/select")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@class='t_in trtl_inline col ']/div/select/option[text()='" + LanguageIn + "']")).click();
		System.out.println("dropdown clicked");

		driver.findElement(By.xpath("//select[@aria-label='Language selection']/../../../div[3]/div/select")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@class='t_out trtl_inline col ']/div/select/option[text()='" + LanguageOut + "']"))
				.click();

		driver.findElement(By.xpath("//textarea[@aria-label='Text to be translated']")).sendKeys(MyString);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-label='Language selection']/../../../div[2]")).click();
		
		
		
		
		//share icon
		
		driver.findElement(By.xpath("//div[@class='actIconSvg actShareSvgIcon']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='actIconSvg actPinterestSvgIcon']")).click();
		
		
		
		
		
		
		
		
		

	}
}
