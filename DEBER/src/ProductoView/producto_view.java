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
            ==================================
                  SISTEMA DE PAPELERIA
            ==================================
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

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());

                    System.out.print("Cantidad: ");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    System.out.print("Stock: ");
                    int stock = Integer.parseInt(sc.nextLine());

                    producto_model producto = new producto_model(
                            codigo,
                            nombre,
                            marca,
                            precio,
                            cantidad,
                            stock);

                    controlador.agregar(producto);

                    System.out.println("Producto registrado");
                    break;

                case 2:

                    if (controlador.listar().isEmpty()) {
                        System.out.println("No existen productos");
                    } else {

                        for (producto_model prod : controlador.listar().values()) {

                            System.out.println("\n----------------------");
                            System.out.println("Codigo: " + prod.getCodigo());
                            System.out.println("Nombre: " + prod.getNombre());
                            System.out.println("Marca: " + prod.getMarca());
                            System.out.println("Precio: " + prod.getPrecio());
                            System.out.println("Cantidad: " + prod.getCantidad());
                            System.out.println("Stock: " + prod.getStock());
                        }
                    }

                    break;

                case 3:

                    System.out.print("Codigo a eliminar: ");
                    String cod = sc.nextLine();

                    controlador.eliminar(cod);

                    System.out.println("Producto eliminado");
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
    
    

