package org.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	
	public static WebDriver driver;
	public static Actions ac; 
	public static Select select;
	
	public static void browserLaunchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAM\\Desktop\\Java\\OrangeHRM\\driver\\chromedriver.exe");
		driver =  new ChromeDriver();
		
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWindows() {
		driver.manage().window().maximize();
	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void click(WebElement element ) {
		element.click();
	}
	public static void actions() {
		ac = new Actions(driver);
	}
	
	public static void clickAction(WebElement element) {
		actions();
		ac.click(element).perform();
	}
	public static void moveToElement(WebElement element) {
		actions();
		ac.moveToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
		actions();
		ac.contextClick(element).perform();
	}
	public static void doubleClick(WebElement element) {
		actions();
		ac.doubleClick(element);
	}
	public static void sendValues(WebElement element,String value) {
		actions();
		ac.sendKeys(element, value).perform();
	}
	
	public static void dragDrop(WebElement element) {
		actions();
		ac.dragAndDrop(element, element).perform();
	}
	public static void dropDown(WebElement element) {

		select =  new Select(element);
	}
	
	public static void selectbyval(WebElement element,String value) {

		dropDown(element);
		select.selectByValue(value);
		
		
	}
	
	
	public static void selectbyIndex(WebElement element,int index) {

		dropDown(element);
		select.selectByIndex(index);
		
	}
	
	
	public static void selectbyVisibleText(WebElement element,String text) {

		dropDown(element);
		select.selectByVisibleText(text);
		
	}
	
	public static void getOptions(WebElement element,List<WebElement> textOptns) {

		dropDown(element);
		textOptns = select.getOptions();
		System.out.println(textOptns);
		
	}
	
	
	public static void getAllSelectedOptions(WebElement element,List<WebElement> textOptns) {

		dropDown(element);
		textOptns = select.getAllSelectedOptions();
		System.out.println(textOptns);
	}
	
	public static void getFirstSelectedOption(WebElement element,WebElement textOptns) {

		dropDown(element);
		textOptns = select.getFirstSelectedOption();
		System.out.println(textOptns);
	}
	
	
	public static void deselectbyIndex(WebElement element,int index) {

		dropDown(element);
		select.deselectByIndex(index);
		
	}
		
	public static void deselectbyValue(WebElement element,String value) {

		dropDown(element);
		select.deselectByValue(value);
		
	}
	
	public static void deselectbyVisibleText(WebElement element,String text) {

		dropDown(element);
		select.deselectByVisibleText(text);
		
	}
	
	public static void deselectAll(WebElement element) {

		dropDown(element);
		select.deselectAll();
	}
	
	public static void frame(WebElement element) {

		driver.switchTo().frame(element);
	}
	
	public static void frameIndex(int index) {
		
		driver.switchTo().frame(index);
	}

	public static void frameName(String frameName) {
		
		driver.switchTo().frame(frameName);
	}
	
	public static void parentFrame() {

		driver.switchTo().parentFrame();
	}

	public static void getWindowHandle() {

		String window = driver.getWindowHandle();
		System.out.println(window);
	}
	
	public static void getwindowHandles() {

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);		
	}
	
	public static void switchToWindow(String Windowid) {

		driver.switchTo().window(Windowid);
	}
	
	
	public static void getAttributeText(WebElement element,String text,String value ) {

		
		String txt = element.getAttribute(value);
		System.out.println(text+txt);
		
		
	}
	public static void displ(String txt) {

		System.out.println(txt);
	}
	public static void screenShot(String imgName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File scrFile = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SAM\\Desktop\\"+imgName+".png");
		FileUtils.copyFile(scrFile, dest);
		
	}

	
	
}
