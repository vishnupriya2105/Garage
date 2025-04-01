package com.lxisoft.calculatorproject;
import java.util.Scanner;
	public class Tdd{
	public static void main(String[] args){
						
	Scanner scanner=new Scanner(System.in);
	double result = 0;
	int operator;
		System.out.print("\n\n \t\t *****CALCULATOR*****");
		
		System.out.print("\n\n Enter the first number: ");
        result = scanner.nextDouble();
		 
		
		while (true) {
            System.out.println("\n\n 1.addition \n 2.Subtraction \n 3.Multiplication \n 4.division \n 5.exit");
            operator = scanner.nextInt();
           
            if (operator == 5) {
                break;
            }
            
            System.out.println("\n\n Enter the next number: ");
            double operand = scanner.nextDouble();
            
            switch (operator) {
                case 1:
                    result += operand;
                    break;
                case 2:
                    result -= operand;
                    break;
                case 3:
                    result *= operand;
                    break;
                case 4:
                    if (operand == 0) {
                        System.out.println("\n Error! Division by zero.");
                        continue;
                    }
                    result /= operand;
                    break;
                default:
                    System.out.println("\n\n Invalid operator!");
                    continue;
            }
            
            System.out.println("\n Result so far: " + result);
        }
        
        System.out.println("\n Final result: " + result);
        scanner.close();
    }
}
		
		






/*package com.lxisoft.calculatorproject;
import java.util.Scanner;
	public class Tdd{
	public static void main(String[] args){
						
	Scanner scanner=new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("\n\n \t\t *****CALCULATOR*****");
		
		
		boolean a =true;
		while(a)
		{
			
		   System.out.println("\n\n Select an operation:" +"\n 1.Addition"  +"\n 2.Subtraction" +"\n 3.Multiplication" +"\n 4.Division"+"\n 5.exit");
		   int choice = scanner.nextInt();
	
		  
			 double result=0;

			
				double x; 
				
				
				double y;
				 
				 
				double z ;
			
				 
				 switch(choice)
				 {
				 
					 case 1:
						System.out.print("Enter the First number:");
						x = scanner.nextDouble();
						System.out.print("Enter the second number:");
						 y = scanner.nextDouble();
						 System.out.print("Enter the third number:");
						 z = scanner.nextDouble();
						 
						result=calculator.addition(x,y,z);
						System.out.print("here is your result:"+result);
						break;
				
					case 2:
						System.out.print("Enter the First number:");
						x = scanner.nextDouble();
						System.out.print("Enter the second number:");
						 y = scanner.nextDouble();
						 System.out.print("Enter the third number:");
						 z = scanner.nextDouble();
						 
						result=calculator.subtraction(x,y,z);
					System.out.print("here is your result:"+result);
						break;
				
					case 3:
						System.out.print("Enter the First number:");
						x = scanner.nextDouble();
						System.out.print("Enter the second number:");
						 y = scanner.nextDouble();
						 System.out.print("Enter the third number:");
						 z = scanner.nextDouble();
					
						result=calculator.multiplication(x,y,z);
					System.out.print("here is your result:"+result);
						break;
				
				
					case 4:
					System.out.print("Enter the First number:");
						x = scanner.nextDouble();
						System.out.print("Enter the second number:");
						 y = scanner.nextDouble();
						 System.out.print("Enter the third number:");
						 z = scanner.nextDouble();
						 
						result=calculator.division(x,y,z);
						System.out.print("here is your result:"+result);
						break;
				
					
					
					default: 
						System.out.print("somthing went wrong");
						a = false;
						break;
				
				 }
						
	
		}
		
	}			
		
}





package com.lxisoft.calculatorproject;
import java.util.Scanner;
	public class Tdd{
	public static void main(String[] args){
						
	Scanner scanner=new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("\n\n \t\t *****CALCULATOR*****");
		
		
		
		while(true)
		{
			
		   System.out.println("\n\n Select an operation:" +"\n 1.Addition"  +"\n 2.Subtraction" +"\n 3.Multiplication" +"\n 4.Division"+"\n 5.exit");
		   int choice = scanner.nextInt();
		   if(choice != 1 &&  choice != 2 && choice !=3 && choice != 4){
				
					System.out.print("somthing went wrong");
					break;
				}
		   if(choice == 5)
			{
				break;
			}
			 double x,y,z,result=0;

			
			System.out.print("Enter the First number:");
				x = scanner.nextDouble();
				
				System.out.print("Enter the second number:");
				 y = scanner.nextDouble();
				 
				 System.out.print("Enter the third number:");
				 z = scanner.nextDouble();
				 
				 if(choice == 1)
				 {
					result=calculator.addition(x,y,z);
				}
				
				if(choice == 2)
				 {
					result=calculator.subtraction(x,y,z);
				}
				
				if(choice == 3)
				 {
					result=calculator.multiplication(x,y,z);
				}
				
					if(choice == 4)
				 {
					result=calculator.division(x,y,z);
				}
								System.out.print("here is your result:"+result);
	
	
	
		}
		
	}			
		
}*/
