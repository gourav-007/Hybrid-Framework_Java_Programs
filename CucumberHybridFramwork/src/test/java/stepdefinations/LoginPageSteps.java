package stepdefinations;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
		String title = loginpage.getLoginPageTitle();
		System.out.println("login page title is: "+title);

	}

	@SuppressWarnings("deprecation")
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertEquals(loginpage.isForgotPwdLinkExist());
	}

	@When("user enter his username as {string}")
	public void user_enter_his_username_as(String username) {
		loginpage.enterUserName(username);
	}

	@When("password a {string}")
	public void password_a(String pwd) {
		loginpage.enterPassword(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginpage.clickOnButton();
	}
}
