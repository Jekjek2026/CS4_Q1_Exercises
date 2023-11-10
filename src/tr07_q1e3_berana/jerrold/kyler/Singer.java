/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tr07_q1ex02;

/**
 *
 * @author Jerrold Berana
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private String favoriteSong;
    private int performForAudience;
    private String changeFavSong = "Line Without A Hook";
    private static int totalPerformances;
    
    public Singer(String n, int N, double e, String fs, int p) {
        name = n;
        noOfPerformances = N;
        earnings = e;
        favoriteSong = fs;
        performForAudience = p;
    }
    
    public void ChangeSong(){
        favoriteSong = changeFavSong;
        System.out.println("Ed Sheeran's new favorite song is " + favoriteSong);
    }
    
    public String getName() {
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public String getFavoritesong(){
        return favoriteSong;
    }
    
    public int getPerformforaudience(){
        return performForAudience;
    }
    
    public String getChangefavsong(){
        return changeFavSong;
    }
    
    public static int totalPerformances(int a){
        totalPerformances = a;
        return totalPerformances;
    }
    
    public void performersforAudience(int b, double c){
        System.out.println("Ed Sheeran and Billie Eilish together will perform to " + b + " people.");
        System.out.println("Each will earn " + c + ".");
    }
}
