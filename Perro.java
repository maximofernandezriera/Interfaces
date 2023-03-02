package interfaces;

public class Perro implements Animal {
	
	
	//https://docs.oracle.com/javase/tutorial/java/IandI/override.html
    
	@Override
    public void tipoDeAnimal() {
        System.out.println("Soy un mamifero");
    }

    @Override
    public String mostrarNombre() {
        return "Perro";
    }

    }