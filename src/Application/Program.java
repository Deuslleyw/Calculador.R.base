package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    
	    Retangulo rect = new Retangulo();
	    
	  
	    System.out.println("Entre com os dados do retangulo");
	    rect.width = sc.nextDouble();
	    rect.Height = sc.nextDouble();
	    
	    System.out.printf(" AREA =%.2f%n", rect.area());
	    
	    System.out.printf(" PERIMETRO =%.2f%n", rect.perimetro());
	    
	    System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
	    
	    
	    
	    System.out.print("teste, Ok");
	    
	    
	    
	  
	    
	    sc.close();
	    
	}
	

}
