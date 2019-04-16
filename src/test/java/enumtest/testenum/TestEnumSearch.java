package enumtest.testenum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEnumSearch {
	String monthName = Month.contains("January");
	
	@Test
	public void test() {
		
		//assertNotNull(monthName);
		assertEquals("Jan 31",monthName);
	}

}
