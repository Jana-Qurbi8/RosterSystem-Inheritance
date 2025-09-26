/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rostertester;

/**
 *
 * @author JanaQ
 */
public class Stundent extends Person {
    private String major;

    public Stundent(String major, String Name, String lastName, int id) {
        super(Name, lastName, id);
        this.major = major;
    }
    
    
     public void display(){
         super.display();
         System.out.println(" major: "+ major);
     }
}
