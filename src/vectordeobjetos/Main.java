package vectordeobjetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int salir = 0;
        do {
            int v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a ingresar.\n"
                    + "Recuerde que el número debe ser mayor o igual a 5"));
            
            if (v >= 1) {

                Vector vec = new Vector(v);
                vec.llenarVector();
                vec.mostarVector();
                vec.ordenarPorPromedios();
                vec.mostarVector(1);
                
            }
            
            else{
          JOptionPane.showMessageDialog(null, "ERROR!! Por favor ingrese un número mayor o igual a 5");
           }
            salir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Salir?\n1: Sí\n0: No"));
        }while (salir != 1);
    
    }

}
