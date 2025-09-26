
package rostertester;

/**
 *
 * @author JanaQ
 */
public class RosterTester {

    
    public static void main(String[] args) {
        Stundent s1 =  new Stundent("Physics","Alice","Smith",205);
        Instructor i1 = new Instructor("Arts & Sciences","Bob","Dylan",310);
        
        s1.display();
        System.out.println("-----------------");
        i1.display();
    }
    
}
