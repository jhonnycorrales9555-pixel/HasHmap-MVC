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
    String op;
     do {    
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
         System.out.print("OPCION: ");
        op=sc.nextLine();
        
        switch(op){
            case "1": ingresar(); break;
            case "2": mostrar(); break;
            case "3":  actualizar(); break;
            case "4": eliminar(); break;
            case "5": System.out.println("Saliendo del sistema");
            break;
            default:
            System.out.println("!OPCION INCORRECTA!\n");break;
        }
    } while (!op.equals("5"));
    }
    
    public static void ingresar(){
        System.out.println("\n=================================");
        System.out.println("        I N G R E S A R ");
        System.out.println("---------------------------------");
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
        //restar la cantidad al stock
        int resultado = Integer.parseInt(stock) - Integer.parseInt(cant);
       inventario.put(codigo,nombre+","+marca+","+precio+","+cant+","+resultado);
        System.out.println("---------------------------------");
        System.out.println("PRODUCTO AGREGADO CON EXITO ");
        System.out.println("=================================\n");
           
    }
    public static void mostrar(){
        if (inventario.isEmpty()) {
            System.out.println("""
            -------------------------
             NO EXISTE INVENTARIO
            -------------------------""");
            return;
        }else{
        for (String codigo :inventario.keySet()) {
        String [] datos = inventario.get(codigo).split(",");
        System.out.println("\n=================================");
        System.out.println("        L I S T A R");
        System.out.println("---------------------------------");
                System.out.println("");
                System.out.println("CODIGO: "+codigo);
                System.out.println("NOMBRE: "+datos[0]);
                System.out.println("MARCA: "+datos[1]);
                System.out.println("PRECIO: "+datos[2]);
                System.out.println("CANTIDAD: "+datos[3]);
                System.out.println("STOCK ACTUAL: "+datos[4]);
                System.out.println("=================================\n");
            
                
            }
        }
    }
    
    public static void actualizar(){
        if (inventario.isEmpty()) {
            System.out.println("""
            -------------------------
             NO EXISTE INVENTARIO
            -------------------------""");
            return;
        }else{
        System.out.print("INGRESE CODIGO: ");
        String codigoEdit = sc.nextLine();
            if (inventario.containsKey(codigoEdit)) {
           System.out.println("\n=================================");
            System.out.println("     A C T U A L I Z A R ");
            System.out.println("---------------------------------");
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
            //restar la cantidad al stock
        int resultado = Integer.parseInt(nStock) - Integer.parseInt(nCantidad);
            String nuevosDatos= nNombre+","+nMarca+","+nPrecio+","+nCantidad+","+resultado;
            inventario.put(codigoEdit,nuevosDatos);
            System.out.println("---------------------------------");
            System.out.println("USUARIO ACTUALIZADO");
            System.out.println("=================================\n");
            }else{
                System.out.println("El CODIGO NO  EXISTE");
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
             System.out.println("INVENTARIO ELIMINADO CON EXITO");
             System.out.println("==============================\n");
         }else {
             System.out.println("\nNO SE ENCONTRO EL CODIGO");
         }         
        }
    }
    }

