import java.util.Scanner;

public class Pattern {
	int n;
public void display()
{
	System.out.println("enter the row number");
	Scanner sq=new Scanner(System.in);
	n=sq.nextInt();
	for(int i=0;i<n;++i)
	{
		for(int j=0;j<n;++j)
		{
			if(i==j || j==(n-i-1))
				System.out.print("x");
			else
				System.out.print(" ");
		}
		System.out.print("\n");	
	}
}
public static void main(String args[])
{
	Pattern p=new Pattern();
	p.display();
}
}
