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
       Singer Famous = new Singer("Bad Guy", 12);
       
       System.out.println("Ed Sheeran's favorite song is " + Famous.favoriteSong + ".");
       System.out.println("He will perform to " + Famous.noOfPerformances + " people.");
       System.out.println("The performer will earn " + Famous.earnings + ".");
       Famous.ChangeSong();
       
       
       
       
       
   }
   
   
}
