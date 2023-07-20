/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.tallerpatrones;

import Strategy.TaskViewStrategy;
import FactoryMethod.Task;
import Observer.NotificationChannel;
import Observer.NotificationCenter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TaskManager {
    private TareaService tareaService;
    private PrioridadTareaService prioridadTareaService;
    private FechaService fechaService;
    private EstadoService estadoService;
    private TaskViewStrategy taskViewStrategy;
    private NotificationCenter notificationCenter;

    public Task createTask(String title, String priority, Date dueDate) {
        return tareaService.crearTarea(title, priority, dueDate);
    }

    public void setTaskViewStrategy(TaskViewStrategy strategy) {
        this.taskViewStrategy = strategy;
    }

    public void setNotificationChannels(List<NotificationChannel> channels) {
        notificationCenter = new NotificationCenter(channels);
    }
}
