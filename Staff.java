/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psychiatric;

import java.sql.*;

/**
 *
 * @author Elvis
 */
public class Staff extends PsychiatricConnection {
    
    private String staffId;
    private String staffDob;
    private String staffLastName;
    private String staffFirstName;
    private String staffSocialSecurity;
    private String staffPhoneNumber;
    private String staffAddress;
    private String degreeNumber;
    
    //In this constructor, I want you to be able to retrieve all the data the the doctor
    //who inputted thier ID into the constructor, remember to make getters for all of these values too
    //When someone clicks the login in button, it should first check the password and then if the password is right,
    //feel the staff ID into this constructor so we can have all the fields filled in and easily aviable if we want to
    //display that info on another part of the GUI
    public Staff(String StaffID){
        PsychiatricConnection staffPrep = new PsychiatricConnection();
        try{
        staffDob = (staffPrep.SelectStatement("staff_dob", "staff")).getString(1);
    }catch (SQLException ex) {
            System.out.println("Error:" + ex);
    }
    }
    
    public static void main(String[] args){
        
        //Staff staff1 = new Staff();
        
        //staff1.
    }
}
