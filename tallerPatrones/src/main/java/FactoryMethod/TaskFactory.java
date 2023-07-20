/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.Task;
import java.util.Date;

/**
 *
 * @author DELL
 */
public interface TaskFactory {
    Task createTask(String title, String priority, Date dueDate);
}
