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

    public void menu() {
        while (true) {
            System.out.println("""
        ==================================
              SISTEMA DE CLIENTES
        ==================================
        1. Agregar cliente
        2. Mostrar clientes
        3. Actualizar cliente
        4. Eliminar cliente
        5. Salir
        ==================================
        Seleccione una opcion:
    """);
            int opc = leer.nextInt();
            leer.nextLine(); // limpiar buffer

            switch (opc) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    System.out.print("Cedula del cliente: ");
                    String cedula = leer.nextLine();
                    System.out.print("Nuevo telefono: ");
                    String telefono = leer.nextLine();
                    System.out.print("Nuevo correo: ");
                    String correo = leer.nextLine();

                    boolean telefonoActualizado = controlador.actualizarTelefono(cedula, telefono);
                    boolean correoActualizado = controlador.actualizarCorreo(cedula, correo);

                    if (telefonoActualizado && correoActualizado) {
                        System.out.println("Cliente actualizado");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Cedula del cliente: ");
                    cedula = leer.nextLine();
                    if (controlador.eliminarCliente(cedula)) {
                        System.out.println("Cliente eliminado con exito :D");
                    } else {
                        System.out.println("No existe cliente a eliminar");
                    }
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion incorrecta:D");
            }
        }
    }
    
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
