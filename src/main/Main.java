package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");

        System.out.println(returnReverseString("Hoy es 28 de Julio"));
    }

    public static String returnReverseString(String text){
        var cadena = "";
        for(var i=text.length()-1; i>=0 ;i--){
            //.charArt(indice) te devuelve un char de argumento int dado
            cadena += text.charAt(i);
        }
        return cadena;
    }

}
