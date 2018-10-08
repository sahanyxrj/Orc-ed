import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rand = new Random();

        int STR= rand.nextInt(10)+10;
        System.out.print("STR:"+ STR+ "\n");

        int Agility= rand.nextInt(10)+10;
        System.out.print("Agility:"+Agility+"\n");

        int INT= rand.nextInt(10)+10;
        System.out.print("INT:"+ INT+ "\n");

        int MagicMissile = 5*INT;
        System.out.print("Magic Missile Value:"+MagicMissile+"\n");
        double max=1.5;
        double min = 0.5;
        double modifier = (rand.nextDouble()*(max-min)+min);

        double damage1 = modifier*MagicMissile;
        double damage2 = modifier*MagicMissile;
        double damage3 = modifier*MagicMissile;
        double damage4 = modifier*MagicMissile;
        double damage5 = modifier*MagicMissile;
        double damage6 = modifier*MagicMissile;
        double damage7 = modifier*MagicMissile;
        double damage8 = modifier*MagicMissile;
        double damage9 = modifier*MagicMissile;
        double damage10 = modifier*MagicMissile;

        double finalDamage = damage1 +damage2+damage3+damage4+damage5+damage6+damage7+damage8+damage9+damage10;
        System.out.print("The final damage will be" + finalDamage+"\n");

        // Scenario 1
        int INT1= rand.nextInt(10)+10;
        System.out.print("The intelligence is "+INT1+"\n");
        // Set the Modifier = 1.0 (between 0.5 and 1.5)
        double finalDamage1=INT1*1.0*10*5;
        System.out.print("First scenario's damage is"+ finalDamage1+"\n ");

        //Scenario 2
        int INT2=10;
        int BaseNumber = (rand.nextInt(25)+1);
        System.out.print("The base number of the magic missile damage is"+BaseNumber+"\n");

        int BaseMagicMissile = INT2*BaseNumber;
        System.out.print("The base magic missile damage is "+BaseMagicMissile+"\n");

        double finalDamage2= 0.5*BaseMagicMissile*10;
        System.out.print("Second Scenario's damage is " +finalDamage2);




    }
}
