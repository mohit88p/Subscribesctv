package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.sctvSubscriptionPage;

import java.util.Iterator;
import java.util.Set;

public class sctvSubscriptionStepDefinition {

    public WebDriver driver;
    sctvSubscriptionPage sctvPage= new sctvSubscriptionPage(driver);

    @Given("^User is on stctv Landing Page$")
    public void user_is_on_stctv_landing_page() throws Throwable {


        System.setProperty("webdriver.chrome.driver","/Users/mohitpuri/Downloads/SubscribeStctv/chromedriver");
        driver= new ChromeDriver();

        driver.get("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();
    }

    @When("^User verify the plan heading on the page$")
    public void user_verify_the_plan_heading_on_the_page() throws Throwable {
        sctvPage.verifyPlanName();
    }

    @Then("^User validate all the subscription packages$")
    public void user_validate_all_the_subscription_packages() throws Throwable {

        sctvPage.searchPlanSubscriptionName();
        driver.findElement(By.xpath("//a[@class='header-btns-country hide-mobile']")).click();
        String expectedPopupTxt=driver.findElement((By.xpath("//div[@class='countryList-copy']//h5"))).getText();
        System.out.println(expectedPopupTxt);
    }

}
