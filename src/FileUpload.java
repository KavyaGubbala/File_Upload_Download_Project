import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://jpg2pdf.com/");
		driver.findElement(By.cssSelector("[class*='button_mr']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\kavya\\Downloads\\raj\\fileupload.exe");

	}

}
