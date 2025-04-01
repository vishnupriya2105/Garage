import java.util.Scanner;
public class Tdd{
	
	static Scanner sc=new Scanner(System.in);
	 
	
	public static void main(String[]args){
		
	
    boolean flag = true;
	while(flag)
	{
		
		System.out.println("press 1 to say hi");
		System.out.println("press 2 to say hloo");
		System.out.println("press 3 y to continue n to exit");
		
		String check = sc.nextLine();
		switch(check)
		{
			
			case "1":System.out.println("hi");
			break;
			
			case "2":System.out.println("hloo");
			break;
			
			case "3":
			String ui=sc.nextLine();
			
			
			if(ui.equals("y"))
			{
				flag=true;	
			}
			
			else{
				flag=false;
				
			}
			
			break;
			
			
			default: System.out.println("error");
			
			
			
		}
		
		
	}
	
}
}


	
	
	
/*System.out.println("enter the car name you want:");
String name=sc.nextLine();

System.out.println("enter the car color you want:");
String color=sc.nextLine();

System.out.println("enter your name:");
String owner=sc.nextLine();

System.out.println("enter your number");
int no=Integer.parseInt(sc.nextLine());


System.out.println("enter your address:");
String addresss = sc.nextLine();*/
	
	

	
	
