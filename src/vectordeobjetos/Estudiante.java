package vectordeobjetos;

import javax.swing.JOptionPane;

public class Estudiante {

    private String nombre;
    private int codigo;
    private float nota1, nota2, nota3, notas, promedio;

    public Estudiante() {
        nombre = "";
        codigo = 0;
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float promedio() {
        return promedio = (float) (notas / 3);
    }

    public void llenarEstudiante() {
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
        setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante")));
        setNota1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota del estudiante")));
        setNota2(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota del estudiante")));
        setNota3(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota del estudiante")));
        notas += getNota1() + getNota2() + getNota3();
    }
}
