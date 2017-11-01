import java.util.*;


public class LotteryPrinter 
	{
	
	public static void main(String [] args)
	{
	Random gen = new Random();
	
	int i1 = 1 + gen.nextInt(49);
	int i2 = 1 + gen.nextInt(49);
	int i3 = 1 + gen.nextInt(49);
	int i4 = 1 + gen.nextInt(49);
	int i5 = 1 + gen.nextInt(49);
	int i6 = 1 + gen.nextInt(49);
	System.out.println(String.format("Play this combination--it'll make you rich! %d %d %d %d %d %d", i1, i2, i3, i4, i5, i6));
	}
}