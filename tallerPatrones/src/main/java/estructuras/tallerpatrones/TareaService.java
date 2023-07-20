/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.tallerpatrones;

import FactoryMethod.ComplexTaskFactory;
import FactoryMethod.SimpleTaskFactory;
import FactoryMethod.TaskFactory;
import FactoryMethod.Task;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class TareaService {
    public Task crearTarea(String title, String priority, Date dueDate) {
        TaskFactory taskFactory;
        if (priority.equals("Simple")) {
            taskFactory = new SimpleTaskFactory();
        } else {
            taskFactory = new ComplexTaskFactory();
        }
        return taskFactory.createTask(title, priority, dueDate);
    }

    public Task obtenerTarea(String id) {
        // Lógica para obtener una tarea de la base de datos
        // ...
        return null;
    }

    public void actualizarTarea(Task task) {
        // Lógica para actualizar una tarea en la base de datos
        // ...
    }

    public void eliminarTarea(Task task) {
        // Lógica para eliminar una tarea de la base de datos
        // ...
    }
}
