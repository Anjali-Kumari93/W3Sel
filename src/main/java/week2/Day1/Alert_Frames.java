package week2.Day1;


import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		//Entering into the frames
		driver.switchTo().frame("iframeResult");
		//click on try it
		String alertValue = "Anjali";
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		driver.switchTo().alert().sendKeys(alertValue);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String frameValue= driver.findElementById("demo").getText();
		if(frameValue.contains(alertValue))
		{
			System.out.println("Entered value in Alert is matching");
		}
		else
		{
			System.out.println("Entered value in Alert is NOT matching");
		}
		
		driver.close();

	}

}
