/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import FactoryMethod.Task;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NotificationCenter {
    private List<NotificationChannel> channels;

    public NotificationCenter(List<NotificationChannel> channels) {
        this.channels = channels;
    }

    public void attach(NotificationChannel channel) {
        channels.add(channel);
    }

    public void detach(NotificationChannel channel) {
        channels.remove(channel);
    }

    public void notifyChannels(Task task) {
        for (NotificationChannel channel : channels) {
            channel.notifyUser("La tarea " + task.getTitle() + " está próxima a vencer o se ha completado.");
        }
    }
}
