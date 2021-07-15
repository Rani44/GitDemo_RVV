package stepDefinition;

import com.cucumber.base.cucumber_for_beginners.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Mobile before hook");
	}
	
	@After("@MobileTest")
	public void afterValidation()
	{
		System.out.println("Mobile after hook");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation()
	{
		System.out.println("Web before hook");
	}
	
	@After("@WebTest")
	public void afterWebValidation()
	{
		System.out.println("Web after hook");
	}
	
	
	@After("@RegressionTest1")
	public void afterRegTest1()
	{
		driver.close();
	}
	
	@After("@SmokeTest1")
	public void afterSmokeTest1()
	{
		driver.close();
	}

}
