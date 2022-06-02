/* STUDENT ID: 991662745
Name:Mohammedsaheed Vhora
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author 
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] s1 = new String[7];// array of strings for the names of the card
        int a1[] = new int[7];//integer array
        Card[] magicHand = new Card[7]; //Object Array
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setallValue(c1.generateRandomValue());
            c1.setallSuits(c1.generateRandomSuit());
            magicHand[i]=c1;
        }
        int c=0;
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getallSuits() + " " + magicHand1.getallValue());
            s1[c]=magicHand1.getallSuits();//storing the names of cards into array of strings
            a1[c]=magicHand1.getallValue();//storing the values
            c++;
        }
        System.out.println("Please choose the suit:\n1: Hearts\n2: Diamonds\n3: Spades\n4: Clubs");
        int suit = sc.nextInt();//input
        String [] SUITS = { "hearts","diamonds","spades","clubs"};
        System.out.println("Please choose the value (1 to 12)");
        int value = sc.nextInt();//input
        
        int count = 0;
        for (int j=0;j<7;j++) {
            if(SUITS[suit-1].equals(s1[j]) && value == a1[j])
            { 
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Great Work :)");
        }
        else
        {
            System.out.println("Sorry, no match");
        }
    }
    
}
