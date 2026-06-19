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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        producto_controller controlador = new producto_controller();

        String op;

        do {

            System.out.println("""
                    ============
                       MENU
                    ============
                    1. INGRESAR
                    2. MOSTRAR
                    3. ELIMINAR
                    4. SALIR
                    """);

            op = sc.nextLine();

            switch (op) {

                case "1":

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

                    producto_model p = new producto_model(
                            codigo, nombre, marca,
                            precio, cantidad, stock);

                    controlador.agregar(p);

                    System.out.println("Producto registrado");
                    break;

                case "2":

                    for (producto_model prod :
                            controlador.listar().values()) {

                        System.out.println("----------------");
                        System.out.println("Codigo: " + prod.getCodigo());
                        System.out.println("Nombre: " + prod.getNombre());
                        System.out.println("Marca: " + prod.getMarca());
                        System.out.println("Precio: " + prod.getPrecio());
                        System.out.println("Cantidad: " + prod.getCantidad());
                        System.out.println("Stock: " + prod.getStock());
                    }

                    break;

                case "3":

                    System.out.print("Codigo a eliminar: ");
                    String cod = sc.nextLine();

                    controlador.eliminar(cod);

                    System.out.println("Eliminado");
                    break;

                case "4":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!op.equals("4"));
    }
}
    
    

