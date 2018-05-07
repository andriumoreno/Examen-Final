/*

 */
package examenfinal1;
/*
En la clase nodo se crean una varible tipo entero y una cadena de texto la cual alamacenaran los datos del estudiante
que son las claves y su nombre. se crea una instacia de la clase la cual es el puntero que señalara al nodo que tiene enfrente
y un contructor que recibe parametros para poder colocar nombre y usuario
 */

public class Nodo {
    int clave;
    String Nombreusuario;
    Nodo next;
    public Nodo(int parametro, String parametro2){
        clave = parametro;
        Nombreusuario = parametro2;
        next = this;
    }
    
}
