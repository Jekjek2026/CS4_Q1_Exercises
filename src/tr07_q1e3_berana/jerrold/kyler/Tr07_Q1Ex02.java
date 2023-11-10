/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tr07_q1ex02;

/**
 *
 * @author Jerrold Berana
 */
public class Tr07_Q1Ex02 {
   public static void main(String[] args) {
       Location Bulacan = new Location("Philippine Arena", 2500, 800);
       Location Manila = new Location("Resorts World Manila", 1700, 1000);
       Location Calamba = new Location("Jose Rizal Colliseum", 1500, 900);
       Song Billie = new Song("Bad Guy", 2019, "Female");
       Song Ricky = new Song("Line Without A Hook", 2016, "Male");
       Singer Famous1 = new Singer("Billie Eilish", 4, 1200,"Bad Guy", 12);
       Singer Famous2 = new Singer("Ricky Montgomery", 3, 1500,"Line Without A Hook", 10);
       
       int totalperformances = Famous1.getNoOfPerformances() + Famous2.getNoOfPerformances();
       System.out.println(Famous1.totalPerformances(totalperformances));
       
       int combinedAudience = Famous1.getPerformforaudience() + Famous2.getPerformforaudience();
       double combinedEarnings = Famous1.getEarnings() + Famous2.getEarnings();
       Famous1.performersforAudience(combinedAudience, combinedEarnings);
       
       
       
   }
   
   
}
