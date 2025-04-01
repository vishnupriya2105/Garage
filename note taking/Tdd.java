import java.util.Scanner;
public class Tdd{
	public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);	
	Note[] note=new Note[5];
	boolean flag=true;
	while(flag){
		
		System.out.println("Press 1 to create"+"\n"+"Press 2 to show"+"\n"+"Press 3 to update"+"\n"+"Press 4 to delete"+"\n"+"Press 5 to exit");
		int check=Integer.parseInt(scanner.nextLine());
		
		switch(check){
			case 1:
	for(int i=0;i<note.length;i++)
	{
		note[i]=new Note();
		System.out.println("      NOTE TAKING APP      ");
	
		System.out.println("enter id no:");
		note[i].idno=Integer.parseInt(scanner.nextLine());
		System.out.println("Author:");
		note[i].author= scanner.nextLine();
		System.out.println("Subject:");
		note[i].sub=scanner.nextLine();
		System.out.println("notes:");
		note[i].notes=scanner.nextLine();
		System.out.println("do you want to continue: yes or no");
		String yon=scanner.nextLine();
		if(yon.equals("no"))
		{
			break;
		}
	}
	break;
	case 2:
	for(int i=0;i<note.length;i++)
	{
		if(note[i]!=null){
	 System.out.println(note[i].idno+"\n"+note[i].author+"\n"+note[i].sub+"\n"+note[i].notes);
		}
	}
		break; 
		case 3:
		
			System.out.println("which note you want to update");
			String updt=scanner.nextLine();
			for(int i=0;i<note.length;i++)
			{
				if(note[i]!=null && note[i].author.equals(updt))
				{
					System.out.println("enter new id no:");
		note[i].idno=Integer.parseInt(scanner.nextLine());
		System.out.println("enter new Author:");
		note[i].author= scanner.nextLine();
		System.out.println(" enter new Subject:");
		note[i].sub=scanner.nextLine();
		System.out.println("enter new notes:");
		note[i].notes=scanner.nextLine();
				}
			}break;
			case 4:
			System.out.println("white note you want to delete");
			String del=scanner.nextLine();
			for(int i=0;i<note.length;i++)
			{
			   if(note[i]!=null && note[i].author.equals(del))
			   {
				  note[i]=null; 
				System.out.println("Successfully Removed");  
			   }
			   
			   
			}
			break;
			
			case 5:
				String ui=scanner.nextLine();
				
				if(ui.equals(5))
				{
					flag=true;
				}
				{
					flag=false;
				}
				break;
			default: System.out.println("Something went Wrong: ");
			break;
			
		}
	}
	
	}
	
	
}