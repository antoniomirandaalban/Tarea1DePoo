package ClasesyObjetos1;

public class Cat { // la clase es gato

// atributos
    String Color;
    String Raza;
    String Sonido;
    int Saltar;
    int Velocidad;

    //metodos
    public static void main(String[] args) {

        Cat Gato = new Cat();

        //consumir Gato
        Gato.Color = "azul";
        Gato.Raza = "Van cat";
        Gato.Sonido = "Maullido";
        Gato.Saltar = 5;
        Gato.Velocidad = 26;

        // imprimir
        System.out.println("El color del gato " + Gato.Color);
        System.out.println("La raza del gato es " + Gato.Raza);
        System.out.println("El sonido del gato es " + Gato.Sonido);
        System.out.println("El salto del gato es de " + Gato.Saltar);
        System.out.println("La velocidad del gato es " + Gato.Velocidad);

    }
}
