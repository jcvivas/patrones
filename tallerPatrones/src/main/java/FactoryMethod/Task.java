/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import Observer.Observer;
import java.util.Date;

/**
 *
 * @author DELL
 */
public abstract class Task {
    private String id;
    private String title;
    private String priority;
    private Date dueDate;
    private String status;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void assignPriority(String priority) {
        this.priority = priority;
    }

    public void assignDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void changeStatus(String status) {
        this.status = status;
    }

    public void update() {
        // Lógica para actualizar la tarea en la base de datos
    }

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifyObservers(); 
}
