/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.Old;

/**
 *
 * @author aaron
 */
public class HighScoreObject {
    String name, score;
    public HighScoreObject(String n, String s)
    {
        name = n;
        score = s;
    }
    
    public String print()
    {
        return name + ": " + score;
    }
    
    public String getName()
    {
        return name;
    }
    public String getScore()
    {
        return score;
    }
    
}
