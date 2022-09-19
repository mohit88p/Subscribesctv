package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.sctvSubscriptionStepDefinition;

public class sctvSubscriptionPage extends sctvSubscriptionStepDefinition {

    //public WebDriver driver;
    //These are page objects of landing page
    By planName= By.xpath("//h3[@class='selectPlan-title-withHeader'][1]");
    By liteSubscription= By.xpath("//div[@class='packages packages Light']//h1");
    By classicSubscription= By.xpath("//div[@class='packages packages Classic']//h1");
    By premiumSubscription= By.xpath("//div[@class='packages packages Premium']//h1");

    public sctvSubscriptionPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyPlanName()
    {

        String plans= driver.findElement(planName).getText();
        if(plans.equalsIgnoreCase("Choose Your Plan"))
        {
            System.out.println("Pland heading is correct on the page");
        }else
        {
            System.out.println("Plans heading is not correct on the page");
        }
    }
    public void searchPlanSubscriptionName()
    {

        String litePackage=driver.findElement(liteSubscription).getText();
        if (litePackage.equalsIgnoreCase("LITE"))
        {
            System.out.println("LITE Package is correct ");
        }else
        {
            System.out.println("LITE Package is not correct");
        }

        String classicPackage=driver.findElement(classicSubscription).getText();
        if (classicPackage.equalsIgnoreCase("CLASSIC"))
        {
            System.out.println("CLASSIC Package is correct ");
        }else
        {
            System.out.println("CLASSIC Package is not correct");
        }

        String premiumPackage=driver.findElement(premiumSubscription).getText();
        if (premiumPackage.equalsIgnoreCase("PREMIUM"))
        {
            System.out.println("PREMIUM Package is correct ");
        }else
        {
            System.out.println("PREMIUM Package is not correct");
        }
    }
}
