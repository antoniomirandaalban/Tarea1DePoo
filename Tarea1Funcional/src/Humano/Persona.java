package Humano;

public class Persona {// la clase es persona

    // atributos 
    String Color;
    String Idioma;
    String Sexo;
    String Nacionalidad;
    int Edad;

    // metodos 
    public static void main(String[] args) {

        Persona Individuo = new Persona();

        //consumir 
        Individuo.Color = "Mestizo";
        Individuo.Idioma = "Frances";
        Individuo.Sexo = "Mujer";
        Individuo.Nacionalidad = "Colombiana";
        Individuo.Edad = 19;

        // imprimir 
        System.out.println("El color del individuo es:  " + Individuo.Color);
        System.out.println("El idioma del individuo es: " + Individuo.Idioma);
        System.out.println("El sexo del individuo: " + Individuo.Sexo);
        System.out.println("Su nacionalidad es: " + Individuo.Nacionalidad);
        System.out.println("Su edad es: " + Individuo.Edad);

    }

}
