package Transporte;

public class Carro { // la clase es Carro

    //atributos 
    String Marca;
    String Combustible;
    int Capacidad;
    int Marcha;
    int Velocidad;

    // metodos 
    public static void main(String[] args) {

        Carro vehiculo = new Carro();

        //consumir vehiculo
        vehiculo.Marca = "NISSAN";
        vehiculo.Combustible = "Gasolina";
        vehiculo.Capacidad = 4;
        vehiculo.Marcha = 5;// en que marcha se encuentra el vehiculo, no el total de marchas
        vehiculo.Velocidad = 140;

        // imprimir 
        System.out.println("La marca del vehiculo es  " + vehiculo.Marca);
        System.out.println("Tanquee con " + vehiculo.Combustible);
        System.out.println("Capacidad de pasajeros es  " + vehiculo.Capacidad);
        System.out.println("La marcha es " + vehiculo.Marcha);
        System.out.println("La velocidad del vehiculo  es " + vehiculo.Velocidad);

    }

}
