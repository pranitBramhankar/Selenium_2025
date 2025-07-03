package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeGroups {
	
  @Test(priority=1, groups= {"sanity"})
  @Parameters({"name"})
  public void f(String name) {  
	  System.out.println("You can do it "+name);
  }
  
  @Test(priority=2, groups= {"sanity"}, dataProvider="dp1")
  public void g(String s) {
	  System.out.println("I am doing well "+s);
	 // Assert.fail();
  }
  
  @Test(priority=3, dependsOnMethods= {"f"}, groups= {"sanity"})
  public void h() {
	  System.out.println("I got offer from tcs");
  }
  
  @DataProvider(name="dp1")
  String[] Data() {
	  
	  String [] a = {"pranit","yogesh","dhiraj"};
	  
	  return a;
  }
}
