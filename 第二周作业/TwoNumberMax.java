import java.util.Scanner;
public class TwoNumberMax {
	static int getMax(int a,int b)
	{
		return  (((a + b) +Math.abs(a - b)) /2 );        //返回两个数中最大数的算法
	}
    public static void main(String [] args)
    {
    	Scanner s =new  Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
    	System.out.println(getMax(a,b));
    }
    
}
