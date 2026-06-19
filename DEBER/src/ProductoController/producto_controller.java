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

    public void agregar(producto_model producto) {
        inventario.put(producto.getCodigo(), producto);
    }

    public HashMap<String, producto_model> listar() {
        return inventario;
    }

    public void eliminar(String codigo) {
        inventario.remove(codigo);
    }

    public boolean existe(String codigo) {
        return inventario.containsKey(codigo);
    }

    public producto_model buscar(String codigo) {
        return inventario.get(codigo);
    }
}

