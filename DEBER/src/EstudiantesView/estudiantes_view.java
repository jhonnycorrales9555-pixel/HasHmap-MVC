/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstudiantesView;
import EstudiantesController.estudiantes_controller;
import EstudiantesModel.estudiantes_model;
import java.util.Scanner;

/**
 *
 * @author Nikholov
 */
public class estudiantes_view {
    Scanner sc = new Scanner(System.in);
    estudiantes_controller controlador = new estudiantes_controller();
    
    public void menu(){
        while(true){
        System.out.println("****************");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion: ");
        int opc = sc.nextInt();
        
            switch(opc){
            case 1:
                System.out.println("Ingresa la cedula: ");
                String cedula= sc.nextLine();
                sc.nextLine();
                System.out.println("Ingresa el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingresa el apellido: ");
                String apellido = sc.nextLine();
                System.out.println("Ingresa la carrera: ");
                String carrera = sc.nextLine();
                
                estudiantes_model estudiante = new estudiantes_model(cedula , nombre , apellido , carrera );
                controlador.agregarEstudiantes(estudiante);
                break;

            case 2:
                controlador.listarEstudiante();
                break;
            case 3:
                System.out.println("Cedula del estudiante: ");
                cedula = sc.nextLine();
                sc.nextLine();
                System.out.println("Nuevo nombre: ");
                nombre = sc.nextLine();
                System.out.println("Nuevo Apelldio: ");
                apellido = sc.nextLine();
                System.out.println("Nueva carrera: ");
                carrera = sc.nextLine();
                
                if(controlador.actualizarEstudiante(cedula, nombre, apellido, carrera)){
                    System.out.println("Estudiante actualizado");
                }else{
                    System.out.println("Estudiante no encontrado");
                }
                break;
            case 4:
                //eliminar
                System.out.println("Cedula del estudiante: ");
                cedula = sc.nextLine();
                if (controlador.eliminarEstudiante(cedula)) {
                    System.out.println("Estudiante eliminado con exito :D");  
                }else{
                    System.out.println("No existe estudiante a eliminar");
                }
                break;
            case 5:
                System.out.println("GRCIAS POR USAR EL PROGRAMA");
                System.exit(0);
                break;
            default:
                System.out.println("opcion incorrecta:D");
            
        }
        }
    }
}
