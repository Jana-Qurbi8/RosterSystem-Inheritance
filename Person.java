
package rostertester;


public class Person {
    String Name;
    String lastName;
    int id;

    public Person() {
    }

    public Person(String Name, String lastName, int id) {
        this.Name = Name;
        this.lastName = lastName;
        this.id = id;
    }
    
    public void display(){
        System.out.println("ID : " + id +" Name : "+ Name +" "+ lastName);
     
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
