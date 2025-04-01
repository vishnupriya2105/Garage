import java.util.Scanner;
public class Tdd{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	Dist[] dist=new Dist[1];
	 
	

boolean rest= true;
while(rest)
{
System.out.println("\t******WELCOME TO KERALA******");

System.out.println("\n"+"\n"+"please select the district"+"\n"+"\n"+"1.Palakkad"+"\n"+"\n"+"2.Thrissur"+"\n"+"\n"+"3.Ernakulam"+"\n"+"\n"+"4.Exit");
int check=Integer.parseInt(scanner.nextLine());


	

		
		
switch(check){
	
	case 1: 
	for(int i=0; i<dist.length;i++){
		
		
		dist[i]=new Dist();
		
		
	System.out.println("\n"+"\n"+"Here are some hotels for you in palakkad");
	
			System.out.println("\n"+"\n"+"1.Noora"+"\n"+"\n"+"2.Arabia"+"\n"+"\n"+"3.London");
	dist[i].name=scanner.nextLine();
	
System.out.println("\n"+"\n"+"What do you prefer veg or non veg");
String ui= scanner.nextLine();
if(ui.equalsIgnoreCase("veg"))
	{
	System.out.println("\n"+"\n"+"Here is your veg options"+"\n"+"\n"+"1.veg biriyani"+"\n"+"\n"+"2.paneer tikka"+"\n"+"\n"+"3.manjurian");
	break;
	}
	
	if(ui.equalsIgnoreCase("non veg")){
		System.out.println("\n"+"\n"+"Here is your non veg options"+"\n"+"\n"+"1.biriyani"+"\n"+"\n"+"2.chilly chicken"+"\n"+"\n"+"3.Seafood");

		break;
		}	
	}
	break;
	
	case 2:
	for(int i=0;i<dist.length;i++)
{
	System.out.println("\n"+"\n"+"Here are some hotels for you in Thrissur");
			System.out.println("\n"+"\n"+"1.Noora"+"\n"+"\n"+"2.Arabia"+"\n"+"\n"+"3.London");
	dist[i].name=scanner.nextLine();
	
	System.out.println("\n"+"\n"+"What do you prefer veg or non veg");
String ui= scanner.nextLine();
if(ui.equals("veg"))
	{
	System.out.println("\n"+"\n"+"Here is your veg options"+"\n"+"\n"+"1.veg biriyani"+"\n"+"\n"+"2.paneer tikka"+"\n"+"\n"+"3.manjurian");
	break;
	}
	
	if(ui.equals("non veg")){
		System.out.println("\n"+"\n"+"Here is your non veg options"+"\n"+"\n"+"1.biriyani"+"\n"+"\n"+"2.chilly chicken"+"\n"+"\n"+"3.Seafood");

		break;
		}
}
	break;
	
	case 3:
	for(int i=0;i<dist.length;i++)
{
	System.out.println("\n"+"\n"+"Here are some hotels for you in Eranakulam");
			System.out.println("\n"+"\n"+"1.Noora"+"\n"+"\n"+"2.Arabia"+"\n"+"\n"+"3.London");
	dist[i].name=scanner.nextLine();
	
	System.out.println("\n"+"\n"+"What do you prefer veg or non veg");
String ui= scanner.nextLine();
if(ui.equals("veg"))
	{
	System.out.println("\n"+"\n"+"Here is your veg options"+"\n"+"\n"+"1.veg biriyani"+"\n"+"\n"+"2.paneer tikka"+"\n"+"\n"+"3.manjurian");
	break;
	}
	
	if(ui.equals("non veg")){
		System.out.println("\n"+"\n"+"Here is your non veg options"+"\n"+"\n"+"1.biriyani"+"\n"+"\n"+"2.chilly chicken"+"\n"+"\n"+"3.Seafood");

		break;
		}
	
}
	break;
	case 4:
		
			rest=false;
			
	break;
	
	default: System.out.println("\n"+"\n"+"Somthing went Wrong");
	break;
}
	


}
	
	}
}