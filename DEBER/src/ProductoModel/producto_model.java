/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductoModel;

/**
 *
 * @author USER
 */
public class producto_model {
    //atributos
    public String codigo;
    public String nombre;
    public String marca;
    public double precio;
    public int cantidad;
    public int stock;
    
    //constructor
    
    public producto_model(String codigo, String nombre, String marca, double precio, int cantidad, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;   
    }
}
