package TestCases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertprog {
	
	@Test
	
	public void method1() {
		
		
		//Assert.assertEquals(true,true);
		//Assert.assertEquals(false, false);
		//Assert.assertEquals(400,201);
	 SoftAssert s= new SoftAssert();
	 System.out.println("method 1 started");
	 s.assertEquals(false, false);
	 System.out.println("method 1");
	s.assertEquals(400,201);
	s.assertEquals(true, false);
	System.out.println("main method ended");
	s.assertAll();
	}
	
	@Test
	
	public  void method2() {
		
	SoftAssert s= new SoftAssert();
	 System.out.println("method 2 started");
	 s.assertEquals(false, false);
	 System.out.println("method 2");
	s.assertEquals(400,201);
	s.assertEquals(true, false);
	System.out.println("main method ended");
	}

	
	
	
	
}
