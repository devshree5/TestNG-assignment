import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test 2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test 3");
  }
}
