package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test10 
{
	@Test
   public void m1()
   {
	   Assert.assertEquals(10, 10);
	   System.out.println("From M1");
   }
}
