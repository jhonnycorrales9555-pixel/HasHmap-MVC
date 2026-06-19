/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClienteController;

import ClienteModel.cliente_model;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pc
 */
public class cliente_controller {
    private ArrayList<cliente_model> listaClientes;
    private HashMap<String, cliente_model> mapaClientes;
    public cliente_controller() {
        listaClientes = new ArrayList<>();
        mapaClientes = new HashMap<>();
    }
    // Agregar
    public void agregarCliente(cliente_model cliente) {
        listaClientes.add(cliente);
        mapaClientes.put(cliente.getCedula(), cliente);
    }
    // mostrar
    public void mostrarClientes() {

        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (cliente_model cliente : listaClientes) {
            System.out.println(cliente);
        }
    }
    // Buscar
    public cliente_model buscarCliente(String cedula) {
        return mapaClientes.get(cedula);
    }
    // Eliminar
    public boolean eliminarCliente(String cedula) {

        cliente_model cliente = mapaClientes.get(cedula);

        if (cliente != null) {
            listaClientes.remove(cliente);
            mapaClientes.remove(cedula);
            return true;
        }

        return false;
    }
    // Actualizar teléfono
    public boolean actualizarTelefono(String cedula, String telefono) {

        cliente_model cliente = mapaClientes.get(cedula);

        if (cliente != null) {
            cliente.setTelefono(telefono);
            return true;
        }

        return false;
    }

    // Actualizar correo
    public boolean actualizarCorreo(String cedula, String correo) {

        cliente_model cliente = mapaClientes.get(cedula);

        if (cliente != null) {
            cliente.setCorreo(correo);
            return true;
        }

        return false;
    }
    // Total clientes
    public int totalClientes() {
        return listaClientes.size();
    }



}
