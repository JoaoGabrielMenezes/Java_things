package project;
import java.util.Scanner;


public class AreaDoCirculo {


	/*public static NumberFormat format() {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        return new DecimalFormat("0.0000", symbols);
        
        NumberFormat formatter = format();
    }*/
	
	
	public static void main(String[] args) {
 

		double n = 3.14159;
		double a,r;
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		a = n * Math.pow(r, 2);
		
	    System.out.printf("A=%.4f\n",a);

	}

}
