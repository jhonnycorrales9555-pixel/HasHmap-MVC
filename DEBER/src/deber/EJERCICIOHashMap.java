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
        System.out.println("""
        ===============
          C  R  U  D  
        ===============
        1.-INGRESAR
        2.-MOSTRAR
        3.-ACTUALIZAR
        4.-ELIMINAR
        5.-SALIR
        ===============""");
        switch(op){
            case "1": ingresar(); break;
            case "2": mostrar(); break;
            case "3":  actualizar(); break;
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
    
    public static void actualizar(){
        if (inventario.isEmpty()) {
        System.out.println("NO EXISTE");
        return;
        }else{
        System.out.print("INGRESE CODIGO: ");
        String codigoEdit = sc.nextLine();
            if (inventario.containsKey(codigoEdit)) {
            System.out.println("NUEVO NOMBRE: ");   
            String nNombre=sc.nextLine();
            System.out.println("NUEVA MARCA: ");
              String nMarca=sc.nextLine();
            System.out.println("NUEVO PRECIO: ");  
             String nPrecio=sc.nextLine();
            System.out.println("NUEVA CANTIDAD"); 
            String nCantidad=sc.nextLine();
            System.out.println("NUEVO STOCK: ");     
            String nStock=sc.nextLine();
            String nuevosDatos= nNombre+","+nPrecio+","+nCantidad+","+nStock;
            inventario.put(codigoEdit,nuevosDatos);
            }
              } 
    }
    public static void eliminar(){
     if (inventario.isEmpty()) {
        System.out.println("""
        -------------------------
         NO EXISTE INVENTARIO
        -------------------------""");
        return;  
      }else {
          System.out.println("\n==============================");
          System.out.println("CODIGO A ELIMINAR: ");
          String CodigoBorrar=sc.nextLine();
         if (inventario.containsKey(CodigoBorrar)){
             inventario.remove(CodigoBorrar);
             System.out.println("INVENTARIO ELIINADO CON EXITO");
             System.out.println("==============================\n");
         }else {
             System.out.println("\nNO SE ENCONTRO EL CODIGO");
         }         
        }
    }
    }

