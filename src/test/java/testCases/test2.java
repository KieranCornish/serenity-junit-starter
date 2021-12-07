package testCases;

        import net.serenitybdd.core.Serenity;
        import net.thucydides.core.annotations.Managed;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;


public class test2 {

@Managed
    WebDriver driver;

    @Test
    public void websearch() {
        driver.get("https://www.gov.uk/check-uk-visa/y");
        driver.findElement(By.name("")).sendKeys("");
    }
}