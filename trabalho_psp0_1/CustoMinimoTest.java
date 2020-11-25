package trabalho_psp0_1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class CustoMinimoTest {
	
	ArrayList<Integer> result = new ArrayList<Integer>();
	int andares;
	CustoMinimo t;
	
	@Test
	public void test1() {
		andares = 3;
		result.add(10);
		result.add(20);
		result.add(30);
		
		t = new CustoMinimo(result, andares);
		
		String esperado = "80\n2 3\n";
		
		assertEquals(esperado, t.toString());
	}
	
	@Test
	public void test2() {
		andares = 3;
		result.add(10);
		result.add(30);
		result.add(20);
		
		t = new CustoMinimo(result, andares);
		
		String esperado = "60\n2\n";
		
		assertEquals(esperado, t.toString());
	}
	
	@Test
	public void test3() {
		andares = 3;
		result.add(30);
		result.add(10);
		result.add(20);
		
		t = new CustoMinimo(result, andares);
		
		String esperado = "100\n1 2\n";
		
		assertEquals(esperado, t.toString());
	}
	
	@Test
	public void test4() {
		andares = 5;
		result.add(80);
		result.add(50);
		result.add(10);
		result.add(5);
		result.add(15);
		
		t = new CustoMinimo(result, andares);
		
		String esperado = "290\n1 2\n";
		
		assertEquals(esperado, t.toString());
	}

}