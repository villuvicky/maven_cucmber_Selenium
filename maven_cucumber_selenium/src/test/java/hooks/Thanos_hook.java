package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Thanos_hook {
	
	@Before(order = 1, value = "@Thanos")
	public void Thanos_collecting_Stones(Scenario sc) {
		System.out.println("Thanos_collecting_Stones");
		System.out.println(sc.getClass());
		System.out.println(sc.getId());
		System.out.println(sc.getName());
		System.out.println(sc.getLine());
		System.out.println(sc.getSourceTagNames());
		System.out.println(sc.getStatus());
		System.out.println(sc.getUri());
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
