package prArrayAsociativo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestsArrayAsociativo {

	ArrayAsociativo aa;
	
	@After
	public void finish(){
		aa = null;
	}
	
	@Test
	public void test1() {
		aa = new ArrayAsociativo();
		assertEquals(new Integer(0), new Integer(aa.size()) );
	}
	
	@Test
	public void test2(){
		String[] keys =  {"uno","dos","tres"};
		String[] values = {"1","2","3"};
 		aa = new ArrayAsociativo(keys,values);
 		assertEquals(new Integer(keys.length),new Integer(aa.size()));
	}

}
