package newtest1;

import org.testng.annotations.Test;

public class mytest
{
	@Test
	private static void customerTest() 
	{
		System.out.println("verified");
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("browser"));
		
	}

}
