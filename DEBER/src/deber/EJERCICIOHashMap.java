/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber;
import java.util.HashMap;
import java.util.Scanner;

public class EJERCICIOHashMap {
    //creacion HashMap para el inventario de una papeleria
static HashMap<String,Object>inventario = new HashMap<>();
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        agregar();
    }
    
    public static void agregar(){
        System.out.println("ID: ");
        String codigo= sc.nextLine();
        sc.nextLine();
        System.out.println("NOMBRE: ");
        String nombre = sc.nextLine();
        System.out.println("MARCA: ");
        String marca =sc.nextLine();
        System.out.println("PRECIO: ");
        double precio = sc.nextInt();
        System.out.println("CANTIDAD: ");
        String cant = sc.nextLine();
        System.out.println("STOCK ACTUAL: ");
        String stock = sc.nextLine();
        
       String producto= nombre+","+cant+","+stock+",";
       inventario.put(codigo,producto);
        
    }
}
