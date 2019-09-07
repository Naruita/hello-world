import java.util.*;

public class first
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines of stars you wish to show :");
		n = sc.nextInt();
		System.out.println("Here you go :");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
