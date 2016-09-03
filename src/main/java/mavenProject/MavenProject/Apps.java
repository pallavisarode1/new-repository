package mavenProject.MavenProject;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 /* Hello world!
 *
 */
public class Apps 
{
	
	WebDriver driver;
//	final String aapURL="http://naukri.com/";
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        String pagesource=driver.getPageSource();
        String expectedTitle="Google";
        if(title.equalsIgnoreCase(expectedTitle)){
            System.out.println("Test case Pass");
            
            else{
              System.out.println("Test case Fail");
            }            */
    Apps obj=new Apps();
   
    //obj.launchApplication("IE");
    obj.Testcase1();
    //obj.CloseApplication();          
    }
	public void Testcase1(){
		Apps obj=new Apps();
	    obj.launchApplication("Firefox");
	    obj.launchURL("http://www.naukri.com/")   ;            //("http://the-internet.herokuapp.com/dropdown");
	    
	    obj.handleWindow();
	    obj.getAllLinksFromPage();
	    //obj.launchApplication("IE");
	    obj.toRefreshPage();
	    obj.todropDown();
	     //obj.CloseApplication();  
            
        }
        
        /*System.out.println(title);
        System.out.println(url);
        System.out.println(pagesource)
        driver.close();*/
	public void handleWindow(){
	String window=driver.getWindowHandle();
	System.out.println("Window"+window);
	Set <String> handle= driver.getWindowHandles();
//	int i= handle.size();
for(String s:handle)
    {
	driver.switchTo().window(s);
	driver.getTitle();
	System.out.println(driver.getTitle());
	}
	 Iterator <String >irt =handle.iterator();
	 while(irt.hasNext()){
		 System.out.println(irt.next());
			 }
 	}
	public void getAllLinksFromPage(){
		List <WebElement> b=driver.findElements(By.tagName("a"));
		
		/*for(String web:b)
	    {
		driver.switchTo().window(web);
		driver.getTitle();
		System.out.println(driver.getTitle());
		}*/
		
		
	}
	public void toRefreshPage(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("L")).sendKeys("AAAAADA");	/////////
		driver.findElement(By.name("L")).sendKeys("\uE035");//(Keys.F5);
		//driver.navigate().refresh();
	//	driver.navigate().to(driver.getCurrentUrl());
	}
	public void todropDown(){
		
		WebElement ed=(WebElement) driver.findElements(By.cssSelector(".//*[@id='dropdown']"));
		
		
	}
public void toExpdropDown(){
		
		WebElement ed=(WebElement) driver.findElements(By.xpath("//div[@id="exp_dd"]//div[@class="matchParent content" ]//ul/li[3]"));
		//--.//div [@id='p0widget']//div[@class='registSec']/input
		
	}
	
	
	
	
	
    public void launchURL(String appURL){
    	driver.get(appURL);
    	driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();
        
       if(url.contains("naukri"))
       {
       if(actualTitle.startsWith("Jobs"))
       {
    	   System.out.println("Jobs");
       }
       else{
    	   System.out.println("Test Case Passed");
       }
       }
       else{
    	   System.out.println("Failed");
       }
       
    	
    }

    public void launchApplication(String browseName)
    {
    	if(browseName.equalsIgnoreCase("Firefox")){
    		driver= new FirefoxDriver();
    		this.implicitWaitExample();
    	}
    	else if (browseName.equalsIgnoreCase("Chrome")){
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\CHROMEDRIVER.EXE");
    		driver= new ChromeDriver();
    		//this.implicitWaitExample();
    	}
    	else if (browseName.equalsIgnoreCase("IE")){
    		System.setProperty("webdriver.ie.driver","C:\\Users\\dell\\Downloads\\IEDriverServer_x64_2.53.1\\IEDRIVERSERVER.EXE");
    		driver= new InternetExplorerDriver();
    		//this.implicitWaitExample();
    	}
    }
    public void implicitWaitExample(){
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
      }
    public void ExplicitWaitExample(String title){
    	WebDriverWait wdw=new WebDriverWait(driver,10);
    
    	wdw.until(ExpectedConditions.titleContains(title));
    	 	
    	
    }
    public void CloseApplication(){
        driver.close();
    }
    
    
}


