/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstudiantesModel;

/**
 *
 * @author Nikholov
 */
public class estudiantes_model {
    // Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String carrera;
   
    
    // Constructor
    public estudiantes_model(String cedula, String nombre, String apellido, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = telefono;
        
    }
        public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCarrera() {
        return carrera;
    }
    
    //setters
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
        
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
        
    }
    
    @Override
    public String toString() {
        return "Cedula: " + cedula +
               "\nNombre: " + nombre +
               "\nApellido: " + apellido +
               "\nTelefono: " + carrera;
    }

    
}
