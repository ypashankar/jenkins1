package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups="Social media")
	public void facebooktest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actitle=driver.getTitle();
		System.out.println(actitle);
		
	}
	
	@Test(groups="Shopping")
	public void amazontest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actitle=driver.getTitle();
		System.out.println(actitle);
		
	}
	
	@Test(groups="Shopping")
	public void flipkarttest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actitle=driver.getTitle();
		System.out.println(actitle);
		
	}
	
	/*
	 <build>
<plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.2.2</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
</plugins>
</build>*/
}
