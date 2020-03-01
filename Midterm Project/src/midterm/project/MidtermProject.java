/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.util.Date;

/**
 *
 * @author littl
 */
public class MidtermProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fulltime emp1 = new fulltime("Kevin", "J", "Slonka", 123-45-6789, new Date(86,5,5), "SL01941");
        //parttime emp2 = new parttime("Joe", "Q", "Schmoe", 987-65-4321, "SCH9832");
        //parttime emp3 = new parttime("Larry", "X", "Stooge", 555-55-5555, "STO9999");
       
    
    System.out.println("Employee 1\n----------");
    System.out.println(emp1.toString());
    
    //System.out.println("Employee 2\n----------");
    //System.out.println(emp2.toString());
    
    //System.out.println("Employee 3\n----------");
    //System.out.println(emp3.toString());
    }
    
}
