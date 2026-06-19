/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductoController;

import ProductoModel.producto_model;
import java.util.HashMap;

/**
 *
 * @author USER
 */
public class producto_controller {
    public HashMap<String, producto_model> inventario = new HashMap<>();

    // AGREGAR
    public void agregar(producto_model producto) {
        inventario.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado con exito");
    }

    // LISTAR
    public void listarProducto() {

        if (inventario.isEmpty()) {
            System.out.println("No existen productos registrados");
            return;
        }

        for (producto_model producto : inventario.values()) {
            System.out.println(producto);
            System.out.println("----------------------");
        }
    }

    // BUSCAR
    public producto_model buscarProducto(String codigo) {

        if (inventario.containsKey(codigo)) {
            return inventario.get(codigo);
        }

        return null;
    }

    // ELIMINAR
    public boolean eliminarProducto(String codigo) {

        producto_model producto = buscarProducto(codigo);

        if (producto != null) {
            inventario.remove(codigo);
            return true;
        }

        return false;
    }

    // ACTUALIZAR
    public boolean actualizarProducto(String codigo,
            String nombre,
            double precio,
            int cantidad,
            int stock) {

        producto_model producto = buscarProducto(codigo);

        if (producto != null) {

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            producto.setStock(stock);

            return true;
        }

        return false;
    }
}