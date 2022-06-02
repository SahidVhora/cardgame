/*STUDENT ID: 991662745
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * @author Mohammedsaheed Vhora
 */
public class Card 
{
    private int val;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getallValue() {
        return val;
    }

    /**
     * @param value the value to set
     */
    public void setallValue(int val) {
        this.val = val;
    }

    /**
     * @return the suits
     */
    public String getallSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setallSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits

    int generateRandomValue() {
        return (int)(Math.random()*(12-1+1)+1);
    }

    String generateRandomSuit() {
        return SUITS[(int)(Math.random()*(3-0+1)+0)];
    }
    
}
