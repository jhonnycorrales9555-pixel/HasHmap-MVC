/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber;
import java.util.HashMap;
import java.util.Scanner;

public class EJERCICIOHashMap {
    //creacion HashMap para el inventario de una papeleria
static HashMap<String,String>inventario = new HashMap<>();
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op=sc.nextLine();
        switch(op){
            case "1": ingresar(); break;
            case "2": mostrar(); break;
        }
    }
    
    public static void ingresar(){
        System.out.println("ID: ");
        String codigo = sc.nextLine();
        System.out.println("NOMBRE: ");
        String nombre = sc.nextLine();
        System.out.println("MARCA: ");
        String marca =sc.nextLine();
        System.out.println("PRECIO: ");
        String precio = sc.nextLine();
        System.out.println("CANTIDAD: ");
        String cant = sc.nextLine();
        System.out.println("STOCK ACTUAL: ");
        String stock = sc.nextLine();
        
       inventario.put(codigo,nombre+","+cant+","+stock);
           
    }
    public static void mostrar(){
        if (inventario.isEmpty()) {
            System.out.println("NO EXISTE");
            return;
        }else{
            for (String codigo :inventario.keySet()) {
            String [] datos = inventario.get(codigo).split(",");
                System.out.println("");
                System.out.println("CODIGO: "+codigo);
                System.out.println("NOMBRE: "+datos[0]);
                System.out.println("MARCA: "+datos[1]);
                System.out.println("PRECIO: "+datos[2]);
                System.out.println("CANTIDAD: "+datos[3]);
                System.out.println("STOCK ACTUAL: "+datos[4]);
            
                
            }
        }
    }
}
