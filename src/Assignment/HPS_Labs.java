package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class HPS_Labs {
//private static AndroidDriver<MobileElement> driver;  
	WebDriver driver;
	
	@Test(priority=0)
	public void Button1() {
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 1']")).click();
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		System.out.println(driver.findElement(By.id("android:id/message")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='1']")).getText());
		System.out.println(driver.findElement(By.id("android:id/button1")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		/*driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 3']")).click();
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		System.out.println(driver.findElement(By.id("android:id/message")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='1']")).getText());
		System.out.println(driver.findElement(By.id("android:id/button1")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='ASK ME LATER']")).click();
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);*/
 
 
	}
	
	
	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void Button2() {
		
		
	
	    
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 2 and @index='0']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index='1']/android.widget.TextView[@text='BUTTON 2']")).click();
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		System.out.println(driver.findElement(By.id("android:id/message")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='1']")).getText());
		System.out.println(driver.findElement(By.id("android:id/button1")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	}
	
	/*
	@Test(priority=1)
	public void Button3() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 3']")).click();
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		System.out.println(driver.findElement(By.id("android:id/message")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='1']")).getText());
		System.out.println(driver.findElement(By.id("android:id/button1")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='ASK ME LATER']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	}
	
	
	@Test(priority=3)
	public void Button4() {
	
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 4']")).click();
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		System.out.println(driver.findElement(By.id("android:id/message")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@index='1']")).getText());
		System.out.println(driver.findElement(By.id("android:id/button1")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
 
	}*/

	 @BeforeClass
	 
	  public void setup() throws MalformedURLException, InterruptedException {
		 
		    DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "45");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.testerapp");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.testerapp.MainActivity");
			/*AndroidDriver<AndroidElement>*/ driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
}
}
