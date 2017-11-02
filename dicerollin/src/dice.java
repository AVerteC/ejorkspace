import java.util.Random;
import java.util.Scanner;


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

    public int getNumRolls()
    {
        return numrolls;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many rolls?");
        int noroll = sc.nextInt();
        for(int i = 0; i<noroll;i++)
        {}
        //dice banther = new dice();
        //dice me = new dice(4);




        //System.out.println(banther.Roll());
        //System.out.println(me.Roll());

        //System.out.println(me.getNumRolls());
    }
}