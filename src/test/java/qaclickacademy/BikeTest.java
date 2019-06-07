package qaclickacademy;

import org.testng.annotations.Test;

public class BikeTest {
	@Test
	public void bikemodel() {
		System.out.println("R15");
	}
@Test
public void bikeprice() {
	System.out.println("150000");
}
@Test(dependsOnMethods= {"bikemodel"})
public void bikecc() {
	System.out.println("150cc");
}
}
