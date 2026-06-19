/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber;
import ClienteView.cliente_view;
import EstudiantesView.estudiantes_view;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class DEBER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("""
        ==================================
              MENU PRINCIPAL
        ==================================
        1. Sistema de clientes
        2. Sistema de estudiantes
        3. Salir
        ==================================
        Seleccione una opcion:
    """);
            int opc = leer.nextInt();
            leer.nextLine(); // limpiar buffer

            switch (opc) {
                case 1:
                    cliente_view vistaCliente = new cliente_view();
                    vistaCliente.menu();
                    break;
                case 2:
                    estudiantes_view vistaEstudiantes = new estudiantes_view();
                    vistaEstudiantes.menu();
                    break;
                case 3:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion incorrecta:D");
            }
        }
    
    }
    
}
