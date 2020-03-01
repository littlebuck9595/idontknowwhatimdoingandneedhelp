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
public class fulltime extends employee {
    
    private static String designation = "Full Time";
    
    public String getDesignation() {return designation;}
    
    //no arg constructor
    public fulltime()
    {
        super();
        setEmployeeID("");
    }

    //specific constructor
    public fulltime(String f, String m, String l, int s, Date d, String e)
    {
        super(f, m, l, s, d);
        setEmployeeID(e);
    }
    
    //override statement
    @Override
    public String toString()
    {
        return super.toString() + "\n" + getDesignation() + "\n" + getEmployeeID();
    }
    
}
