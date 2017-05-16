package prArrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsArrayAsociativo {

	@Test
	public void test1() {
		ArrayAsociativo aa = new ArrayAsociativo();
		assertEquals(new Integer(0), new Integer(aa.size()) );
	}

}
