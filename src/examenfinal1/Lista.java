
package examenfinal1;

import javax.swing.JOptionPane;
/*
En Esta clase se crea un metodos con los cuales se puede crear un usuario, modificarlos, buscarlo y motrar los usuarios
que se han creado.
En el metodo crear usuario, le pediremos al usuario que ingrese un numero de clave y su nombre
en el metodo al nuevo usuario se le pide que apunte al usuario que apuntaba nuestro nodo de partida y que el nuevo nodo se
el nuevo nodo de partida
En Metodo mostrar usuario se crea nodo que apunte al que apunta nuestro punto de partida y lo colocamos en un ciclo que guarda
los datos del usuario y que se mueve al siguiente nodo al que apunta
El metodo buscar implementa lo mismo que el metodo mostrar con la diferencia que este levanta una bandera para que no deje crear un usario
En el metodo modificar implementa los mismo que los metodos motrar y buscar con la diferencia que le da la opcion al usuario de cambiar
su clave y su nombre si asi lo desea
*/
public class Lista {
    Nodo partida;
    boolean bandera = true;
    int tamaño = 0;
    public Lista(){
        partida = null;
    }
    public Lista Crearusuario(int parametro, String Parametro2){
        Nodo nuevousuario = new Nodo(parametro, Parametro2);
        if(partida!=null){
            nuevousuario.next = partida.next;
            partida.next= nuevousuario;
        }
        partida = nuevousuario;
        return this;
    }
    public void mostrarusuarios(){
        Nodo random = partida.next;
        String Mostrar = " ";
        do{
            Mostrar = Mostrar + random.clave +". "+ random.Nombreusuario+">>" ;
            random = random.next;
            tamaño++;
        }
        while(random != partida.next);
        JOptionPane.showMessageDialog(null, Mostrar,"Lista",JOptionPane.INFORMATION_MESSAGE);
    }
    public void buscar(int numero){
        Nodo random = partida.next;
        do{
            if(random.clave== numero){
               JOptionPane.showMessageDialog(null,"ya existe","Error",JOptionPane.ERROR_MESSAGE);
               bandera = false;
          }  
        }while(random!= partida.next);
    }
    public void modificar(int numero){
        Nodo random = partida.next;
        do{
             if(random.clave== numero){
                 random.clave = Integer.parseInt(JOptionPane.showInputDialog(null,"numero de usuario"));
                 random.Nombreusuario= JOptionPane.showInputDialog(null,"Nombre del usuario");
            }
           }
        while(random != partida.next);
    }
    public void tamaño(){
        JOptionPane.showMessageDialog(null,"el tamaño de la lista es: " +tamaño,"lista",JOptionPane.INFORMATION_MESSAGE);
    }
}
