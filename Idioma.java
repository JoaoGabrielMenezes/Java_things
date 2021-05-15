package project;

import java.util.Locale;

public class Idioma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Locale loc = Locale.getDefault();
		  System.out.println("Seu idioma esta em: "+loc.toLanguageTag());
		  System.out.println("Seu idioma esta em: "+loc.toString());
	}

}
