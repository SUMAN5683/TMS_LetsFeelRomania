package Practice;

import org.testng.annotations.Test;

public class CommandLineDataPass {
	@Test
	public void travelTo() {
		String to=System.getProperty("to");
		String from=System.getProperty("from");
		String name=System.getProperty("name");
		
		System.out.println(to);
		System.out.println(from);
		System.out.println(name);
		System.out.println(System.getenv());
	}

}