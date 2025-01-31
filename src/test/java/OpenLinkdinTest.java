import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenLinkdinTest {

    @Test
    public void linkdinTest(){
        WebDriver driver = new ChromeDriver(); //Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//correct value for this element name
        driver.findElement(By.name("session_password")).sendKeys("Yourpassword" + Keys.ENTER);//correct value for this element name
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); //close the Automated test
    }
    @Test
    public void linkdinTest2(){
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automationst
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//Enter the Invalid values to given Element's ID or Name
        driver.findElement(By.name("session_password")).sendKeys("os2" + Keys.ENTER);//Enter the valid values to given Element;s ID or Name
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated test
    }
    @Test
    public void linkdinTest3(){
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//Enter the valid values to given Element's ID or Name
        driver.findElement(By.name("session_password")).sendKeys("4545" + Keys.ENTER);//Enter the Invalid values to given Element;s ID or Name
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated test
    }
    @Test
    public void linkdinTest4(){
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//Enter the valid values to given Element's ID or Name
        driver.findElement(By.name("session_password")).sendKeys(""+ Keys.ENTER);//Do a test without Entering any credentials
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated test
    }
    @Test
    public void linkdinTest5(){
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("");//Do a test without any Credential's
        driver.findElement(By.name("session_password")).sendKeys("4545" + Keys.ENTER);//Give a right Credential's
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated test
    }
    @Test
    public void linkdinTest6(){
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//Enter the Correct Credentials with All Elements in Uppercase
        driver.findElement(By.name("session_password")).sendKeys("OS052" + Keys.ENTER);//Enter the Incorrect Credentials
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated test
    }
    @Test
    public void linkdinTest7() {
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("");//Submit without Credentials
        driver.findElement(By.name("session_password")).sendKeys("" + Keys.ENTER);//Submit Without Credentials
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated Test
    }
    @Test
    public void linkdinTest8() {
        WebDriver driver = new ChromeDriver();//Command to get google chrome to do a test Automation
        //Input web application URL want to do a Automation test
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        //Input Elements ID or name and Values to that ID's or Name's
        driver.findElement(By.name("session_key")).sendKeys("Yourmail");//Enter the both elements to same Credentials
        driver.findElement(By.name("session_password")).sendKeys("osandalakruwan516" + Keys.ENTER);//Enter the both elements to same Credentials
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//close the Automated Test
    }
    @Test
    public void linkdinTest9() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-BPrWId")).click();//to test Google SignIn Button
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//Exit to the test(End Test)
    }
    @Test
    public void linkdinTest10() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login?lipi=urn%3Ali%3Apage%3Adeeplink_linkedinmobileapp%3BLeWaBFd1RdWn9UHBZTyHlg%3D%3D&destType=web&fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.className("sign-in-with-apple-button__text")).click();//To test Apple Sign In Button
        try {
            Thread.sleep(5000);//to wait 5000 milieseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();//End to the Test(End Test)
    }
}
