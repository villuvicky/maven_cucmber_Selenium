package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanos_hook {
	
	@Before(order = 1, value = "@Thanos")
	public void Thanos_collecting_Stones() {
		System.out.println("Thanos_collecting_Stones");
	}

	@After(order = 1, value = "@Thanos")
	public void Thanos_settled_in_garden() {
		System.out.println("Thanos_settled_in_garden");
	}
	@Before(order = 0, value = "@Thanos")
	public void Thanos_has_born() {
		System.out.println("Thanos_has_born");
	}

	@After(order = 0, value = "@Thanos")
	public void Thanos_died() {
		System.out.println("Thanos_died");
	}
}
