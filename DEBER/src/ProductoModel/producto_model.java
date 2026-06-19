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
    
    //CONSTRUCTOR
    
    public producto_model(String codigo, String nombre, String marca, double precio, int cantidad, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;   
    }
    
    //metodo get y set
    
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMarca(){
        return marca;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getStock(){
        return stock;
    }
    
    //seteters
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    
    @Override
    //mostrar productos
    public String toString(){
        return "codigo: "+ codigo 
                + "nombre: "+ nombre 
                + "marca: " + marca 
                + "precio: " + precio 
                + "cantidad: " + cantidad 
                + "stock: " + stock;
    }
}
