/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Updating somthing
 * May, 21, 2019
 */
package studentdemo;
import java.util.Scanner;

/**
 *
 * @author Mamou,2019
 */
public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        
        int id;
        String name;
       
        //Creating array class
        Student[] stud = new Student[5];
       
        
        stud[0].setName("sam");
        stud[1].setName("cal");
        stud[2].setName("lulia");
        stud[3].setName("naro");
        stud[4].setName("malo");
        
        
        for (int i = 0; i <stud.length; i++) {
            
            
            System.out.println("Enter studnet id"); 
        }
        
        
    }
    
}
