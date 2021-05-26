package Project;
import java.util.Scanner;

import com.mongodb.DB;

import Project.*;

public class Main {

	public static void main(String[] args)
	{
		MainPage m=new MainPage();
		m.frontpage();
		int c1,c2;
		Choices c=new Choices();
		do
		{
			c.choice();
			Scanner sc= new Scanner(System.in);      
			System.out.print("Enter the choice - ");  
			c1= sc.nextInt();
			switch(c1)
			{
			case 1:	c.choice1();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view1_1();
							break;
					case 2: Views v1=new Views();
							v1.view1_2();
							break;
					case 3: Updates u=new Updates();
							u.update1();
							break;
					case 4: Remove r=new Remove();
							r.remove1();
							break;
					case 5: Search s=new Search();
							s.search1();
							break;
					case 6: Add a=new Add();
							a.add1_1();
							a.add1_2();
							break;
					case 7: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 2:	c.choice2();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view2();
							break;
					case 2: Updates u=new Updates();
							u.update2();
							break;
					case 3: Remove r=new Remove();
							r.remove2();
							break;
					case 4: Search s=new Search();
							s.search2();
							break;
					case 5: Add a=new Add();
							a.add2();
							break;
					case 6: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 3:	c.choice3();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view3();
							break;
					case 2: Updates u=new Updates();
							u.update3();
							break;
					case 3: Remove r=new Remove();
							r.remove3();
							break;
					case 4: Search s=new Search();
							s.search3();
							break;
					case 5: Add a=new Add();
							a.add3();
							break;
					case 6: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 4:	c.choice4();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view4();
							break;
					case 2: Updates u=new Updates();
							u.update4();
							break;
					case 3: Remove r=new Remove();
							r.remove4();
							break;
					case 4: Search s=new Search();
							s.search4();
							break;
					case 5: Add a=new Add();
							a.add4();
							break;
					case 6: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 5:	c.choice5();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view5();
							break;
					case 2: Updates u=new Updates();
							u.update5();
							break;
					case 3: Remove r=new Remove();
							r.remove5();
							break;
					case 4: Search s=new Search();
							s.search5();
							break;
					case 5: Add a=new Add();
							a.add5();
							break;
					case 6: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 6:	c.choice6();
					System.out.println("Enter the choice: ");
					c2=sc.nextInt();
					switch(c2)
					{
					case 1: Views v=new Views();
							v.view6();
							break;
					case 2: Updates u=new Updates();
							u.update6();
							break;
					case 3: Remove r=new Remove();
							r.remove6();
							break;
					case 4: Search s=new Search();
							s.search6();
							break;
					case 5: Add a=new Add();
							a.add2();
							break;
					case 6: break;
					default: System.out.println("Error !!! Choose given option...");
					}
					break;
			case 7:	System.out.println("Exited....\nThank You for using Cargo Managemnt System\n PLEASE VISIT AGAIN");
					break;
			default: System.out.println("Error !!! Choose given option...");
			}
		}while(c1!=7);
		
	

	}

}
