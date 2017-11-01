import java.util.*;


public class LotteryPrinter 
	{
	
	public static void main(String [] args)
	{
	Random gen = new Random();
	
	int ns;
	int i2;
	int i3;
	int i4;
	int i5;
	int i6,
	
	ns = 1 + gen.nextInt(49);
	i2 = 1 + gen.nextInt(49);
	i3 = 1 + gen.nextInt(49);
	i4 = 1 + gen.nextInt(49);
	i5 = 1 + gen.nextInt(49);
	i6 = 1 + gen.nextInt(49);
	System.out.println("Play this combination");
	}
}