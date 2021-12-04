// Java Program to illustrate the
// Concept of Association
 
// Importing required classes
import java.io.*;
 
// Class 2
// Employee class
class Employee {
    // Attribures of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refwrs to current insytance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}