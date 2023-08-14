import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jpg2pdf.com/");
		driver.findElement(By.cssSelector("[class*='button_mr']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\kavya\\Downloads\\raj\\fileupload.exe");
		Thread.sleep(3000);
		//WebDriverWait w=new WebDriverWait(driver,  Duration.ofSeconds(20));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='file-button']")));
		driver.findElement(By.cssSelector("button[class*='file-button']")).click();
		Thread.sleep(7000);
		File f=new File(downloadPath+"/raju.pdf");
		if(f.exists()) {
			System.out.println("filefound");
			Assert.assertTrue(f.exists());

			if(f.delete())

			System.out.println("file deleted");
			
		}

	}

}
