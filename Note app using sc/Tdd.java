import java.util.Scanner;
public class Tdd{
static	Scanner s=new Scanner(System.in);
	public static void main(String[]args){
	System.out.println("NOTES");
boolean flag = true;
	while(flag)
	{
		System.out.println("Press 1 to create"+"\n"+"Press 2 to update"+"\n"+"Press 3 to delete"+"\n"+"Press 4 to exit");
		
		String check=s.nextLine();
		switch(check)
		{
				case "1":System.out.println("enter your name:");
			String name=s.nextLine();
				System.out.println("enter your age:");
			int age=Integer.parseInt(s.nextLine());	
				System.out.println("enter your adress:");
			String add=s.nextLine();
			System.out.println(name+"\n"+age+"\n"+add);
	
				break;
				
				case "2":System.out.println("enter your name:");
			String nme=s.nextLine();	
				System.out.println("enter your age:");
			int yr=Integer.parseInt(s.nextLine());		
				System.out.println("enter your adress:");
			String ad=s.nextLine();	
			System.out.println(nme+"\n"+yr+"\n"+ad);
				break;
				case "3":System.out.println("Enter the case you want to delete");
				
				String no=s.nextLine();
				
				if(no.equals(3))
				
				{
				flag=true;
				
				}
				
				break;
				
				case "4":
				String ui=s.nextLine();
				
				if(ui.equals("4"))
				{
					flag=true;
				}
				{
					flag=false;
				}
				break;
				default: System.out.println("error");
				
			
				
		}
	}		
	
	}
}