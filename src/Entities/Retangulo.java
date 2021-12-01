package Entities;

public class Retangulo {


	public double width;
	public double Height;
	
	public double area () {
		return width * Height;
	}
	
	public double perimetro() {
		return 2* (width * Height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + Height * Height);
	}
	
	
	
	
	}
