import java.util.*;
public class GroupClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input roll number ");
		int roll = sc.nextInt();
		int x=1,b=2,c=3,d=4;
		int a=0;
		do
		{
			if(roll==x)
			{
				System.out.println("Sapphire ");
				a=1;
			}
			if(roll==b)
			{
				System.out.println("Pearl ");
				a=1;
			}
			if(roll==c)
			{
				System.out.println("Ruby ");
				a=1;
			}
			if(roll==d)
			{
				System.out.println("Emerald");
				a=1;
			}
			x+=4;
			b+=4;
			c+=4;
			d+=4;
		}while(a==0);
	}

}
