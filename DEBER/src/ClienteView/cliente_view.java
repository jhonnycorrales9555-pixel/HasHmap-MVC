/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClienteView;
import ClienteController.cliente_controller;
import ClienteModel.cliente_model;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class cliente_view {
    Scanner leer = new Scanner(System.in);
    cliente_controller controlador = new cliente_controller();
    
     public void registrarCliente() {

        System.out.print("Cedula: ");
        String cedula = leer.next();

        System.out.print("Nombre: ");
        String nombre = leer.next();

        System.out.print("Apellido: ");
        String apellido = leer.next();

        System.out.print("Telefono: ");
        String telefono = leer.next();

        System.out.print("Correo: ");
        String correo = leer.next();

        cliente_model cliente = new cliente_model(
                cedula,
                nombre,
                apellido,
                telefono,
                correo
        );

        controlador.agregarCliente(cliente);

        System.out.println("Cliente registrado correctamente.");
    }
     public void mostrarClientes() {
        controlador.mostrarClientes();
    }

    
}
