// Java Program to illustrate the
// Concept of Association
 
// Importing required classes
import java.io.*;
 
// Class 1
// Bank class
class Bank {
 
    // Attribures of bank
    private String name;
 
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
}
 