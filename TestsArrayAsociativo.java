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
	
}
