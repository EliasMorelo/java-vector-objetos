package vectordeobjetos;

import javax.swing.JOptionPane;

public class Vector {

    private Estudiante dato[];
    private int tam;

    public Vector(int tam) {
        dato = new Estudiante[tam];
        this.tam = tam;
    }

    public Estudiante getDato(int pos) {
        return dato[pos];
    }

    public void setDato(Estudiante dato, int pos) {
        this.dato[pos] = dato;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void llenarVector() {
        for (int j = 0; j < getTam(); j++) {
            Estudiante nuevo = new Estudiante();
            nuevo.llenarEstudiante();
            dato[j] = nuevo;
        }
    }

    public void mostarVector() {
        String mensaje = "", objeto = "";
        Estudiante aux = new Estudiante();
        for (int j = 0; j < getTam(); j++) {
            aux = dato[j];
            mensaje += "Codigo: " + aux.getCodigo() + "\u2000Nombre: " + aux.getNombre()
                    + "\u2000Nota Final: " + aux.promedio() + "\n";
        }
        JOptionPane.showMessageDialog(null,"Estudiantes registrados: "+"\n"+mensaje);
    }

    public void ordenarPorPromedios() {
        Estudiante aux = new Estudiante();
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < dato.length; j++) {
                if (dato[i].promedio() > dato[j].promedio()) {
                    aux = dato[i];
                    dato[i] = dato[j];
                    dato[j] = aux;
                }
            } 
        }
    }

    public void mostarVector(int tope) {
        String mensaje = "";
        Estudiante aux = new Estudiante();
        for (int j = 0; j < tope; j++) {
            aux = dato[j];
            mensaje += "Codigo: " + aux.getCodigo() + "\u2000Nombre: " + aux.getNombre()
                    + "\u2000Nota Final: " + aux.promedio() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Los 5 primeros estudiantes con mejores promedios en orden descendente son: "+"\n"+mensaje);
    }

}
