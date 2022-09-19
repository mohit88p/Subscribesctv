package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GreenKartStepDefinition {

    public  WebDriver driver;
    @Given("^User is on GreenCart Landing Page$")
    public void user_is_on_greencart_landing_page()  {

        System.setProperty("webdriver.chrome..driver","/Users/mohitpuri/Downloads/SubscribeStctv/chromedriver");
        driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }

    @When("^User searched with shortname \"([^\"]*)\"  and extracted actual name of the product$")
    public void user_searched_with_shortname_something_and_extracted_actual_name_of_the_product(String shortName)  {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        String prodName =driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();

        System.out.println(prodName +" Is Extracted from the home page");



    }

    @Then("^User searched for shortname in offers page to check produuct exist$")
    public void user_searched_for_shortname_in_offers_page_to_check_produuct_exist() {
        driver.findElement(By.linkText("Top Deals")).click();



        Set<String> s1= driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        String pWindow=i1.next();
        String childWindow=i1.next();

        driver.switchTo().window(childWindow);



    }

}
