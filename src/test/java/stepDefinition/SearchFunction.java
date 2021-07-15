package stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.cucumber_for_beginners.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

public class SearchFunction {

	WebDriver driver;
	HomePage h;
	CheckOutPage cp;

	@Given("^User is on Green cart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		driver = Base.getDriver();
		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^User searched for (.+) vegetable$")
	public void user_searched_for_vegetable(String string) throws InterruptedException {
		h = new HomePage(driver);
		h.getSearch().sendKeys(string);
		// driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		Thread.sleep(2000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String string1) {
		String txt = driver.findElement(By.cssSelector("h4.product-name")).getText();
		System.out.println(txt);
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string1));
	}

	/*
	 * @Then("^verify selected \"([^\"]*)\" items are displayed in Check out page$")
	 * public void
	 * verify_selected_something_items_are_displayed_in_check_out_page(String
	 * strArg1) throws Throwable { //String txt1 =
	 * driver.findElement(By.cssSelector("p.product-name")).getText();
	 * //System.out.println(txt1);
	 * 
	 * }
	 */

	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		// driver.findElement(By.cssSelector("span.cart-count")).getText();
		Thread.sleep(3000);
	}

	@And("^User proceeded to Checkout page for purchase$")
	public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
	}


	@Then("^verify selected (.+) items are displayed in Check out page$")
	public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
		cp = new CheckOutPage(driver);
		Assert.assertTrue(cp.getProductName().getText().contains(name));
	}

}
