public class Car{
  String name;
  String color;
  String owner;
  
  Door[] door=new Door[4];
 
  
  Tyre[] tyre=new Tyre[4];
  
  
  Steering steering;
  
  
  public void start(){
	  
	  System.out.print("\n\ncar is starting");
	  
  }
  
  public String toString(){
	  
	  String toString="";
	  toString=toString+"\n\n \t\t"+name;
	  toString=toString+"\n\n\t\t"+color;
	  toString=toString+"\n\n\t\t"+owner;
	  
	  
	for(int i=0;i<door.length;i++){
			
		toString=toString+"\n\n"+door[i];
	}
	
	for(int i=0;i<tyre.length;i++){
		
		toString=toString+"\n\n"+tyre[i];
	}
	
	toString=toString+steering;
	
	return toString;
	
}

 public void stop(){
	  
	  System.out.print("\n\ncar is parking");
	  
  }
}
