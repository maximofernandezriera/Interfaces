package interfaces;

public class Lagarto implements Animal {

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un reptil");
    }

    @Override
    public String mostrarNombre() {
        return "Lagarto";
    }

    }