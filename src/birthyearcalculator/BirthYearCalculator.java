/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Kofi Osel
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a birth year:");
        String birth = scan.nextLine();
        
        String cent = birth.substring(0,2);
        int century = Integer.parseInt(cent) + 1;
        String ded = birth.substring(2,3);
        int decade = Integer.parseInt(ded) *10;
  
        System.out.printf("%-10s: %s\n","Birth Year",birth);
        System.out.printf("%-10s: %-15d\n","Century",century);
        System.out.printf("%-10s: %-15d\n","Decade",decade);
            
    }
    
}
