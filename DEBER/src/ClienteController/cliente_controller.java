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
    
}
