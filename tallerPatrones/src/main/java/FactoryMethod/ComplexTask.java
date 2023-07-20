/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.Task;
import Observer.Observer;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ComplexTask extends Task{
    public ComplexTask(String title, String priority, Date dueDate) {
    }

    @Override
    public void attach(Observer observer) {
        // Implementación específica para ComplexTask
    }

    @Override
    public void detach(Observer observer) {
        // Implementación específica para ComplexTask
    }

    @Override
    public void notifyObservers() {
        // Implementación específica para ComplexTask
    }
}
