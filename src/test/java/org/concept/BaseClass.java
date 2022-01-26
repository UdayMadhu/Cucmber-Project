package org.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static  void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static  void getUrl(String url) {
		driver.get(url);
	}

	public String getTtitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void quit() {
		driver.quit();
	}

	public void close() {
		driver.close();
	}

	public WebElement findElementByid(String attributename) {
		WebElement element = driver.findElement(By.id(attributename));
		return element;
	}

	public WebElement findElementByName(String attributename) {
		WebElement element = driver.findElement(By.name(attributename));
		return element;
	}

	public WebElement findElementByclassname(String attributename) {
		WebElement element = driver.findElement(By.className(attributename));
		return element;
	}

	public WebElement findElementByxpath(String Xpathname) {
		WebElement element = driver.findElement(By.xpath(Xpathname));
		return element;
	}

	public void sendkey(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void click(WebElement element) {
		element.click();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttribute(WebElement element, String attributename) {
		String data = element.getAttribute(attributename);
		return data;
	}

	public void mouseOverAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void dargAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void navigateback() {
		driver.navigate().back();
	}

	public void navigateforward() {
		driver.navigate().forward();
	}

	public void navigaterefresh() {
		driver.navigate().refresh();
	}

	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	public File particularScreenShot(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

//	public void copyfile() {
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File s = screenshot.getScreenshotAs(OutputType.FILE);
//		File d = screenshot.getScreenshotAs()
//		FileUtils.copyFile(s, destFile);
//	}
	
	
	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void inserJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public Object getJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object script = executor.executeScript("return arguments[0].getAttribute('value')", element);
		return script;
	}

	public void clickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public List<WebElement> getOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
	}

	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement option = select.getFirstSelectedOption();
		return option;
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void deselectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deselectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deselectOptionByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void frames(int index) {
		driver.switchTo().frame(index);
	}

	public void frames(String data) {
		driver.switchTo().frame(data);
	}

	public void frames(WebElement element) {
		driver.switchTo().frame(element);
	}

	public List<WebElement> framesCount(String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		return findElements;
	}

	public void switchToChildWindow(String data) {
		driver.switchTo().window(data);
	}

	public String getParentWindowId() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getAllWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public String excelData(String sheet1, int rowNo, int cellNo) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\UDAY MADHU\\eclipse-workspace\\Maven\\Excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheet1);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			data = cell.getStringCellValue();

		}
		if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				data = dateFormat.format(dateCellValue);
			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				data = String.valueOf(l);
			}

		}
		return data;

	}

	public void excelData1(String sheet1, int rowNo, int cellNo, String data) throws IOException {
		File file = new File("C:\\Users\\UDAY MADHU\\eclipse-workspace\\Maven\\Excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheet1);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	public void excelData2(String sheet1, int rowNo, int cellNo, String data) throws IOException {
		File file = new File("C:\\Users\\UDAY MADHU\\eclipse-workspace\\Maven\\Excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheet1);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}
}
