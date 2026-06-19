/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductoView;

import ProductoController.producto_controller;
import ProductoModel.producto_model;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class producto_view {
    
   Scanner sc = new Scanner(System.in);
    producto_controller controlador = new producto_controller();

    public void menu() {

        while (true) {

            System.out.println("""
                  SISTEMA DE PAPELERIA
                               
            1. Agregar producto
            2. Mostrar productos
            3. Eliminar producto
            4. Salir
            ==================================
            Seleccione una opcion:
            """);

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:

                    System.out.print("Codigo: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());

                    System.out.print("Cantidad: ");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    System.out.print("Stock: ");
                    int stock = Integer.parseInt(sc.nextLine());

                    producto_model producto = new producto_model(
                            codigo,
                            nombre,
                            precio,
                            cantidad,
                            stock);

                    controlador.agregar(producto);

                    System.out.println("Producto registrado");
                    break;

                case 2:

                   controlador.listarProducto();
                    break;

                case 3:
                    System.out.print("Codigo a eliminar: ");
                    String cod = sc.nextLine();

                    if (controlador.eliminarProducto(cod)) {
                        System.out.println("Producto eliminado con exito");
                    } else {
                        System.out.println("No existe producto a eliminar");
                    }

                    break;
    

                case 4:

                    System.out.println("GRACIAS POR USAR EL SISTEMA");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Opcion incorrecta");
            }
        }
    }

    public static void main(String[] args) {

        producto_view vista = new producto_view();
        vista.menu();

    }
}
    
    

