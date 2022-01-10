package Panaderia;

public class Pastel { // la clase es pastel

    // atributos 
    String Sabor;
    String Galletas; // oreo, animalitos o galleta maria
    String Temperatura; // frio o caliente
    String Textura;
    String Color;

    // metodos 
    public static void main(String[] args) {

        Pastel Sabores = new Pastel();

        //consumir 
        Sabores.Sabor = "Chocolate";
        Sabores.Galletas = "Galleta Maria";
        Sabores.Textura = "Brusco";// en que marcha se encuentra el vehiculo, no el total de marchas
        Sabores.Color = "Blanco";
        Sabores.Temperatura = "100°C";

        //imprimir 
        System.out.println("El sabor del pastel es:  " + Sabores.Sabor);
        System.out.println("Galleta utilizada es: " + Sabores.Galletas);
        System.out.println("La textura es: " + Sabores.Textura);
        System.out.println("La temperatura minina para su coccion es: " + Sabores.Temperatura);
        System.out.println("El color del pastel es: " + Sabores.Color);

    }

}
