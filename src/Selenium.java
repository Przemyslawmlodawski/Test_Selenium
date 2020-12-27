import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium

{

    public static void main(String[] args)

    {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Tomasz");
        driver.findElement(By.id("inputPassword3")).sendKeys("Nowak");
        driver.findElement(By.id("dataU")).sendKeys(":01.01.2007");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Grzegorz");
        driver.findElement(By.id("inputPassword3")).sendKeys("Nowak");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2012");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Bożena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Nowak");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2008");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Michał");
        driver.findElement(By.id("inputPassword3")).sendKeys("Nowak");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2013");
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Damian");
        driver.findElement(By.id("inputPassword3")).sendKeys("Bolewski");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2004");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Tomasz");
        driver.findElement(By.id("inputPassword3")).sendKeys("Bolewski");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2012");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();


        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Marlena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Bolewska");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2005");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Natalia");
        driver.findElement(By.id("inputPassword3")).sendKeys("Bolewska");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2008");
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();


        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Ryszard");
        driver.findElement(By.id("inputPassword3")).sendKeys("Matula");
        driver.findElement(By.id("dataU")).sendKeys("01.01.1998");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();


        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Bożena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Matula");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2003");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();


        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Piotr");
        driver.findElement(By.id("inputPassword3")).sendKeys("Matula");
        driver.findElement(By.id("dataU")).sendKeys("01.01.1999");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Kamil");
        driver.findElement(By.id("inputPassword3")).sendKeys("Matula");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2003");
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Kajetan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Friedek");
        driver.findElement(By.id("dataU")).sendKeys("01.01.1934");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Maciej");
        driver.findElement(By.id("inputPassword3")).sendKeys("Friedek");
        driver.findElement(By.id("dataU")).sendKeys("01.01.1956");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Friedek");
        driver.findElement(By.id("dataU")).sendKeys("01.01.1934");
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        driver.findElement(By.id("inputEmail3")).sendKeys("Katarzyna");
        driver.findElement(By.id("inputPassword3")).sendKeys("Friedek");
        driver.findElement(By.id("dataU")).sendKeys("01.01.2001");
        driver.findElement(By.cssSelector("button")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.quit();

    }

}