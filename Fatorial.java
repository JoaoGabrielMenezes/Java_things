package project;

import java.util.Scanner;

public class Fatorial {

		
	int num = 0;
	int fat = 1;
	String form = "";

	
	public void setValor(int n) {
		num = n;
		int f = 1;
		String s = "";
		for (int i = n; i > 1; i--) {
			f *= i;
			s += i + " x ";
		}
		s += "1 = ";
		fat = f;
		form = s;
	}
	
	public int getFat() {
		return fat;
	}
	
	public String getForm() {
		return form;
	}
	
	public static void main(String[] args) {
		Fatorial fato = new Fatorial();
		int fat;
		Scanner sc = new Scanner(System.in);
		fat = sc.nextInt();
		if (fat > 20) {
			System.err.println("Ai n ne parça!!!");
		}else {
			fato.setValor(fat);
			System.out.println(fato.getForm()+fato.getFat());
		}

	}
	
	
}
