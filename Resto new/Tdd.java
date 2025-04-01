import java.util.Scanner;
public class Tdd{
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	
		System.out.print("\n number of Districts : ");
		int number=Integer.parseInt(scanner.nextLine());
		District[] district=new District[number];
	
	for(int i=0;i<number;i++)
	{
		district[i]=new District();
	
	
		System.out.print("\n enter the district name:");
		district[i].name=scanner.next();
		scanner.nextLine();
	
		district[i].restaurant=new Restaurant();
		
		System.out.print("\n enter the Restaurant name:");
		district[i].restaurant.name=scanner.nextLine();
		
		System.out.print("\n Enter the number of dishes you want in the menu:");
		int numbers=Integer.parseInt(scanner.nextLine());
	
		for(int j=0;i<numbers;j++)
	{
		
		district[i].restaurant.Menu[j]=new Menu();
	
		
		System.out.print("\n Enter the dish:");
		district[i].restaurant.Menu[j].isNonVeg=Boolean.parseBoolean(scanner.nextLine());
		
		System.out.print("\n is this non veg: true/false:-");
		boolean isNonVeg=scanner.nextBoolean();
		
		
		if(isNonVeg==true)
		{
			System.out.print("\n your item added to non veg menu :)");
			district[i].restaurant.Menu[j].isNonVeg=true;
			break;
		}
		
		
		{
			System.out.print("\n your item added to veg menu :)");
			district[i].restaurant.Menu[j].isNonVeg=false;
			break;
		}
	
		
	}

	/*for(int k = 0;k<district.length;k++)
	{
		System.out.println(district[k]);
	}*/
}
}
}