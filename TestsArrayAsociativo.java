package prArrayAsociativo;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Test;

public class TestsArrayAsociativo {

	private ArrayAsociativo aa;
	private	String[] keys =  {"uno","dos","tres"};
	private String[] values = {"1","2","3"};
	private ArrayAsociativo aux;

	
	@After
	public void finish(){
		aa = null;
		aux = null;
	}
	
	@Test
	public void test1() {
		aa = new ArrayAsociativo();
		assertEquals(new Integer(0), new Integer(aa.size()) );
	}
	
	@Test
	public void test2(){
		aux = new ArrayAsociativo(keys,values);
 		assertEquals(new Integer(keys.length),new Integer(aux.size()));
	}

	@Test(expected = NoSuchElementException.class)
	public void test3(){
		String key = "uno";
		aa = new ArrayAsociativo();
		aa.get(key);
	}
	
	@Test
	public void test4(){
		aux = new ArrayAsociativo(keys,values);
		String kToFind = "dos";
		String value = "2";
		String found = aux.get(kToFind);
		assertEquals(value,found);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void test5(){
		aux = new ArrayAsociativo(keys,values);
		String kToFind = "seis";
		aux.get(kToFind);
		
	}
	
	
	@Test
	public void test6(){
		String k = "uno";
		String v = "1";
		aa = new ArrayAsociativo();
		aa.put(k, v);
		assertEquals(aa.get(k), v);
		//assertEquals(new Integer(1),new Integer(aa.size()));
	}
	
	@Test
	public void test7(){
		String k = "cuatro";
		String v = "4";
		aux = new ArrayAsociativo(keys,values);
		int tam = aux.size();
		aux.put(k, v);
		assertEquals(tam+1, aux.size());
	}
	
	@Test
	public void test8(){
		String k = "uno";
		String v = "1";
		aa = new ArrayAsociativo(keys,values);
		aa.put(k, v);
		assertEquals(aa.get(k),v);
	}
	
	
	@Test
	public void test9(){
		aa = new ArrayAsociativo();
		String key = "uno";
		String def = "Default";
		String res;
		res = aa.getOrElse(key,def);
		assertEquals(def,res);
	}
	
	
	@Test 
	public void test10(){
		aa = new ArrayAsociativo(keys,values);
		String key = "uno";
		String def = "Default";
		String res;
		res = aa.getOrElse(key,def);
		assertEquals(res,aa.get(key));
	}
	
	
	@Test
	public void test11(){
		aa = new ArrayAsociativo(keys,values);
		String key = "cuatro";
		String def = "Default";
		String res;
		res = aa.getOrElse(key,def);
		assertEquals(def,res);
	}
	
	
	@Test
	public void test12(){
		aa = new ArrayAsociativo();
		String k = "uno";
		assertFalse(aa.containsKey(k));
	}
	
	@Test
	public void test13(){
		aa = new ArrayAsociativo(keys,values);
		String k = "cuatro";
		assertFalse(aa.containsKey(k));
	}
	
	
	@Test
	public void test14(){
		aa = new ArrayAsociativo(keys,values);
		String k = "uno";
		assertTrue(aa.containsKey(k));
	}
	
	
	@Test
	public void test15(){
		aa = new ArrayAsociativo();
		String k= "uno";
		assertFalse(aa.remove(k));
	}
	
	
	@Test
	public void test16(){
		aa = new ArrayAsociativo(keys,values);
		String k = "uno";
		assertTrue(aa.remove(k));
	}
	
	@Test
	public void test17(){
		aa = new ArrayAsociativo(keys,values);
		String k = "cuatro";
		assertFalse(aa.remove(k));
	}
	
}
