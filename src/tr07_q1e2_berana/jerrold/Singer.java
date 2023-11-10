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
    String name;
    int noOfPerformances = 0;
    double earnings = 0;
    String favoriteSong;
    int performForAudience = 12;
    String changeFavSong = "Line Without A Hook";
    
    public Singer(String fs, int a) {
        name = "Ed Sheeran";
        performForAudience = a;
        noOfPerformances += performForAudience;
        earnings += performForAudience * 100;
        favoriteSong = fs;
    }
    
    public void ChangeSong(){
        favoriteSong = changeFavSong;
        System.out.println("Ed Sheeran's new favorite song is " + favoriteSong);
    }
}
