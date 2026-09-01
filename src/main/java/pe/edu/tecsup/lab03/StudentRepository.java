package pe.edu.tecsup.lab03;

import java.util.ArrayList;

public class StudentRepository {

    public ArrayList<String> listaEstudiantes = new ArrayList<>();

    public void guardar(String nombre) {
        listaEstudiantes.add(nombre);
    }

    public void listar() {
        for (String estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
}
