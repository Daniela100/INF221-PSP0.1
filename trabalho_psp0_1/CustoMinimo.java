/*
 * Nome da classe: CustoMinimo
 * Autor(a): Daniela
 * Data início de implementação: 23/11/2020
*/

package trabalho_psp0_1;

import java.util.ArrayList;

public class CustoMinimo {
	
	private int custo_minimo;
	private int n_andares;
	private ArrayList<Integer> func;
	private ArrayList<Integer> andares = new ArrayList<Integer>();
	private ArrayList<Integer> custos_p_andar = new ArrayList<Integer>();
	
	CustoMinimo(ArrayList<Integer> f, int n) {
		
		func = new ArrayList<Integer>(f);
		n_andares = n;
		
		custo_por_andar();
	}
	
	public void custo_por_andar() {
		
		int custo;
		custo_minimo = 10000; 
		
		for(int i=0 ; i<n_andares ; i++) {
			custo = 0;
			for(int j=0 ; j<n_andares ; j++) {
				if(j != i) {
					custo += (2 * (Math.abs(i - j)) * func.get(j));
				}
			}
			
			custos_p_andar.add(custo);			
			
			if(custo < custo_minimo) {
				custo_minimo = custo;
			}
		}
		
		setAndares();
	}
	
	void setAndares() {
		
		for(int i=0 ; i<n_andares ; i++) {
			if(custos_p_andar.get(i) == custo_minimo) {
				andares.add(i+1);
			}
		}
	}
	
	public int getCustoMinimo() {
		
		return custo_minimo;
	}
	
	public String toString() {
		
		String result = "";
		
		result += Integer.toString(getCustoMinimo()) + "\n";
		
		for(int i=0 ; i<andares.size() ; i++) {
			result += Integer.toString(andares.get(i));
			if(i == andares.size()-1) {
				result += "\n";
			}
			else {
				result += " ";
			}
		}
		
		return result;		
	}
}