package 
        javaapplication1;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication1    
{
    
    
 public static int playGame(Scanner input, int playerHealth, int opponentHealth) {
        while (playerHealth > 0 && opponentHealth > 0) {
            System.out.println("Player health: " + playerHealth);
            System.out.println("Opponent health: " + opponentHealth);
            System.out.println("Select your move: 1) Punch 2) Kick 3) Block");
            int playerMove = input.nextInt();
            int opponentMove = (int) (Math.random() * 3 + 1);
            switch (playerMove) {
                case 1:
                    if (opponentMove == 3) {
                        System.out.println("Opponent blocked your punch.");
                    } else {
                        System.out.println("You punched the opponent.");
                        opponentHealth -= 10;
                    }
                    break;
                case 2:
                    if (opponentMove == 3) {
                        System.out.println("Opponent blocked your kick.");
                    } else {
                        System.out.println("You kicked the opponent.");
                        opponentHealth -= 20;
                    }
                    break;
                case 3:
                    System.out.println("You blocked.");
                    break;
                default:
                    System.out.println("Invalid move.");
            }
            if (opponentMove == 1) {
                if (playerMove == 3) {
                    System.out.println("You blocked opponent's punch.");
                } else {
                    System.out.println("Opponent punched you.");
                    playerHealth -= 10;
                }
            } else if (opponentMove == 2) {
                if (playerMove == 3) {
                    System.out.println("You blocked opponent's kick.");
                } else {
                    System.out.println("Opponent kicked you.");
                    playerHealth -= 20;
                }
            } else {
                System.out.println("Opponent blocked.");
            }
        }
        if (playerHealth <= 0) {
            System.out.println("You lost.");
            int resultat = 5;
            return resultat;
        } else {
            System.out.println("You won.");
            int resultat = 6;
            return resultat;
        }
    }

   
   public static void main(String[] args)
   {
       Scanner helium1 = new Scanner(System.in);
       System.out.println("välj ett läge att spela 1.turnering 2.oändlig");
         int läge = helium1.nextInt();
       
       
       
       if (läge == 1) {
           Scanner helium = new Scanner(System.in);
    System.out.println("Du valde turnering");
    System.out.println("Välj ditt namn");
    String hink2 = helium.nextLine();
    String[] namn = {"James", "Robert", "John", "Michael", "David","William","Joseph","Thomas","Charles","Christopher","Matthew","Anthony","Mark","Donald"};
 
     System.out.println("Välj hur många pers(jämt)");
    int hink3 = helium.nextInt();
    if (hink3%2 == 0){
    String bracket[]  = new String[hink3+2];
        for (int i = (hink3+1); i >= 0; i--) {
        double num = (Math.round(Math.random()*10));
        int value1 = (int)Math.round(num);
        bracket[i] = namn[value1];
            System.out.println(bracket[i]);
            
        }
        System.out.println("------------------------");
        String giggidy[]  = new String[bracket.length+1];
        int hink7 = (bracket.length);
        
        for (int i = (hink7-1); i >= 1; i--){
            giggidy[i] = bracket[i];
            giggidy[0] = hink2;
            
        }
        System.out.println("turneringen är:");
        for(int f = hink3-1; f>=0; f--){
            System.out.println(giggidy[f]);
        }
        
        int mängd_matcher = ((giggidy.length-3)/2);
        System.out.println(mängd_matcher);
        
         int hel = 1;
        
            
            for (int i = mängd_matcher; i > 0; i--) {
               
                System.out.println("opponent:"+hel);
                 Scanner input = new Scanner(System.in);
        int playerHealth = 100;
        int opponentHealth = 100;
        int resultat = playGame(input, playerHealth, opponentHealth);
        hel += 1;
       
        
            if (resultat == 5) {
                System.out.println("spel slut");
                break;
            }
            else{
            continue;
            }
            }
           
           }
       }
       else if (läge == 2){
           System.out.println("välj ditt namn");
           helium1.nextLine();
            String hink2 = helium1.nextLine();
            int hel = 1;
        while(true){
        System.out.println(hink2 + " vs opponent"+hel);
                 Scanner input = new Scanner(System.in);
        int playerHealth = 100;
        int opponentHealth = 100;
        int resultat = playGame(input, playerHealth, opponentHealth);
        hel += 1;
       
        
            if (resultat == 5) {
                System.out.println("spel slut");
                break;
            }
            else{
            continue;
            }
         }
       }
       else{
       }
       

        
        
        }
    
       
      
     }
   
    

   
 
    

    


    
            


    