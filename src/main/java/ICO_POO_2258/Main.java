package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mensaje = "Escribe tu Nombre,Profesion y Pais de origen: ";
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println(mensaje);

        cadena = teclado.nextLine();

        String[] separado = cadena.trim().split(" ");
        String Nombre = separado[0];
        String Profesion = separado[1];
        String Pais = separado[2];

        System.out.println("NOMBRE: "+separado[0].toUpperCase());
        System.out.println("PROFESION: "+separado[1].toUpperCase());
        System.out.println("PAIS: "+separado[2].toUpperCase());

                //System.out.println(separado[i].toUpperCase());


    }
}