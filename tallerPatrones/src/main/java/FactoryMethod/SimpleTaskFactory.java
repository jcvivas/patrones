/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.SimpleTask;
import FactoryMethod.TaskFactory;
import FactoryMethod.Task;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class SimpleTaskFactory implements TaskFactory{
    public Task createTask(String title, String priority, Date dueDate) {
        return new SimpleTask(title, priority, dueDate);
    }
}
