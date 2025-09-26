/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rostertester;

/**
 *
 * @author JanaQ
 */
public class Instructor extends Person {
    private String department;

    public Instructor(String department, String Name, String lastName, int id) {
        super(Name, lastName, id);
        this.department = department;
    }

   

   

       public void display(){
           super.display();
           System.out.println("Departmemt: "+ department);
                   

       }
       
       
    
}
