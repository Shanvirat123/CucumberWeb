package Steps;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenBrowserSteps extends BaseClass {

    private static final By firstName = By.xpath("//a[@class='nav-link-hed'][contains(.,'Solutions')]");

    @Given("I open the browser")
    public void i_open_the_browser() {
        System.out.println("Browser is already opened by Hooks.");
    }

    @When("I navigate to OrangeHRM website")
    public void i_navigate_to_orangehrm_website() {
        getDriver().get("https://www.orangehrm.com/");
        getDriver().manage().window().maximize();
    }

    @Then("I should see the page title")
    public void i_should_see_the_page_title() {
        System.out.println("Page Title: " + getDriver().getTitle());
    }

    @Then("I click on the Solutions link")
    public void i_click_on_the_solutions_link() {
        WebElement element = getDriver().findElement(firstName);
        System.out.println("Element Text: " + element.getText());
        element.click();
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        System.out.println("Browser will be closed by Hooks.");
    }
}
