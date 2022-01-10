package Movilidad;

public class Bicicleta {// la clase es bicicleta 

    // atributos 
    String Color;
    String Material;
    int Altura;
    int Marcha;
    int Velocidad;

    // metodos 
    public static void main(String[] args) {

        Bicicleta movilidad = new Bicicleta();

        //consumir 
        movilidad.Color = "rojo";
        movilidad.Material = "metal";
        movilidad.Altura = 1;
        movilidad.Marcha = 3;
        //movilidad.Velocidad = 80;

        //imprimir 
        System.out.println("El color de la bicicleta es  " + movilidad.Color);
        System.out.println("El material de la bicicleta es " + movilidad.Material);
        System.out.println("El alto de la bicicleta es  " + movilidad.Altura);
        System.out.println("La marcha de la bicliteta es " + movilidad.Marcha);
        System.out.println("La velocidad de la bicicleta es " + movilidad.Velocidad);

    }

}
