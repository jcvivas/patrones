/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.tallerpatrones;

import FactoryMethod.Task;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class FechaService {
    public void asignarFecha(Task task, Date dueDate) {
        task.assignDueDate(dueDate);
        // Lógica para actualizar la fecha de vencimiento de la tarea en la base de datos
        // ...
    }

    public Date obtenerFecha(Task task) {
        return task.getDueDate();
    }
}
