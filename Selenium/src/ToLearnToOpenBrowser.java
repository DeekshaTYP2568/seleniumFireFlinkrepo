import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnToOpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.quit();
	}

}
