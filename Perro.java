package interfaces;

public class Perro implements Animal {
	
	
	//https://docs.oracle.com/javase/tutorial/java/IandI/override.html
    
	
    public void tipoDeAnimal() {
        System.out.println("Soy un mamifero");
    }


    public String mostrarNombre() {
        return "Perro";
    }

    }
