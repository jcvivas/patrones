/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.tallerpatrones;

import FactoryMethod.Task;

/**
 *
 * @author DELL
 */
public class EstadoService {
    public void cambiarEstado(Task task, String status) {
        task.changeStatus(status);
        // Lógica para actualizar el estado de la tarea en la base de datos
        // ...
    }

    public String obtenerEstado(Task task) {
        return task.getStatus();
    }
}
