
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

/**
 *
 * @author urlas
 */
public class TestePaginaSoma {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testingsomarparcelas() {
        driver.get("http://localhost:8080/SomarParcelas/");
        driver.manage().window().setSize(new Dimension(974, 1032));
        driver.findElement(By.name("p1")).click();
        driver.findElement(By.name("p1")).sendKeys("21");
        driver.findElement(By.name("p2")).click();
        driver.findElement(By.name("p2")).sendKeys("12");
        driver.findElement(By.name("calcular")).click();
        driver.findElement(By.cssSelector("h1")).click();
        driver.findElement(By.cssSelector("h1")).click();
        driver.findElement(By.cssSelector("h1")).click();
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("O Resultado foi 33"));
    }

}
