/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClienteModel;

/**
 *
 * @author pc
 */
public class cliente_model {
    
    // Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    
    // Constructor
    public cliente_model(String cedula, String nombre, String apellido, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
}
