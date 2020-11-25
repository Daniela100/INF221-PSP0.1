package trabalho_psp0_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> func = new ArrayList<Integer>();
		int andares;
		Scanner input = new Scanner(System.in);
		CustoMinimo result;
		
		andares = input.nextInt();
		
		for(int i=0 ; i<andares ; i++) {
			func.add(input.nextInt());
		}
		
		result = new CustoMinimo(func, andares);
		
		System.out.print(result);
		input.close();
	}
}
