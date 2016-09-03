package mavenProject.MavenProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	WebDriver driver;
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
    App obj=new App();
    obj.launchApplication("IE");
    obj.CloseApplication();          
          
            
            
        }
        
        /*System.out.println(title);
        System.out.println(url);
        System.out.println(pagesource);
        driver.close();*/
    

    public void launchApplication(String browseName){
    	if(browseName.equalsIgnoreCase("Firefox")){
    		driver= new FirefoxDriver();
    	}
    	else if (browseName.equalsIgnoreCase("Chrome")){
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\CHROMEDRIVER.EXE");
    		driver= new ChromeDriver();
    	}
    	else if (browseName.equalsIgnoreCase("IE")){
    		System.setProperty("webdriver.ie.driver","C:\\Users\\dell\\Downloads\\IEDriverServer_x64_2.53.1\\IEDRIVERSERVER.EXE");
    		driver= new InternetExplorerDriver();
    	}
    	}
    public void CloseApplication(){
        driver.close();
    }
    
    
}


