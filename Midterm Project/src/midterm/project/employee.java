/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author littl
 */
public class employee {
    
    //variables
    private String fname, mname, lname, employeeid;
    private int socialsecuritynumber;
    private Date dob;
    
    //getters&setters
    public void setFname(String f) {fname = f;}
    public void setMname(String m) {mname = m;}
    public void setLname(String l) {lname = l;}
    public void setSocialSecurityNumber(int s) {socialsecuritynumber = s;}
    public void setEmployeeID(String e) {employeeid = e;}
    public void setDOB(Date d) {dob = d;}
    public void setName(String f, String m, String l)
    {
        setFname(f);
        setMname(m);
        setLname(l);
    }

    public String getFname() {return fname;}
    public String getMname() {return mname;}
    public String getLname() {return lname;}
    public int getSocialSecurityNumber() {return socialsecuritynumber;}
    public String getEmployeeID() {return employeeid;}
    public Date getDOB() {return dob;}
    public String getName()
    {
        return getLname() + ", " + getFname() + " " + getMname();
    }
    
    //no-arg constructor for employees
    public employee()
    {
        setName("","","");
        setSocialSecurityNumber(0);
        setDOB(new Date());
    }
    
    //specific constructor for employees
    public employee(String f, String m, String l, int s, Date d)
    {
        setName(f, m, l);
        setSocialSecurityNumber(s);
        setDOB(d);
    }
    
    //code I made for creating employee birthdates
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(dob);
        
    //tostring
    @Override
    public String toString()
    {
        return getName() + "\n" + Integer.toString(socialsecuritynumber) + "\n" + date;
    }
    
    


}
