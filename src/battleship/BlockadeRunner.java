/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author anhen3335
 */ 
public class BlockadeRunner extends Ship{
    private int health;
    private int segments;
    private int damage; 
    private int crit;
    private String Ship;
    
    public BlockadeRunner(){
      crit = (int) (Math.random() * 3);
      health = 60;
      damage = 10;
      segments = 1;
      Ship = "BlockadeRunner";

    }
       public int getCrit (){
           return crit;
       }
    public int getDamage(){
        return damage;
    }
         public String getShip (){
           return Ship;
       }
      public int getHealth (){
        return health;
       }
        public int getSegments (){
        return segments;
       }
}