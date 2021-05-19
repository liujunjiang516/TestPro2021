package base;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PageAppium {
	public AndroidDriver<AndroidElement> driver; 
	BaseAction action;
	public PageAppium(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	

	public AndroidElement chat1() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"�� С���� ֪ͨ����\"]");
	}
	public AndroidElement chat2() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"ϵͳ ������\"]");
	}
	public AndroidElement add() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"��������\"]");
	}
	public AndroidElement add1() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"A admin\"]");
	}
	public AndroidElement add2() {
		return driver.findElementByXPath("(//android.view.View[@content-desc=\"�� ����\"])[1]");
	}
	public AndroidElement add3() {
		return driver.findElementByXPath("(//android.view.View[@content-desc=\"�� ����\"])[2]");
		
	}
	public AndroidElement add4() {
		return driver.findElementByXPath("(//android.view.View[@content-desc=\"�� ����\"])[3]");		
	}
	public AndroidElement add5() {
		return driver.findElementByXPath("(//android.view.View[@content-desc=\"�� ����\"])[4]");
		
	}
	public AndroidElement add6() {
		return driver.findElementByXPath("(//android.view.View[@content-desc=\"�� ����1\"])");
		
	}
	public AndroidElement button1() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
		
		
}
