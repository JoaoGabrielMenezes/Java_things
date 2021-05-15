package project;

import java.util.Scanner;

public class Piramide {

	  public static void main(String[] args) {
	        int filas;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Insira o tamanho da piramide (limite 50): ");
	        filas = sc.nextInt();
	        if (filas <= 50) {
		        System.out.println(piramideChain(filas));
			}else {
				System.err.println("No more than 50");
			}

	    }

	    private static String piramideChain(int filas) {
	        String saida = "";
	        int ast = 1;
	        int spc = filas;
	        
	        for (int i = 0; i < filas; i++) {

	            for (int j = 0; j < spc; j++) {
	                saida += " ";
	            }
	            for (int j = 0; j < ast; j++) {
	            	saida += "*";
	            }

	            saida += "\n";
	            ast +=2;
	            spc--;
	        }
	        return saida;
	    }
	}