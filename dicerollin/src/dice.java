import javax.swing.*;
import java.util.Random;



public class dice
{
    private int numrolls;
    private int numsides;
    Random gen = new Random();

    public dice()
    {
        numsides = 6;
        numrolls = 0;
    }

    public dice(int sides)
    {
        numsides = sides;
        numrolls = 0;
    }

    public int Roll()
    {
        int temp = gen.nextInt(numsides) + 1 + gen.nextInt(numsides) + 1;
        numrolls++;
        return temp;
    }

    public int HRoll()
    {
        int temp = gen.nextInt(numsides) + 1;
        numrolls++;
        return temp;
    }

    public int getNumRolls()
    {
        return numrolls;
    }


    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("How many times would you like to roll the dice?");
        int num1 = Integer.parseInt(firstNumber);
        dice boi = new dice();
        for(int i = 0; i<num1;i++)
        {
            System.out.println(boi.HRoll());
            //System.out.println("yo yo yo");
        }
        //dice banther = new dice();
        //dice me = new dice(4);




        //System.out.println(banther.Roll());
        //System.out.println(me.Roll());

        //System.out.println(me.getNumRolls());
    }
}