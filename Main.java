package interfaces;

public class Main {

    public static void main(String[] args) {
	    Perro perro = new Perro();
	    Lagarto lagarto = new Lagarto();
	    
        String perrete = perro.mostrarNombre();
        String lagartija = lagarto.mostrarNombre();
       
        System.out.println(perrete);
        perro.tipoDeAnimal();
        
        System.out.println(lagartija);
        lagarto.tipoDeAnimal();
        
    }
}