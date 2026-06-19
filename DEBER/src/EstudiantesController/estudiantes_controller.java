/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstudiantesController;
import EstudiantesModel.estudiantes_model;
import java.util.ArrayList;

/**
 *
 * @author Nikholov
 */
public class estudiantes_controller {
    public ArrayList<estudiantes_model> listaEstudiante = new ArrayList<>();
    
    //agregar o crear
    
    public void agregarEstudiantes(estudiantes_model estudiante){
        listaEstudiante.add(estudiante);
        System.out.println("Estudiante agregado agregado :D");
    }
    
    //listar o mostrar
    
    public void listarEstudiante(){
        for(estudiantes_model estudiante : listaEstudiante){
            System.out.println(estudiante);
        }    
    }
    //buscar 
    public estudiantes_model buscarEstudiante(String cedula){
        for (estudiantes_model estudiante: listaEstudiante) {
            if (estudiante.getCedula().equals(cedula)) {
            return estudiante;
            }
        }
        return null;
    }
    //eliminar borrar
    public boolean eliminarEstudiante(String cedula){
        estudiantes_model estudiante = buscarEstudiante(cedula);
        if (estudiante!=null) {
            listaEstudiante.remove(estudiante);
            return true;
        }
        return false;
    }
    //
    public boolean actualizarEstudiante(String cedula,String nombre,String apellido, String carrera){
        estudiantes_model estudiante = buscarEstudiante(cedula);

        if(estudiante != null){

            estudiante.setNombre(nombre);
            estudiante.setApellido(apellido);
            estudiante.setCarrera(carrera);

            return true;
        }

        return false;
    }
}
