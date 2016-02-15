package pruebas;
public class Rectangulo {

	int longitud, ancho;
	public Rectangulo(int l, int a){
		longitud = l;
		ancho = a;
	}
public int perimetro(){
	return 2*(longitud+ancho);
}

	
public static void main(String [] args){
	Rectangulo r = new Rectangulo(3,4);
	System.out.println("el perimetro es " + r.perimetro());
}

}