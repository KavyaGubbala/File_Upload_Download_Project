import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkFiledownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kavya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jpg2pdf.com/");
		driver.findElement(By.cssSelector("[class*='button_mr']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\kavya\\Downloads\\raj\\fileupload.exe");
		Thread.sleep(3000);
		//WebDriverWait w=new WebDriverWait(driver,  Duration.ofSeconds(20));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='file-button']")));
		driver.findElement(By.cssSelector("button[class*='file-button']")).click();
		Thread.sleep(5000);
		File f=new File("C:\\Users\\kavya\\Downloads\\raju.pdf");
		if(f.exists()) {
			System.out.println("filefound");
		}


	}

}
