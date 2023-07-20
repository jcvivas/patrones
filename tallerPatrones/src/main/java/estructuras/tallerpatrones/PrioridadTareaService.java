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
public class PrioridadTareaService {
    public void asignarPrioridad(Task task, String priority) {
        task.assignPriority(priority);
        // Lógica para actualizar la prioridad de la tarea en la base de datos
        // ...
    }

    public String obtenerPrioridad(Task task) {
        return task.getPriority();
    }
}
