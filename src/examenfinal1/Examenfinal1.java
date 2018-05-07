
package examenfinal1;

import javax.swing.JOptionPane;

/*
En la void main se crea una instacia de la lista, variables la cuales almacenaran los datos introducidos por el usuario
y seran los parametros para crear un nuevo usuario. se crea un ciclo while el cual estara ejecutando un panel de dialogo que
le pedira al usuario introducir un numero para que pueda accesar a uno de los menus. cuando se inserta un 1 el menu pedira
que se ingrese un numero de clave y seguido de esto un nombre, a la segunda vez que ingresemos un usuario verificara que e
numero de clave no exista y dejara crear un nuevo usuario, en caso contrario desplegara un panel indicando que el numero de 
clave ya existe-
al introducir un numero de dos se llamara al metodo modificar de la clase lista el cual buscara por numero de clave y le permitira
al usuario cambiar su numero de clave y su nombre
al introducir un 4 Se mostraran los usuario previamente creados con la flecha de como apunta un nodo a otro
al introducir un 5 se mostrara el tamaño de la lista(el numero de usuario que se han creado)
 * @author Ivan Flores
 */
public class Examenfinal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean menu = true;
        Lista lista = new Lista();
        int menu2;
        int parametro;
        String parametro2;
        while(menu){
            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Crear usuario\n"+
                                                                    "2.Modificar usuario\n"+
                                                                    "3.Eliminar usuario\n"+
                                                                    "4.Mostrar usuarios\n"+
                                                                    "5.Mostrar tamaño\n"+
                                                                    "6.salir"           ));
            switch(menu2){
                case 1:
                    parametro = Integer.parseInt(JOptionPane.showInputDialog(null,"numero de usuario"));
                    if(lista.partida!= null){
                       lista.buscar(parametro); 
                    }
                    if(lista.bandera == true){
                        parametro2= JOptionPane.showInputDialog(null,"Nombre del usuario"); 
                        lista.Crearusuario(parametro, parametro2);
                    }
                    lista.bandera = true;
                    break;
                case 2:
                    parametro = Integer.parseInt(JOptionPane.showInputDialog(null,"numero de usuario"));
                    lista.modificar(parametro);
                    break;
                case 3:
                   
                    break;
                case 4:
                    lista.mostrarusuarios();
                    break;
                case 5:
                    lista.tamaño();
                    break;
                case 6:
                    menu = false;
                    break;
            }
        }
    }
    
    
}
