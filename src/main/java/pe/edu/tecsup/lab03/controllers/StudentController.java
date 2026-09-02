package pe.edu.tecsup.lab03.controllers;

import java.util.ArrayList;

public class StudentController {
    public ArrayList<String> ListaEstudiantes = new ArrayList<>();

    public void Listar(){
        String[] listaEstudiante = new String[0];
        for(String estudiante : listaEstudiante) {
            System.out.println(estudiante);
        }
    }
    public void Notas(){
        String[] ListarNotas = new String[0];
        for(String estudiante : ListarNotas) {
            System.out.println(estudiante);
        }
    }
}

